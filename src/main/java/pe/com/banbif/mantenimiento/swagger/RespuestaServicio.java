/*
 * BanBif - API
 * API de BanBif
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package pe.com.banbif.mantenimiento.swagger;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * RespuestaServicio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-26T14:18:57.786-05:00")
public class RespuestaServicio {
  @JsonProperty("meta")
  private MetadatoServicio meta = null;

  public RespuestaServicio meta(MetadatoServicio meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(required = true, value = "")
  public MetadatoServicio getMeta() {
    return meta;
  }

  public void setMeta(MetadatoServicio meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespuestaServicio respuestaServicio = (RespuestaServicio) o;
    return Objects.equals(this.meta, respuestaServicio.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespuestaServicio {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

