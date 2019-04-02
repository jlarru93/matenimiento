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

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * Obligacion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-02T12:18:15.278Z")
public class Obligacion   {
  @JsonProperty("cuenta")
  private Cuenta cuenta = null;

  @JsonProperty("producto")
  private Producto producto = null;

  @JsonProperty("relacion")
  private String relacion = null;

  @JsonProperty("numeroSucursal")
  private String numeroSucursal = null;

  @JsonProperty("saldoOficial")
  private BigDecimal saldoOficial = null;

  @JsonProperty("interesesSaldo")
  private BigDecimal interesesSaldo = null;

  @JsonProperty("moraOficial")
  private BigDecimal moraOficial = null;

  @JsonProperty("interesesMora")
  private BigDecimal interesesMora = null;

  @JsonProperty("sobregiroOficial")
  private BigDecimal sobregiroOficial = null;

  @JsonProperty("diasMora")
  private BigDecimal diasMora = null;

  @JsonProperty("fechaActualizacion")
  private Date fechaActualizacion = null;

  @JsonProperty("estado")
  private String estado = null;

  @JsonProperty("gestion")
  private String gestion = null;

  @JsonProperty("moneda")
  private CodigosMonedas moneda = null;

  public Obligacion cuenta(Cuenta cuenta) {
    this.cuenta = cuenta;
    return this;
  }

  /**
   * Get cuenta
   * @return cuenta
   **/
  @JsonProperty("cuenta")
  @ApiModelProperty(value = "")
  public Cuenta getCuenta() {
    return cuenta;
  }

  public void setCuenta(Cuenta cuenta) {
    this.cuenta = cuenta;
  }

  public Obligacion producto(Producto producto) {
    this.producto = producto;
    return this;
  }

  /**
   * Get producto
   * @return producto
   **/
  @JsonProperty("producto")
  @ApiModelProperty(value = "")
  public Producto getProducto() {
    return producto;
  }

  public void setProducto(Producto producto) {
    this.producto = producto;
  }

  public Obligacion relacion(String relacion) {
    this.relacion = relacion;
    return this;
  }

  /**
   * Relación
   * @return relacion
   **/
  @JsonProperty("relacion")
  @ApiModelProperty(value = "Relación")
  public String getRelacion() {
    return relacion;
  }

  public void setRelacion(String relacion) {
    this.relacion = relacion;
  }

