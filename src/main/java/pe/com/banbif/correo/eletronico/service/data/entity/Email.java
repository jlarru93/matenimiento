package pe.com.banbif.correo.eletronico.service.data.entity;

import org.springframework.data.annotation.Id;
import pe.com.banbif.correo.eletronico.service.data.enumeration.Template;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Email {

    @Id
    private String id;
    private String from;
    private String to;
    private List<String> bcc;
    private String subject;
    private String emailContent;
    private Template template;
    private Map<String, Object> templateVariables;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public Map<String, Object> getTemplateVariables() {
        return templateVariables;
    }

    public void setTemplateVariables(Map<String, Object> templateVariables) {
        this.templateVariables = templateVariables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(id, email.id) &&
                Objects.equals(from, email.from) &&
                Objects.equals(to, email.to) &&
                Objects.equals(bcc, email.bcc) &&
                Objects.equals(subject, email.subject) &&
                Objects.equals(emailContent, email.emailContent) &&
                template == email.template &&
                Objects.equals(templateVariables, email.templateVariables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, to, bcc, subject, emailContent, template, templateVariables);
    }

    @Override
    public String toString() {
        return "Email{" +
                "id='" + id + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", bcc=" + bcc +
                ", subject='" + subject + '\'' +
                ", emailContent='" + emailContent + '\'' +
                ", template=" + template +
                ", templateVariables=" + templateVariables +
                '}';
    }
}
