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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Giro de negocio
 */
@ApiModel(description = "Giro de negocio")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-02T12:18:15.278Z")
public class GiroNegocio   {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("descripcion")
  private String descripcion = null;

  public GiroNegocio codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Código de giro de negocio
   * @return codigo
   **/
  @JsonProperty("codigo")
  @ApiModelProperty(value = "Código de giro de negocio")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public GiroNegocio descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  /**
   * Descripción de giro de negocio
   * @return descripcion
   **/
  @JsonProperty("descripcion")
  @ApiModelProperty(value = "Descripción de giro de negocio")
  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiroNegocio giroNegocio = (GiroNegocio) o;
    return Objects.equals(this.codigo, giroNegocio.codigo) &&
        Objects.equals(this.descripcion, giroNegocio.descripcion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, descripcion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiroNegocio {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
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

