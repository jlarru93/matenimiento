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
 * Remetente
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-26T14:18:57.786-05:00")
public class Remetente {
  @JsonProperty("enderecoCorreo")
  private String enderecoCorreo = null;

  public Remetente enderecoCorreo(String enderecoCorreo) {
    this.enderecoCorreo = enderecoCorreo;
    return this;
  }

   /**
   * Dirección de correo electrónico remitente
   * @return enderecoCorreo
  **/
  @ApiModelProperty(value = "Dirección de correo electrónico remitente")
  public String getEnderecoCorreo() {
    return enderecoCorreo;
  }

  public void setEnderecoCorreo(String enderecoCorreo) {
    this.enderecoCorreo = enderecoCorreo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Remetente remetente = (Remetente) o;
    return Objects.equals(this.enderecoCorreo, remetente.enderecoCorreo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enderecoCorreo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Remetente {\n");
    
    sb.append("    enderecoCorreo: ").append(toIndentedString(enderecoCorreo)).append("\n");
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

