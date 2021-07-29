package pe.com.banbif.mantenimiento.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MetadatoServicio;

import java.util.Objects;

public class PostCorreoDtoResponse {
    @JsonProperty("meta")
    private MetadatoServicio meta = null;
    @JsonProperty("datos")
    private CorreoDto datos = null;

    public PostCorreoDtoResponse() {
    }

    public PostCorreoDtoResponse meta(MetadatoServicio meta) {
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

    public PostCorreoDtoResponse datos(CorreoDto datos) {
        this.datos = datos;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    public CorreoDto getDatos() {
        return this.datos;
    }

    public void setDatos(CorreoDto datos) {
        this.datos = datos;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            PostCorreoDtoResponse postCorreoResponse = (PostCorreoDtoResponse)o;
            return Objects.equals(this.meta, postCorreoResponse.meta) && Objects.equals(this.datos, postCorreoResponse.datos);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.meta, this.datos});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostCorreoResponse {\n");
        sb.append("    meta: ").append(this.toIndentedString(this.meta)).append("\n");
        sb.append("    datos: ").append(this.toIndentedString(this.datos)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
