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


package pe.com.banbif.correo.eletronico.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * GetConvenioResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-02T12:18:15.278Z")
public class GetConvenioResponse extends RespuestaServicio  {
  @JsonProperty("datos")
  private Convenio datos = null;

  public GetConvenioResponse datos(Convenio datos) {
    this.datos = datos;
    return this;
  }

  /**
   * Get datos
   * @return datos
   **/
  @JsonProperty("datos")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Convenio getDatos() {
    return datos;
  }

  public void setDatos(Convenio datos) {
    this.datos = datos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetConvenioResponse getConvenioResponse = (GetConvenioResponse) o;
    return Objects.equals(this.datos, getConvenioResponse.datos) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datos, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetConvenioResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    datos: ").append(toIndentedString(datos)).append("\n");
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

