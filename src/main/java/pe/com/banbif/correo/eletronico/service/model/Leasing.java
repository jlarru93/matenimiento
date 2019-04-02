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

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Leasing
 */
@ApiModel(description = "Leasing")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-02T12:18:15.278Z")
public class Leasing   {
  @JsonProperty("cuentaContable")
  private BigDecimal cuentaContable = null;

  @JsonProperty("concepto")
  private ConceptosLeasing concepto = null;

  @JsonProperty("efectivo")
  private BigDecimal efectivo = null;

  @JsonProperty("montoTotal")
  private BigDecimal montoTotal = null;

  @JsonProperty("itf")
  private BigDecimal itf = null;

  public Leasing cuentaContable(BigDecimal cuentaContable) {
    this.cuentaContable = cuentaContable;
    return this;
  }

  /**
   * Cuenta Contable Leasing
   * @return cuentaContable
   **/
  @JsonProperty("cuentaContable")
  @ApiModelProperty(value = "Cuenta Contable Leasing")
  public BigDecimal getCuentaContable() {
    return cuentaContable;
  }

  public void setCuentaContable(BigDecimal cuentaContable) {
    this.cuentaContable = cuentaContable;
  }

  public Leasing concepto(ConceptosLeasing concepto) {
    this.concepto = concepto;
    return this;
  }

  /**
   * Get concepto
   * @return concepto
   **/
  @JsonProperty("concepto")
  @ApiModelProperty(value = "")
  public ConceptosLeasing getConcepto() {
    return concepto;
  }

  public void setConcepto(ConceptosLeasing concepto) {
    this.concepto = concepto;
  }

  public Leasing efectivo(BigDecimal efectivo) {
    this.efectivo = efectivo;
    return this;
  }

  /**
   * Efectivo Leasing
   * @return efectivo
   **/
  @JsonProperty("efectivo")
  @ApiModelProperty(value = "Efectivo Leasing")
  public BigDecimal getEfectivo() {
    return efectivo;
  }

  public void setEfectivo(BigDecimal efectivo) {
    this.efectivo = efectivo;
  }

  public Leasing montoTotal(BigDecimal montoTotal) {
    this.montoTotal = montoTotal;
    return this;
  }

  /**
   * Monto total Leasing
   * @return montoTotal
   **/
  @JsonProperty("montoTotal")
  @ApiModelProperty(value = "Monto total Leasing")
  public BigDecimal getMontoTotal() {
    return montoTotal;
  }

  public void setMontoTotal(BigDecimal montoTotal) {
    this.montoTotal = montoTotal;
  }

  public Leasing itf(BigDecimal itf) {
    this.itf = itf;
    return this;
  }

  /**
   * ITF Leasing
   * @return itf
   **/
  @JsonProperty("itf")
  @ApiModelProperty(value = "ITF Leasing")
  public BigDecimal getItf() {
    return itf;
  }

  public void setItf(BigDecimal itf) {
    this.itf = itf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Leasing leasing = (Leasing) o;
    return Objects.equals(this.cuentaContable, leasing.cuentaContable) &&
        Objects.equals(this.concepto, leasing.concepto) &&
        Objects.equals(this.efectivo, leasing.efectivo) &&
        Objects.equals(this.montoTotal, leasing.montoTotal) &&
        Objects.equals(this.itf, leasing.itf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cuentaContable, concepto, efectivo, montoTotal, itf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leasing {\n");
    
    sb.append("    cuentaContable: ").append(toIndentedString(cuentaContable)).append("\n");
    sb.append("    concepto: ").append(toIndentedString(concepto)).append("\n");
    sb.append("    efectivo: ").append(toIndentedString(efectivo)).append("\n");
    sb.append("    montoTotal: ").append(toIndentedString(montoTotal)).append("\n");
    sb.append("    itf: ").append(toIndentedString(itf)).append("\n");
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

