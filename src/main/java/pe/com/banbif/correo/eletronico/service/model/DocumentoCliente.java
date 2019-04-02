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
import java.util.Objects;

/**
 * DocumentoCliente
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-02T12:18:15.278Z")
public class DocumentoCliente   {
  @JsonProperty("tipo")
  private TiposDocumentos tipo = null;

  @JsonProperty("numero")
  private String numero = null;

  @JsonProperty("tasaInteres")
  private Double tasaInteres = null;

  @JsonProperty("renovacionAutomatica")
  private Boolean renovacionAutomatica = null;

  @JsonProperty("fechaVencimiento")
  private String fechaVencimiento = null;

  @JsonProperty("numeroPlazo")
  private BigDecimal numeroPlazo = null;

  @JsonProperty("numeroFolioSeguridad")
  private String numeroFolioSeguridad = null;

  public DocumentoCliente tipo(TiposDocumentos tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
   **/
  @JsonProperty("tipo")
  @ApiModelProperty(value = "")
  public TiposDocumentos getTipo() {
    return tipo;
  }

  public void setTipo(TiposDocumentos tipo) {
    this.tipo = tipo;
  }

  public DocumentoCliente numero(String numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Nro. De documento
   * @return numero
   **/
  @JsonProperty("numero")
  @ApiModelProperty(value = "Nro. De documento")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public DocumentoCliente tasaInteres(Double tasaInteres) {
    this.tasaInteres = tasaInteres;
    return this;
  }

  /**
   * Tasa de Interés que se esta Calculando para el Documento
   * @return tasaInteres
   **/
  @JsonProperty("tasaInteres")
  @ApiModelProperty(value = "Tasa de Interés que se esta Calculando para el Documento")
  public Double getTasaInteres() {
    return tasaInteres;
  }

  public void setTasaInteres(Double tasaInteres) {
    this.tasaInteres = tasaInteres;
  }

  public DocumentoCliente renovacionAutomatica(Boolean renovacionAutomatica) {
    this.renovacionAutomatica = renovacionAutomatica;
    return this;
  }

  /**
   * Indica si la Renovación del Documento es de forma automática  1&#x3D;Si, 2&#x3D;No
   * @return renovacionAutomatica
   **/
  @JsonProperty("renovacionAutomatica")
  @ApiModelProperty(value = "Indica si la Renovación del Documento es de forma automática  1=Si, 2=No")
  public Boolean isRenovacionAutomatica() {
    return renovacionAutomatica;
  }

  public void setRenovacionAutomatica(Boolean renovacionAutomatica) {
    this.renovacionAutomatica = renovacionAutomatica;
  }

  public DocumentoCliente fechaVencimiento(String fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
    return this;
  }

  /**
   * Fecha de Vencimiento del Documento.  En Formato AAAAMMDD
   * @return fechaVencimiento
   **/
  @JsonProperty("fechaVencimiento")
  @ApiModelProperty(value = "Fecha de Vencimiento del Documento.  En Formato AAAAMMDD")
  public String getFechaVencimiento() {
    return fechaVencimiento;
  }

  public void setFechaVencimiento(String fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
  }

  public DocumentoCliente numeroPlazo(BigDecimal numeroPlazo) {
    this.numeroPlazo = numeroPlazo;
    return this;
  }

  /**
   * Numero de Plazo que tiene el Documento en Días.  30, 60, 90 días., etc
   * @return numeroPlazo
   **/
  @JsonProperty("numeroPlazo")
  @ApiModelProperty(value = "Numero de Plazo que tiene el Documento en Días.  30, 60, 90 días., etc")
  public BigDecimal getNumeroPlazo() {
    return numeroPlazo;
  }

  public void setNumeroPlazo(BigDecimal numeroPlazo) {
    this.numeroPlazo = numeroPlazo;
  }

  public DocumentoCliente numeroFolioSeguridad(String numeroFolioSeguridad) {
    this.numeroFolioSeguridad = numeroFolioSeguridad;
    return this;
  }

  /**
   * Numero de Forma o Folio de Seguridad del Documento
   * @return numeroFolioSeguridad
   **/
  @JsonProperty("numeroFolioSeguridad")
  @ApiModelProperty(value = "Numero de Forma o Folio de Seguridad del Documento")
  public String getNumeroFolioSeguridad() {
    return numeroFolioSeguridad;
  }

  public void setNumeroFolioSeguridad(String numeroFolioSeguridad) {
    this.numeroFolioSeguridad = numeroFolioSeguridad;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoCliente documentoCliente = (DocumentoCliente) o;
    return Objects.equals(this.tipo, documentoCliente.tipo) &&
        Objects.equals(this.numero, documentoCliente.numero) &&
        Objects.equals(this.tasaInteres, documentoCliente.tasaInteres) &&
        Objects.equals(this.renovacionAutomatica, documentoCliente.renovacionAutomatica) &&
        Objects.equals(this.fechaVencimiento, documentoCliente.fechaVencimiento) &&
        Objects.equals(this.numeroPlazo, documentoCliente.numeroPlazo) &&
        Objects.equals(this.numeroFolioSeguridad, documentoCliente.numeroFolioSeguridad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipo, numero, tasaInteres, renovacionAutomatica, fechaVencimiento, numeroPlazo, numeroFolioSeguridad);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoCliente {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    tasaInteres: ").append(toIndentedString(tasaInteres)).append("\n");
    sb.append("    renovacionAutomatica: ").append(toIndentedString(renovacionAutomatica)).append("\n");
    sb.append("    fechaVencimiento: ").append(toIndentedString(fechaVencimiento)).append("\n");
    sb.append("    numeroPlazo: ").append(toIndentedString(numeroPlazo)).append("\n");
    sb.append("    numeroFolioSeguridad: ").append(toIndentedString(numeroFolioSeguridad)).append("\n");
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

