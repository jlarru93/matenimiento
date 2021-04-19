package pe.com.banbif.correo.eletronico.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cliente;
import io.swagger.model.Correo;
import io.swagger.model.TemplateCorreo;
import io.swagger.model.ValorTag;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CorreoDto {
    @JsonProperty("id")
    private String id = null;
    @JsonProperty("templateCorreo")
    private TemplateCorreoDto templateCorreo = null;
    @JsonProperty("cliente")
    private Cliente cliente = null;
    @JsonProperty("valoresTags")
    private List<ValorTag> valoresTags = null;

    public CorreoDto() {
    }

    public CorreoDto id(String id) {
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

    public CorreoDto templateCorreo(TemplateCorreoDto templateCorreo) {
        this.templateCorreo = templateCorreo;
        return this;
    }

    @ApiModelProperty("")
    public TemplateCorreoDto getTemplateCorreo() {
        return this.templateCorreo;
    }

    public void setTemplateCorreo(TemplateCorreoDto templateCorreo) {
        this.templateCorreo = templateCorreo;
    }

    public CorreoDto cliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    @ApiModelProperty("")
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CorreoDto valoresTags(List<ValorTag> valoresTags) {
        this.valoresTags = valoresTags;
        return this;
    }

    public CorreoDto addValoresTagsItem(ValorTag valoresTagsItem) {
        if (this.valoresTags == null) {
            this.valoresTags = new ArrayList();
        }

        this.valoresTags.add(valoresTagsItem);
        return this;
    }

    @ApiModelProperty("")
    public List<ValorTag> getValoresTags() {
        return this.valoresTags;
    }

    public void setValoresTags(List<ValorTag> valoresTags) {
        this.valoresTags = valoresTags;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            CorreoDto correo = (CorreoDto)o;
            return Objects.equals(this.id, correo.id) && Objects.equals(this.templateCorreo, correo.templateCorreo) && Objects.equals(this.cliente, correo.cliente) && Objects.equals(this.valoresTags, correo.valoresTags);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.templateCorreo, this.cliente, this.valoresTags});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Correo {\n");
        sb.append("    id: ").append(this.toIndentedString(this.id)).append("\n");
        sb.append("    templateCorreo: ").append(this.toIndentedString(this.templateCorreo)).append("\n");
        sb.append("    cliente: ").append(this.toIndentedString(this.cliente)).append("\n");
        sb.append("    valoresTags: ").append(this.toIndentedString(this.valoresTags)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
