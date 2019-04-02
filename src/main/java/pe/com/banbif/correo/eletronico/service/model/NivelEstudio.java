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
 * Niveles de estudio
 */
@ApiModel(description = "Niveles de estudio")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-02T12:18:15.278Z")
public class NivelEstudio   {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("description")
  private String description = null;

  public NivelEstudio codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Código de nivel de estudio
   * @return codigo
   **/
  @JsonProperty("codigo")
  @ApiModelProperty(value = "Código de nivel de estudio")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public NivelEstudio description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descripción de nivel de estudio
   * @return description
   **/
  @JsonProperty("description")
  @ApiModelProperty(value = "Descripción de nivel de estudio")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NivelEstudio nivelEstudio = (NivelEstudio) o;
    return Objects.equals(this.codigo, nivelEstudio.codigo) &&
        Objects.equals(this.description, nivelEstudio.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NivelEstudio {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

