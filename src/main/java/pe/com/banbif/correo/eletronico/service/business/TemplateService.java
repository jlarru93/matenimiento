package pe.com.banbif.correo.eletronico.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import pe.com.banbif.correo.eletronico.service.data.entity.Email;
import pe.com.banbif.correo.eletronico.service.data.enumeration.Template;

import java.util.Map;

@Service
public class TemplateService {

    private static final String TEMPLATE_NOT_FOUND_ERROR_MESSAGE = "Template not found";
    private final TemplateEngine templateEngine;

    @Autowired
    public TemplateService(final TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public String getContent(Email email) {
        return this.templateEngine.process(
                getTemplate(email.getTemplate()),
                getContext(email.getTemplateVariables())
        );
    }

    private Context getContext(Map<String, Object> variables) {
        final Context context = new Context();
        context.setVariables(variables);
        return context;
    }

    private String getTemplate(Template template) {
        switch (template) {
            case SUCCESS_SCHEDULLING_ROUNDING_SAVINGS:
                return "scheduled-round-savings-template.html";
            case SUCESS_EXECUTING_SCHEDULED_SAVINGS:
                return "savings-transfer-success.html";
            case SCHEDULED_SAVINGS_ERROR_LACK_OF_FUNDS:
                return "savings-transfer-lack-resources.html";
            case SUCCESS_SCHEDULLING_SCHEDULED_SAVINGS:
                return "scheduled-savings-template.html";
            case SCHEDULED_SAVINGS_PARTIAL_LACK_OF_FUNDS:
                return "savings-transfer-partial-success.html";
            default:
                throw new RuntimeException(TEMPLATE_NOT_FOUND_ERROR_MESSAGE);
        }
    }
}
