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

import java.util.Date;
import java.util.Objects;

/**
 * Proceso
 */
@ApiModel(description = "Proceso")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-02T12:18:15.278Z")
public class Proceso   {
  @JsonProperty("fecha")
  private Date fecha = null;

  @JsonProperty("tipoProcesso")
  private TiposProcesos tipoProcesso = null;

  public Proceso fecha(Date fecha) {
    this.fecha = fecha;
    return this;
  }

  /**
   * Fecha proceso
   * @return fecha
   **/
  @JsonProperty("fecha")
  @ApiModelProperty(value = "Fecha proceso")
  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public Proceso tipoProcesso(TiposProcesos tipoProcesso) {
    this.tipoProcesso = tipoProcesso;
    return this;
  }

  /**
   * Get tipoProcesso
   * @return tipoProcesso
   **/
  @JsonProperty("tipoProcesso")
  @ApiModelProperty(value = "")
  public TiposProcesos getTipoProcesso() {
    return tipoProcesso;
  }

  public void setTipoProcesso(TiposProcesos tipoProcesso) {
    this.tipoProcesso = tipoProcesso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Proceso proceso = (Proceso) o;
    return Objects.equals(this.fecha, proceso.fecha) &&
        Objects.equals(this.tipoProcesso, proceso.tipoProcesso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fecha, tipoProcesso);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Proceso {\n");
    
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    tipoProcesso: ").append(toIndentedString(tipoProcesso)).append("\n");
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

