package pe.com.banbif.correo.eletronico.service.business;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.Version;
import io.swagger.model.Correo;
import io.swagger.model.TagCorreo;
import io.swagger.model.TiposCorreos;
import io.swagger.model.ValorTag;
import pe.com.banbif.correo.eletronico.service.dto.EmailTemplateContent;

@Service
public class TemplateService {


    private static final String TEMPLATE_NOT_FOUND_ERROR_MESSAGE = null;

	public String getContent(Correo email) {
    	return buildMail(email);
    }

    public String buildMail(Correo email) {
    	try {
    		String template = "<html><body>***** <b>${TESTE}</b></body></html>";
    		Map<String, Object> model = getModel(email);
    		Version version = new Version("2.3.28");
    		Configuration cfg = new Configuration(version);
    		cfg.setObjectWrapper(new DefaultObjectWrapper(version));
    		
    		Template t = new Template("templateName", new StringReader(template), cfg);
    		
    		Writer out = new StringWriter();
    		t.process(model, out);
    		
    		return  out.toString();
			
		} catch (Exception e) {
			  throw new RuntimeException(TEMPLATE_NOT_FOUND_ERROR_MESSAGE);
		}
    }
    
    private Map<String, Object> getModel(Correo email) {
    	Map<String, Object> map = new HashMap<String, Object>();
    	
    	for (ValorTag tag : email.getValoresTags()) {
			map.put(tag.getTag().getClave(), tag.getValor());
		}
    	
    	return map;
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
            case AHORRO_PROGRAMADO_OPERACION_COMPLETUD_PARCIAL:
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
            case AHORRO_PROGRAMADO_OPERACION_COMPLETUD_PARCIAL:
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
            case AHORRO_PROGRAMADO_OPERACION_NO_PUDO_SER_COMPLETADA:
                return "Ahorro Programado - Ejecución no Pudo ser Completada";
            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO:
                return "Ahorro Programado – Programación Exitosa";
            case AHORRO_PROGRAMADO_OPERACION_COMPLETUD_PARCIAL:
                return "Ahorro Programado - Transferencia Parcialmente Realizada";
            case AHORRO_PROGRAMADO_EDICION_DE_AHORRO:
                return "Ahorro Programado - Programación Cambiado con Éxito";
            case AHORRO_PROGRAMADO_SUPRESSION_DE_AHORRO:
                return "Ahorro Programado - Programación Eliminado con Éxito";
            case AHORRO_PROGRAMADO_SERVICIO_DE_AHORRO_DESACTIVADO:
                return "Ahorro Programado - Desactivado";
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
            case AHORRO_PROGRAMADO_OPERACION_COMPLETUD_PARCIAL:
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
            case AHORRO_PROGRAMADO_EDICION_DE_AHORRO:
            case AHORRO_PROGRAMADO_SUPRESSION_DE_AHORRO:
            case DISPOSICION_EFECTIVO_OPERACION_COMPLETADA:
            case DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA:
            case AHORRO_PROGRAMADO_OPERACION_COMPLETUD_PARCIAL:
                return "";
            case AHORRO_PROGRAMADO_OPERACION_NO_PUDO_SER_COMPLETADA:
                return "No se pudo realizar el abono a la cuenta solicitada. Te recomendamos revisar si la cuenta de retiro tiene fondos. También puede llmarmos a nuestra Banca Telefónica: Lima (01) 631-9000 Provincias 0-801-0-0456";
            case AHORRO_PROGRAMADO_SERVICIO_DE_AHORRO_DESACTIVADO:
                return "Tu servicio de ahorro ha sido desactivado. Puedo comunicarse con nuestra Banca Telefónica: Lima (01) 631-9000 Provincias: 0-801-0-0456";
            default:
                throw new RuntimeException(TEMPLATE_NOT_FOUND_ERROR_MESSAGE);
        }
    }
}
