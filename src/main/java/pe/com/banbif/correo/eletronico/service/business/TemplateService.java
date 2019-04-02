package pe.com.banbif.correo.eletronico.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import pe.com.banbif.correo.eletronico.service.model.Correo;
import pe.com.banbif.correo.eletronico.service.model.TagCorreo;
import pe.com.banbif.correo.eletronico.service.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.model.ValorTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                getContext(toMap(email.getValoresTags()))
        );
    }

    public Map<String, Object> toMap(List<ValorTag> tags) {
        Map<String, Object> mappedValues = new HashMap<>();
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

    private Context getContext(Map<String, Object> variables) {
        final Context context = new Context();
        context.setVariables(variables);
        return context;
    }

    private String getTemplate(TiposCorreos template) {
        switch (template) {
            case AHORRO_VUELTO_AHORRO_PROGRAMADO:
                return "scheduled-round-savings-template.html";
            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO_EJECUTADO:
                return "savings-transfer-success.html";
            case AHORRO_PROGRAMADO_SERVICIO_DE_AHORRO_DESACTIVADO:
                return "savings-transfer-lack-resources.html";
            case AHORRO_PROGRAMADO_AHORRO_PROGRAMADO:
                return "scheduled-savings-template.html";
            case AHORRO_PROGRAMADO_OPERACION_NO_PUDO_SER_COMPLETADA:
                return "savings-transfer-partial-success.html";
            case AHORRO_PROGRAMADO_EDICION_DE_AHORRO:
                return "edited-savings-template.html";
            case AHORRO_VUELTO_EDICION_DE_AHORRO:
                return "edited-round-savings-template.html";
            case AHORRO_PROGRAMADO_SUPRESSION_DE_AHORRO:
                return "deleted-savings-template.html";
            case AHORRO_VUELTO_SUPRESSION_DE_AHORRO:
                return "deleted-round-savings-template.html";
            case DISPOSICION_EFECTIVO_OPERACION_COMPLETADA:
            	return "disposicion-sucess-template.html";
            case DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA:
            	return "disposicion-error-template.html";
            default:
                throw new RuntimeException(TEMPLATE_NOT_FOUND_ERROR_MESSAGE);
        }
    }
}
