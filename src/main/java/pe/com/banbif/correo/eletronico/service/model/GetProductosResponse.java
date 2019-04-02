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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetProductosResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-02T12:18:15.278Z")
public class GetProductosResponse extends RespuestaServicio  {
  @JsonProperty("datos")
  private List<Producto> datos = new ArrayList<Producto>();

  public GetProductosResponse datos(List<Producto> datos) {
    this.datos = datos;
    return this;
  }

  public GetProductosResponse addDatosItem(Producto datosItem) {
    this.datos.add(datosItem);
    return this;
  }

  /**
   * Get datos
   * @return datos
   **/
  @JsonProperty("datos")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public List<Producto> getDatos() {
    return datos;
  }

  public void setDatos(List<Producto> datos) {
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
    GetProductosResponse getProductosResponse = (GetProductosResponse) o;
    return Objects.equals(this.datos, getProductosResponse.datos) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datos, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProductosResponse {\n");
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

