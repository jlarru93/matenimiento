package pe.com.banbif.correo.eletronico.service.business;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import io.swagger.model.Correo;
import io.swagger.model.Destinatario;
import io.swagger.model.Remetente;
import io.swagger.model.TemplateCorreo;
import pe.com.banbif.correo.eletronico.service.data.entity.Email;
import pe.com.banbif.correo.eletronico.service.data.repository.EmailRepository;

@Service
public class EmailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

    private final static String INVALID_EMAIL_ERROR_MESSAGE = "Invalid email information, it must have to address, " +
            "template identification and template variables";
    private final static String TEMPLATE_GENERATION_ERROR = "Unexpected error on template generation.";

    private final EmailRepository repository;
    private final TemplateService templateService;
    private final JavaMailSender javaMailSender;
    private final SendLogService sendLogService;
    private final ErrorLogService errorLogService;

    public EmailService(
            final EmailRepository repository,
            final TemplateService templateService,
            final JavaMailSender javaMailSender,
            final SendLogService sendLogService,
            final ErrorLogService errorLogService
    ) {
        this.repository = repository;
        this.templateService = templateService;
        this.javaMailSender = javaMailSender;
        this.sendLogService = sendLogService;
        this.errorLogService = errorLogService;
    }

    @Scheduled(fixedDelay = 10000L)
    public void processList() {
        int page = 0;
        int count = 10;
        Page<Email> emailsPages = null;

        do {
            emailsPages = this.repository.findAll(PageRequest.of(page, count));
            this.repository.deleteAll(emailsPages.getContent());
            emailsPages.forEach(email -> {
                try {
                    sendMail(email);
                    sendLogService.log(email);
                } catch (Exception ex) {
                    errorLogService.log(ex, email);
                }
            });
            page++;
        } while (emailsPages.hasNext());
    }

    private void sendMail(Email email) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setFrom(email.getFrom());
        
        String[] split = email.getTo().split(";");
        helper.setTo(split[split.length-1]);
        if(split.length > 1) {
        	helper.setBcc(Arrays.copyOfRange(split, 0, split.length-1));
        }
        
        helper.setSubject(email.getSubject());
        helper.setText(email.getTemplateCorreo(), true);

        if (Objects.nonNull(email.getBcc()) && !email.getBcc().isEmpty()) {
            helper.setBcc(email.getBcc().toArray(new String[0]));
        }

        javaMailSender.send(message);
    }


    public Correo queueEmail(Correo correo) {
        if (!isValid(correo)) {
            throw new RuntimeException(INVALID_EMAIL_ERROR_MESSAGE);
        }

        LOGGER.info("Email Valido");
        
        Optional<TemplateCorreo> templateCorreo = templateService.getTemplate(correo);

        LOGGER.info("templateCorreo Pego");

        String contenido = templateService.getContent(correo, templateCorreo.get());

        LOGGER.info("contenido Pego");

        if (StringUtils.isEmpty(contenido)) {
            throw new RuntimeException(TEMPLATE_GENERATION_ERROR);
        }

        LOGGER.info("contenido nao branco");
        
        if(templateCorreo.get().isEnvioCorreoCliente()) {
        	String enderecoCorreo = templateCorreo.get().getDestinatario().getEnderecoCorreo();
        	enderecoCorreo = concatEmailCliente(correo, enderecoCorreo);
        	templateCorreo.get().getDestinatario().setEnderecoCorreo(enderecoCorreo);
        }

        LOGGER.info("envio cliente");
        
        correo.setTemplateCorreo(templateCorreo.get());
        correo.getTemplateCorreo().setContenido(contenido);

        LOGGER.info("envio cliente");

        return fromEmail(this.repository.save(toEmail(correo)));
    }

	private String concatEmailCliente(Correo correo, String enderecoCorreo) {
		if(!StringUtils.isBlank(enderecoCorreo)) {
			enderecoCorreo+= ";";
		}
		String mails = enderecoCorreo.concat(correo.getTemplateCorreo().getDestinatario().getEnderecoCorreo());
		return mails;
	}

    private Correo fromEmail(Email email) {
        Correo correo = new Correo();
        TemplateCorreo templateCorreo = new TemplateCorreo();

        templateCorreo
                .contenido(email.getTemplateCorreo())
                .remetente(new Remetente().enderecoCorreo(email.getFrom()))
                .asunto(email.getSubject())
                .tipoCorreo(email.getTemplate())
                .destinatario(new Destinatario().enderecoCorreo(email.getTo()));

        correo.templateCorreo(templateCorreo)
                .id(email.getId())
                .valoresTags(templateService.fromMap(email.getTemplateVariables()));

        LOGGER.info("Done");

        return correo;

    }

    private Email toEmail(Correo correo) {
        Email email = new Email();
        email.setTemplateCorreo(correo.getTemplateCorreo().getContenido());
        email.setFrom(correo.getTemplateCorreo().getRemetente().getEnderecoCorreo());
        email.setSubject(correo.getTemplateCorreo().getAsunto());
        email.setTemplate(correo.getTemplateCorreo().getTipoCorreo());
        email.setTemplateVariables(templateService.toMap(correo.getValoresTags()));
        email.setTo(correo.getTemplateCorreo().getDestinatario().getEnderecoCorreo());

        return email;
    }

    private boolean isValid(Correo email) {
        if (Objects.isNull(email.getTemplateCorreo())) {
            return false;
        }

        if (Objects.isNull(email.getTemplateCorreo().getDestinatario())) {
            return false;
        }

        if(StringUtils.isEmpty(email.getTemplateCorreo().getDestinatario().getEnderecoCorreo())) {
            return false;
        }

        if(Objects.isNull(email.getTemplateCorreo().getTipoCorreo())) {
            return false;
        }


        return !Objects.isNull(email.getValoresTags()) && !email.getValoresTags().isEmpty();
    }
}
