package pe.com.banbif.correo.eletronico.service.data.entity;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import pe.com.banbif.correo.eletronico.service.models.TiposCorreosDto;

public class Email {

    private BigInteger id;
    private String from;
    private String to;
    private String bcc;
    private String subject;
    private String TemplateCorreo;
    private TiposCorreosDto template;
    private Map<String, Object> templateVariables;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
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

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTemplateCorreo() {
        return TemplateCorreo;
    }

    public void setTemplateCorreo(String TemplateCorreo) {
        this.TemplateCorreo = TemplateCorreo;
    }

    public TiposCorreosDto getTemplate() {
        return template;
    }

    public void setTemplate(TiposCorreosDto template) {
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
                Objects.equals(TemplateCorreo, email.TemplateCorreo) &&
                template == email.template &&
                Objects.equals(templateVariables, email.templateVariables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, to, bcc, subject, TemplateCorreo, template, templateVariables);
    }

    @Override
    public String toString() {
        return "Email{" +
                "id='" + id + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", bcc=" + bcc +
                ", subject='" + subject + '\'' +
                ", TemplateCorreo='" + TemplateCorreo + '\'' +
                ", template=" + template +
                ", templateVariables=" + templateVariables +
                '}';
    }
}


