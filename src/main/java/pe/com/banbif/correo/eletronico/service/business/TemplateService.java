package pe.com.banbif.correo.eletronico.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import pe.com.banbif.correo.eletronico.service.dto.EmailTemplateContent;
import pe.com.banbif.correo.eletronico.service.model.Correo;
import pe.com.banbif.correo.eletronico.service.model.TagCorreo;
import pe.com.banbif.correo.eletronico.service.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.model.ValorTag;

import java.util.*;

@Service
public class TemplateService {

    private static final String TEMPLATE_NOT_FOUND_ERROR_MESSAGE = "Template not found";
    private final TemplateEngine templateEngine;

    @Autowired
    public TemplateService(final TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public String getContent(Correo email) {
        return this.templateEngine.process(
                getTemplate(email.getTemplateCorreo().getTipoCorreo()),
                getContext(generateContent(email))
        );
    }

    public Map<String, Object> toMap(List<ValorTag> tags) {
        Map<String, Object> mappedValues = new LinkedHashMap<>();
        tags.forEach(tag -> {
            mappedValues.put(tag.getTag().getClave(), tag.getValor());
        });

        return mappedValues;
    }

    public List<ValorTag> fromMap(Map<String, Object> values) {
        List<ValorTag> tags = new ArrayList<>();
        values.forEach((key, value) -> {
            ValorTag tag = new ValorTag();
            TagCorreo tagCorreo = new TagCorreo();
            tagCorreo.setClave(key);
            tag.setTag(tagCorreo);
            tag.setValor(value.toString());
            tags.add(tag);
        });

        return tags;
    }

    private Context getContext(EmailTemplateContent email) {
        final Context context = new Context();

        context.setVariable("htmlTitle", email.getHtmlTitle());
        context.setVariable("title", email.getTitle());
        context.setVariable("subtitle", email.getSubtitle());
        context.setVariable("content", email.getContent());
        context.setVariable("titleDetails", email.getTitleDetails());

        return context;
    }

    private EmailTemplateContent generateContent(Correo mail) {
        EmailTemplateContent emailContent = new EmailTemplateContent();
        emailContent.setHtmlTitle(getHtmlTitle(mail.getTemplateCorreo().getTipoCorreo()));
        emailContent.setTitle(getTitle(mail.getTemplateCorreo().getTipoCorreo()));
        emailContent.setSubtitle(getSubtitle(mail.getTemplateCorreo().getTipoCorreo()));
        emailContent.setContent(toMap(mail.getValoresTags()));
        emailContent.setTitleDetails(getTitleDetails(mail.getTemplateCorreo().getTipoCorreo()));

        return emailContent;
    }

    private String getTemplate(TiposCorreos template) {
        switch (template) {
            case AHORRO_VUELTO_AHORRO_PROGRAMADO:
            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO_EJECUTADO:
            case AHORRO_PROGRAMADO_SERVICIO_DE_AHORRO_DESACTIVADO:
            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO:
            case AHORRO_PROGRAMADO_OPERACION_NO_PUDO_SER_COMPLETADA:
            case AHORRO_PROGRAMADO_EDICION_DE_AHORRO:
            case AHORRO_VUELTO_EDICION_DE_AHORRO:
            case AHORRO_PROGRAMADO_SUPRESSION_DE_AHORRO:
            case AHORRO_VUELTO_SUPRESSION_DE_AHORRO:
                return "banbif-template.html";
            case DISPOSICION_EFECTIVO_OPERACION_COMPLETADA:
                return "disposicion-sucess-template.html";
            case DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA:
                return "disposicion-error-template.html";
            default:
                throw new RuntimeException(TEMPLATE_NOT_FOUND_ERROR_MESSAGE);
        }
    }

    private String getHtmlTitle(TiposCorreos template) {
        switch (template) {
            case AHORRO_VUELTO_SUPRESSION_DE_AHORRO:
            case AHORRO_VUELTO_EDICION_DE_AHORRO:
            case AHORRO_VUELTO_AHORRO_PROGRAMADO:
                return "BanBif - Ahorro Vuelto";

            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO_EJECUTADO:
            case AHORRO_PROGRAMADO_SERVICIO_DE_AHORRO_DESACTIVADO:
            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO:
            case AHORRO_PROGRAMADO_OPERACION_NO_PUDO_SER_COMPLETADA:
            case AHORRO_PROGRAMADO_EDICION_DE_AHORRO:
            case AHORRO_PROGRAMADO_SUPRESSION_DE_AHORRO:
                return "BanBif - Ahorro Programado";

            case DISPOSICION_EFECTIVO_OPERACION_COMPLETADA:
            case DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA:
                return "BanBif - Disposición de Efectivo";
            default:
                throw new RuntimeException(TEMPLATE_NOT_FOUND_ERROR_MESSAGE);
        }
    }

    private String getTitle(TiposCorreos template) {
        switch (template) {
            case AHORRO_VUELTO_SUPRESSION_DE_AHORRO:
                return "Ahorro Vuelto - Programación Eliminado con Éxito";
            case AHORRO_VUELTO_EDICION_DE_AHORRO:
                return "Ahorro Vuelto - Programación Cambiado con Éxito";
            case AHORRO_VUELTO_AHORRO_PROGRAMADO:
                return "Ahorro Vuelto - Registrado con Éxito";
            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO_EJECUTADO:
                return "Ahorro Programado - Ejecución Efectuada con Êxito";
            case AHORRO_PROGRAMADO_SERVICIO_DE_AHORRO_DESACTIVADO:
                return "Ahorro Programado - Ejecución no Pudo ser Completada";
            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO:
                return "Ahorro Programado – Programación Exitosa";
            case AHORRO_PROGRAMADO_OPERACION_NO_PUDO_SER_COMPLETADA:
                return "Ahorro Programado - Transferencia Parcialmente Realizada";
            case AHORRO_PROGRAMADO_EDICION_DE_AHORRO:
                return "Ahorro Programado - Programación Cambiado con Éxito";
            case AHORRO_PROGRAMADO_SUPRESSION_DE_AHORRO:
                return "Ahorro Programado - Programación Eliminado con Éxito";
            case DISPOSICION_EFECTIVO_OPERACION_COMPLETADA:
            case DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA:
                return "";
            default:
                throw new RuntimeException(TEMPLATE_NOT_FOUND_ERROR_MESSAGE);
        }
    }

    private String getSubtitle(TiposCorreos template) {
        switch (template) {
            case AHORRO_VUELTO_SUPRESSION_DE_AHORRO:
            case AHORRO_VUELTO_EDICION_DE_AHORRO:
            case AHORRO_VUELTO_AHORRO_PROGRAMADO:
            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO_EJECUTADO:
            case AHORRO_PROGRAMADO_SERVICIO_DE_AHORRO_DESACTIVADO:
            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO:
            case AHORRO_PROGRAMADO_OPERACION_NO_PUDO_SER_COMPLETADA:
            case AHORRO_PROGRAMADO_EDICION_DE_AHORRO:
            case AHORRO_PROGRAMADO_SUPRESSION_DE_AHORRO:
                return "Información de la Programación";

            case DISPOSICION_EFECTIVO_OPERACION_COMPLETADA:
            case DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA:
                return "";

            default:
                throw new RuntimeException(TEMPLATE_NOT_FOUND_ERROR_MESSAGE);
        }
    }

    private String getTitleDetails(TiposCorreos template) {
        switch (template) {
            case AHORRO_VUELTO_SUPRESSION_DE_AHORRO:
            case AHORRO_VUELTO_EDICION_DE_AHORRO:
            case AHORRO_VUELTO_AHORRO_PROGRAMADO:
            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO_EJECUTADO:
            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO:
            case AHORRO_PROGRAMADO_OPERACION_NO_PUDO_SER_COMPLETADA:
            case AHORRO_PROGRAMADO_EDICION_DE_AHORRO:
            case AHORRO_PROGRAMADO_SUPRESSION_DE_AHORRO:
            case DISPOSICION_EFECTIVO_OPERACION_COMPLETADA:
            case DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA:
                return "";
            case AHORRO_PROGRAMADO_SERVICIO_DE_AHORRO_DESACTIVADO:
                return "No se pudo realizar el abono a la cuenta solicitada. Te recomendamos revisar si la cuenta de retiro tiene fondos. También puede llmarmos a nuestra Banca Telefónica: Lima (01) 631-9000 Provincias 0-801-0-0456";

            default:
                throw new RuntimeException(TEMPLATE_NOT_FOUND_ERROR_MESSAGE);
        }
    }
}
