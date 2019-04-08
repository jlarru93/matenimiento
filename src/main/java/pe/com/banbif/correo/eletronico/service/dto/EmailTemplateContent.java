package pe.com.banbif.correo.eletronico.service.dto;

import java.util.Map;

public class EmailTemplateContent {
    private String htmlTitle;
    private String title;
    private String titleDetails;
    private String subtitle;
    private Map<String, Object> content;

    public String getHtmlTitle() {
        return htmlTitle;
    }

    public void setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Map<String, Object> getContent() {
        return content;
    }

    public void setContent(Map<String, Object> content) {
        this.content = content;
    }

    public String getTitleDetails() {
        return titleDetails;
    }

    public void setTitleDetails(String titleDetails) {
        this.titleDetails = titleDetails;
    }
}
