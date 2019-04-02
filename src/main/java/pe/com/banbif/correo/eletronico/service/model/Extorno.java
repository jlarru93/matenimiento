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
 * Extorno de un pago
 */
@ApiModel(description = "Extorno de un pago")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-02T12:18:15.278Z")
public class Extorno   {
  @JsonProperty("pago")
  private Pago pago = null;

  @JsonProperty("fechaHoraProceso")
  private String fechaHoraProceso = null;

  @JsonProperty("numeroSucursal")
  private String numeroSucursal = null;

  @JsonProperty("numeroCajero")
  private String numeroCajero = null;

  @JsonProperty("tipoTransaccionTeller")
  private BigDecimal tipoTransaccionTeller = null;

  @JsonProperty("cuentaPagare")
  private Cuenta cuentaPagare = null;

  @JsonProperty("montoTotalExtorno")
  private Double montoTotalExtorno = null;

  @JsonProperty("moneda")
  private CodigosMonedas moneda = null;

  public Extorno pago(Pago pago) {
    this.pago = pago;
    return this;
  }

  /**
   * Get pago
   * @return pago
   **/
  @JsonProperty("pago")
  @ApiModelProperty(value = "")
  public Pago getPago() {
    return pago;
  }

  public void setPago(Pago pago) {
    this.pago = pago;
  }

  public Extorno fechaHoraProceso(String fechaHoraProceso) {
    this.fechaHoraProceso = fechaHoraProceso;
    return this;
  }

  /**
   * Fecha y hora del Proceso
   * @return fechaHoraProceso
   **/
  @JsonProperty("fechaHoraProceso")
  @ApiModelProperty(value = "Fecha y hora del Proceso")
  public String getFechaHoraProceso() {
    return fechaHoraProceso;
  }

  public void setFechaHoraProceso(String fechaHoraProceso) {
    this.fechaHoraProceso = fechaHoraProceso;
  }

  public Extorno numeroSucursal(String numeroSucursal) {
    this.numeroSucursal = numeroSucursal;
    return this;
  }

  /**
   * Número Sucursal
   * @return numeroSucursal
   **/
  @JsonProperty("numeroSucursal")
  @ApiModelProperty(value = "Número Sucursal")
  public String getNumeroSucursal() {
    return numeroSucursal;
  }

  public void setNumeroSucursal(String numeroSucursal) {
    this.numeroSucursal = numeroSucursal;
  }

  public Extorno numeroCajero(String numeroCajero) {
    this.numeroCajero = numeroCajero;
    return this;
  }

  /**
   * Número Cajero
   * @return numeroCajero
   **/
  @JsonProperty("numeroCajero")
  @ApiModelProperty(value = "Número Cajero")
  public String getNumeroCajero() {
    return numeroCajero;
  }

  public void setNumeroCajero(String numeroCajero) {
    this.numeroCajero = numeroCajero;
  }

  public Extorno tipoTransaccionTeller(BigDecimal tipoTransaccionTeller) {
    this.tipoTransaccionTeller = tipoTransaccionTeller;
    return this;
  }

  /**
   * Tipo Transacción Teller
   * @return tipoTransaccionTeller
   **/
  @JsonProperty("tipoTransaccionTeller")
  @ApiModelProperty(value = "Tipo Transacción Teller")
  public BigDecimal getTipoTransaccionTeller() {
    return tipoTransaccionTeller;
  }

  public void setTipoTransaccionTeller(BigDecimal tipoTransaccionTeller) {
    this.tipoTransaccionTeller = tipoTransaccionTeller;
  }

  public Extorno cuentaPagare(Cuenta cuentaPagare) {
    this.cuentaPagare = cuentaPagare;
    return this;
  }

  /**
   * Get cuentaPagare
   * @return cuentaPagare
   **/
  @JsonProperty("cuentaPagare")
  @ApiModelProperty(value = "")
  public Cuenta getCuentaPagare() {
    return cuentaPagare;
  }

  public void setCuentaPagare(Cuenta cuentaPagare) {
    this.cuentaPagare = cuentaPagare;
  }

  public Extorno montoTotalExtorno(Double montoTotalExtorno) {
    this.montoTotalExtorno = montoTotalExtorno;
    return this;
  }

  /**
   * Monto de Cuota
   * @return montoTotalExtorno
   **/
  @JsonProperty("montoTotalExtorno")
  @ApiModelProperty(value = "Monto de Cuota")
  public Double getMontoTotalExtorno() {
    return montoTotalExtorno;
  }

  public void setMontoTotalExtorno(Double montoTotalExtorno) {
    this.montoTotalExtorno = montoTotalExtorno;
  }

  public Extorno moneda(CodigosMonedas moneda) {
    this.moneda = moneda;
    return this;
  }

  /**
   * Get moneda
   * @return moneda
   **/
  @JsonProperty("moneda")
  @ApiModelProperty(value = "")
  public CodigosMonedas getMoneda() {
    return moneda;
  }

  public void setMoneda(CodigosMonedas moneda) {
    this.moneda = moneda;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Extorno extorno = (Extorno) o;
    return Objects.equals(this.pago, extorno.pago) &&
        Objects.equals(this.fechaHoraProceso, extorno.fechaHoraProceso) &&
        Objects.equals(this.numeroSucursal, extorno.numeroSucursal) &&
        Objects.equals(this.numeroCajero, extorno.numeroCajero) &&
        Objects.equals(this.tipoTransaccionTeller, extorno.tipoTransaccionTeller) &&
        Objects.equals(this.cuentaPagare, extorno.cuentaPagare) &&
        Objects.equals(this.montoTotalExtorno, extorno.montoTotalExtorno) &&
        Objects.equals(this.moneda, extorno.moneda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pago, fechaHoraProceso, numeroSucursal, numeroCajero, tipoTransaccionTeller, cuentaPagare, montoTotalExtorno, moneda);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extorno {\n");
    
    sb.append("    pago: ").append(toIndentedString(pago)).append("\n");
    sb.append("    fechaHoraProceso: ").append(toIndentedString(fechaHoraProceso)).append("\n");
    sb.append("    numeroSucursal: ").append(toIndentedString(numeroSucursal)).append("\n");
    sb.append("    numeroCajero: ").append(toIndentedString(numeroCajero)).append("\n");
    sb.append("    tipoTransaccionTeller: ").append(toIndentedString(tipoTransaccionTeller)).append("\n");
    sb.append("    cuentaPagare: ").append(toIndentedString(cuentaPagare)).append("\n");
    sb.append("    montoTotalExtorno: ").append(toIndentedString(montoTotalExtorno)).append("\n");
    sb.append("    moneda: ").append(toIndentedString(moneda)).append("\n");
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

