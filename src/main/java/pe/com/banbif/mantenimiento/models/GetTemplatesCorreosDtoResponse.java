package pe.com.banbif.mantenimiento.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MetadatoServicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GetTemplatesCorreosDtoResponse {
    @JsonProperty("meta")
    private MetadatoServicio meta = null;
    @JsonProperty("datos")
    private List<TemplateCorreoDto> datos = new ArrayList();

    public GetTemplatesCorreosDtoResponse() {
    }

    public GetTemplatesCorreosDtoResponse meta(MetadatoServicio meta) {
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

    public GetTemplatesCorreosDtoResponse datos(List<TemplateCorreoDto> datos) {
        this.datos = datos;
        return this;
    }

    public GetTemplatesCorreosDtoResponse addDatosItem(TemplateCorreoDto datosItem) {
        this.datos.add(datosItem);
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    public List<TemplateCorreoDto> getDatos() {
        return this.datos;
    }

    public void setDatos(List<TemplateCorreoDto> datos) {
        this.datos = datos;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            GetTemplatesCorreosDtoResponse getTemplatesCorreosResponse = (GetTemplatesCorreosDtoResponse)o;
            return Objects.equals(this.meta, getTemplatesCorreosResponse.meta) && Objects.equals(this.datos, getTemplatesCorreosResponse.datos);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.meta, this.datos});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTemplatesCorreosResponse {\n");
        sb.append("    meta: ").append(this.toIndentedString(this.meta)).append("\n");
        sb.append("    datos: ").append(this.toIndentedString(this.datos)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }

}
