package pe.com.banbif.mantenimiento.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import pe.com.banbif.mantenimiento.swagger.MetadatoServicio;


import java.util.Objects;

public class PutTemplateCorreoDtoResponse {
    @JsonProperty("meta")
    private MetadatoServicio meta = null;
    @JsonProperty("datos")
    private TemplateCorreoDto datos = null;

    public PutTemplateCorreoDtoResponse() {
    }

    public PutTemplateCorreoDtoResponse meta(MetadatoServicio meta) {
        this.meta = meta;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    public MetadatoServicio getMeta() {
        return this.meta;
    }

    public void setMeta(MetadatoServicio meta) {
        this.meta = meta;
    }

    public PutTemplateCorreoDtoResponse datos(TemplateCorreoDto datos) {
        this.datos = datos;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    public TemplateCorreoDto getDatos() {
        return this.datos;
    }

    public void setDatos(TemplateCorreoDto datos) {
        this.datos = datos;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            PutTemplateCorreoDtoResponse putTemplateCorreoResponse = (PutTemplateCorreoDtoResponse)o;
            return Objects.equals(this.meta, putTemplateCorreoResponse.meta) && Objects.equals(this.datos, putTemplateCorreoResponse.datos);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.meta, this.datos});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutTemplateCorreoResponse {\n");
        sb.append("    meta: ").append(this.toIndentedString(this.meta)).append("\n");
        sb.append("    datos: ").append(this.toIndentedString(this.datos)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
