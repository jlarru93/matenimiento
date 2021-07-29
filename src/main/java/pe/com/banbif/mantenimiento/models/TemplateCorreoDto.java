package pe.com.banbif.mantenimiento.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import pe.com.banbif.mantenimiento.swagger.CodigosCanales;
import pe.com.banbif.mantenimiento.swagger.Destinatario;
import pe.com.banbif.mantenimiento.swagger.Remetente;


import java.util.Objects;

public class TemplateCorreoDto {
    @JsonProperty("id")
    private String id = null;
    @JsonProperty("envioCorreoCliente")
    private Boolean envioCorreoCliente = null;
    @JsonProperty("canal")
    private CodigosCanales canal = null;
    @JsonProperty("tipoCorreo")
    private TiposCorreosDto tipoCorreo = null;
    @JsonProperty("remetente")
    private Remetente remetente = null;
    @JsonProperty("asunto")
    private String asunto = null;
    @JsonProperty("contenido")
    private String contenido = null;
    @JsonProperty("destinatario")
    private Destinatario destinatario = null;

    public TemplateCorreoDto() {
    }

    public TemplateCorreoDto id(String id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty("Codigo do correo")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TemplateCorreoDto envioCorreoCliente(Boolean envioCorreoCliente) {
        this.envioCorreoCliente = envioCorreoCliente;
        return this;
    }

    @ApiModelProperty("Indica si el correo va a ser enviado al cliente")
    public Boolean isEnvioCorreoCliente() {
        return this.envioCorreoCliente;
    }

    public void setEnvioCorreoCliente(Boolean envioCorreoCliente) {
        this.envioCorreoCliente = envioCorreoCliente;
    }

    public TemplateCorreoDto canal(CodigosCanales canal) {
        this.canal = canal;
        return this;
    }

    @ApiModelProperty("")
    public CodigosCanales getCanal() {
        return this.canal;
    }

    public void setCanal(CodigosCanales canal) {
        this.canal = canal;
    }

    public TiposCorreosDto tipoCorreo(TiposCorreosDto tipoCorreo) {
        this.tipoCorreo = tipoCorreo;
        return this.tipoCorreo;
    }

    @ApiModelProperty("")
    public TiposCorreosDto getTipoCorreo() {
        return this.tipoCorreo;
    }

    public void setTipoCorreo(TiposCorreosDto tipoCorreo) {
        this.tipoCorreo = tipoCorreo;
    }

    public TemplateCorreoDto remetente(Remetente remetente) {
        this.remetente = remetente;
        return this;
    }

    @ApiModelProperty("")
    public Remetente getRemetente() {
        return this.remetente;
    }

    public void setRemetente(Remetente remetente) {
        this.remetente = remetente;
    }

    public TemplateCorreoDto asunto(String asunto) {
        this.asunto = asunto;
        return this;
    }

    @ApiModelProperty("Tema del correo electrónico")
    public String getAsunto() {
        return this.asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public TemplateCorreoDto contenido(String contenido) {
        this.contenido = contenido;
        return this;
    }

    @ApiModelProperty("Contenido del cuerpo del correo electrónico")
    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public TemplateCorreoDto destinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
        return this;
    }

    @ApiModelProperty("")
    public Destinatario getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            TemplateCorreoDto templateCorreo = (TemplateCorreoDto)o;
            return Objects.equals(this.id, templateCorreo.id) && Objects.equals(this.envioCorreoCliente, templateCorreo.envioCorreoCliente) && Objects.equals(this.canal, templateCorreo.canal) && Objects.equals(this.tipoCorreo, templateCorreo.tipoCorreo) && Objects.equals(this.remetente, templateCorreo.remetente) && Objects.equals(this.asunto, templateCorreo.asunto) && Objects.equals(this.contenido, templateCorreo.contenido) && Objects.equals(this.destinatario, templateCorreo.destinatario);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.envioCorreoCliente, this.canal, this.tipoCorreo, this.remetente, this.asunto, this.contenido, this.destinatario});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateCorreo {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    envioCorreoCliente: ").append(this.toIndentedString(this.envioCorreoCliente)).append("\n");
        sb.append("    canal: ").append(this.toIndentedString(this.canal)).append("\n");
        sb.append("    tipoCorreo: ").append(this.toIndentedString(this.tipoCorreo)).append("\n");
        sb.append("    remetente: ").append(this.toIndentedString(this.remetente)).append("\n");
        sb.append("    asunto: ").append(this.toIndentedString(this.asunto)).append("\n");
        sb.append("    contenido: ").append(this.toIndentedString(this.contenido)).append("\n");
        sb.append("    destinatario: ").append(this.toIndentedString(this.destinatario)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