  public Obligacion numeroSucursal(String numeroSucursal) {
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

  public Obligacion saldoOficial(BigDecimal saldoOficial) {
    this.saldoOficial = saldoOficial;
    return this;
  }

  /**
   * Saldo Oficial
   * @return saldoOficial
   **/
  @JsonProperty("saldoOficial")
  @ApiModelProperty(value = "Saldo Oficial")
  public BigDecimal getSaldoOficial() {
    return saldoOficial;
  }

  public void setSaldoOficial(BigDecimal saldoOficial) {
    this.saldoOficial = saldoOficial;
  }

  public Obligacion interesesSaldo(BigDecimal interesesSaldo) {
    this.interesesSaldo = interesesSaldo;
    return this;
  }

  /**
   * Interés Saldo
   * @return interesesSaldo
   **/
  @JsonProperty("interesesSaldo")
  @ApiModelProperty(value = "Interés Saldo")
  public BigDecimal getInteresesSaldo() {
    return interesesSaldo;
  }

  public void setInteresesSaldo(BigDecimal interesesSaldo) {
    this.interesesSaldo = interesesSaldo;
  }

  public Obligacion moraOficial(BigDecimal moraOficial) {
    this.moraOficial = moraOficial;
    return this;
  }

  /**
   * Mora Oficial
   * @return moraOficial
   **/
  @JsonProperty("moraOficial")
  @ApiModelProperty(value = "Mora Oficial")
  public BigDecimal getMoraOficial() {
    return moraOficial;
  }

  public void setMoraOficial(BigDecimal moraOficial) {
    this.moraOficial = moraOficial;
  }

  public Obligacion interesesMora(BigDecimal interesesMora) {
    this.interesesMora = interesesMora;
    return this;
  }

  /**
   * Intereses Mora
   * @return interesesMora
   **/
  @JsonProperty("interesesMora")
  @ApiModelProperty(value = "Intereses Mora")
  public BigDecimal getInteresesMora() {
    return interesesMora;
  }

  public void setInteresesMora(BigDecimal interesesMora) {
    this.interesesMora = interesesMora;
  }

  public Obligacion sobregiroOficial(BigDecimal sobregiroOficial) {
    this.sobregiroOficial = sobregiroOficial;
    return this;
  }

  /**
   * Sobregiro Oficial
   * @return sobregiroOficial
   **/
  @JsonProperty("sobregiroOficial")
  @ApiModelProperty(value = "Sobregiro Oficial")
  public BigDecimal getSobregiroOficial() {
    return sobregiroOficial;
  }

  public void setSobregiroOficial(BigDecimal sobregiroOficial) {
    this.sobregiroOficial = sobregiroOficial;
  }

  public Obligacion diasMora(BigDecimal diasMora) {
    this.diasMora = diasMora;
    return this;
  }

  /**
   * Dias Mora
   * @return diasMora
   **/
  @JsonProperty("diasMora")
  @ApiModelProperty(value = "Dias Mora")
  public BigDecimal getDiasMora() {
    return diasMora;
  }

  public void setDiasMora(BigDecimal diasMora) {
    this.diasMora = diasMora;
  }

  public Obligacion fechaActualizacion(Date fechaActualizacion) {
    this.fechaActualizacion = fechaActualizacion;
    return this;
  }

  /**
   * Fecha Actualización
   * @return fechaActualizacion
   **/
  @JsonProperty("fechaActualizacion")
  @ApiModelProperty(value = "Fecha Actualización")
  public Date getFechaActualizacion() {
    return fechaActualizacion;
  }

  public void setFechaActualizacion(Date fechaActualizacion) {
    this.fechaActualizacion = fechaActualizacion;
  }

  public Obligacion estado(String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Estado
   * @return estado
   **/
  @JsonProperty("estado")
  @ApiModelProperty(value = "Estado")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public Obligacion gestion(String gestion) {
    this.gestion = gestion;
    return this;
  }

  /**
   * Gestión
   * @return gestion
   **/
  @JsonProperty("gestion")
  @ApiModelProperty(value = "Gestión")
  public String getGestion() {
    return gestion;
  }

  public void setGestion(String gestion) {
    this.gestion = gestion;
  }

  public Obligacion moneda(CodigosMonedas moneda) {
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
    Obligacion obligacion = (Obligacion) o;
    return Objects.equals(this.cuenta, obligacion.cuenta) &&
        Objects.equals(this.producto, obligacion.producto) &&
        Objects.equals(this.relacion, obligacion.relacion) &&
        Objects.equals(this.numeroSucursal, obligacion.numeroSucursal) &&
        Objects.equals(this.saldoOficial, obligacion.saldoOficial) &&
        Objects.equals(this.interesesSaldo, obligacion.interesesSaldo) &&
        Objects.equals(this.moraOficial, obligacion.moraOficial) &&
        Objects.equals(this.interesesMora, obligacion.interesesMora) &&
        Objects.equals(this.sobregiroOficial, obligacion.sobregiroOficial) &&
        Objects.equals(this.diasMora, obligacion.diasMora) &&
        Objects.equals(this.fechaActualizacion, obligacion.fechaActualizacion) &&
        Objects.equals(this.estado, obligacion.estado) &&
        Objects.equals(this.gestion, obligacion.gestion) &&
        Objects.equals(this.moneda, obligacion.moneda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cuenta, producto, relacion, numeroSucursal, saldoOficial, interesesSaldo, moraOficial, interesesMora, sobregiroOficial, diasMora, fechaActualizacion, estado, gestion, moneda);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Obligacion {\n");
    
    sb.append("    cuenta: ").append(toIndentedString(cuenta)).append("\n");
    sb.append("    producto: ").append(toIndentedString(producto)).append("\n");
    sb.append("    relacion: ").append(toIndentedString(relacion)).append("\n");
    sb.append("    numeroSucursal: ").append(toIndentedString(numeroSucursal)).append("\n");
    sb.append("    saldoOficial: ").append(toIndentedString(saldoOficial)).append("\n");
    sb.append("    interesesSaldo: ").append(toIndentedString(interesesSaldo)).append("\n");
    sb.append("    moraOficial: ").append(toIndentedString(moraOficial)).append("\n");
    sb.append("    interesesMora: ").append(toIndentedString(interesesMora)).append("\n");
    sb.append("    sobregiroOficial: ").append(toIndentedString(sobregiroOficial)).append("\n");
    sb.append("    diasMora: ").append(toIndentedString(diasMora)).append("\n");
    sb.append("    fechaActualizacion: ").append(toIndentedString(fechaActualizacion)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    gestion: ").append(toIndentedString(gestion)).append("\n");
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

