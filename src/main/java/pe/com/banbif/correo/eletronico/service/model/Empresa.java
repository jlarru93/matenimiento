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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Empresa
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-02T12:18:15.278Z")
public class Empresa   {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("documento")
  private String documento = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("razonSocial")
  private String razonSocial = null;

  @JsonProperty("estado")
  private String estado = null;

  @JsonProperty("activa")
  private Boolean activa = null;

  @JsonProperty("rubros")
  private List<Rubro> rubros = null;

  @JsonProperty("canales")
  private List<Canal> canales = null;

  @JsonProperty("giroNegocio")
  private GiroNegocio giroNegocio = null;

  public Empresa codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Código identificador de la empresa en el sistema.
   * @return codigo
   **/
  @JsonProperty("codigo")
  @ApiModelProperty(value = "Código identificador de la empresa en el sistema.")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Empresa documento(String documento) {
    this.documento = documento;
    return this;
  }

  /**
   * Código identificador legal de la empresa de servicios (ej. RUC).
   * @return documento
   **/
  @JsonProperty("documento")
  @ApiModelProperty(value = "Código identificador legal de la empresa de servicios (ej. RUC).")
  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public Empresa nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Nombre de fantasía de la empresa de servicios.
   * @return nombre
   **/
  @JsonProperty("nombre")
  @ApiModelProperty(value = "Nombre de fantasía de la empresa de servicios.")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Empresa razonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
    return this;
  }

  /**
   * Razón Social de la empresa de servicios.
   * @return razonSocial
   **/
  @JsonProperty("razonSocial")
  @ApiModelProperty(value = "Razón Social de la empresa de servicios.")
  public String getRazonSocial() {
    return razonSocial;
  }

  public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
  }

  public Empresa estado(String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Estado asociado a la empresa, ver apartado con códigos de estado.
   * @return estado
   **/
  @JsonProperty("estado")
  @ApiModelProperty(value = "Estado asociado a la empresa, ver apartado con códigos de estado.")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public Empresa activa(Boolean activa) {
    this.activa = activa;
    return this;
  }

  /**
   * Indica si una empresa ya se encuentra migrada al servicio de recaudaciones del HUB. Existe una tabla donde se encuentran registrar las empresas ya migradas.
   * @return activa
   **/
  @JsonProperty("activa")
  @ApiModelProperty(value = "Indica si una empresa ya se encuentra migrada al servicio de recaudaciones del HUB. Existe una tabla donde se encuentran registrar las empresas ya migradas.")
  public Boolean isActiva() {
    return activa;
  }

  public void setActiva(Boolean activa) {
    this.activa = activa;
  }

  public Empresa rubros(List<Rubro> rubros) {
    this.rubros = rubros;
    return this;
  }

  public Empresa addRubrosItem(Rubro rubrosItem) {
    if (this.rubros == null) {
      this.rubros = new ArrayList<Rubro>();
    }
    this.rubros.add(rubrosItem);
    return this;
  }

  /**
   * Arreglo de estructura única “Rubro”, con información de los rubros asociados a la empresa consultada.
   * @return rubros
   **/
  @JsonProperty("rubros")
  @ApiModelProperty(value = "Arreglo de estructura única “Rubro”, con información de los rubros asociados a la empresa consultada.")
  public List<Rubro> getRubros() {
    return rubros;
  }

  public void setRubros(List<Rubro> rubros) {
    this.rubros = rubros;
  }

  public Empresa canales(List<Canal> canales) {
    this.canales = canales;
    return this;
  }

  public Empresa addCanalesItem(Canal canalesItem) {
    if (this.canales == null) {
      this.canales = new ArrayList<Canal>();
    }
    this.canales.add(canalesItem);
    return this;
  }

  /**
   * Arreglo de estructura única “Canal”, con información de los canales activos que tienen los convenios asociados a la empresa consultada.
   * @return canales
   **/
  @JsonProperty("canales")
  @ApiModelProperty(value = "Arreglo de estructura única “Canal”, con información de los canales activos que tienen los convenios asociados a la empresa consultada.")
  public List<Canal> getCanales() {
    return canales;
  }

  public void setCanales(List<Canal> canales) {
    this.canales = canales;
  }

  public Empresa giroNegocio(GiroNegocio giroNegocio) {
    this.giroNegocio = giroNegocio;
    return this;
  }

  /**
   * Get giroNegocio
   * @return giroNegocio
   **/
  @JsonProperty("giroNegocio")
  @ApiModelProperty(value = "")
  public GiroNegocio getGiroNegocio() {
    return giroNegocio;
  }

  public void setGiroNegocio(GiroNegocio giroNegocio) {
    this.giroNegocio = giroNegocio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Empresa empresa = (Empresa) o;
    return Objects.equals(this.codigo, empresa.codigo) &&
        Objects.equals(this.documento, empresa.documento) &&
        Objects.equals(this.nombre, empresa.nombre) &&
        Objects.equals(this.razonSocial, empresa.razonSocial) &&
        Objects.equals(this.estado, empresa.estado) &&
        Objects.equals(this.activa, empresa.activa) &&
        Objects.equals(this.rubros, empresa.rubros) &&
        Objects.equals(this.canales, empresa.canales) &&
        Objects.equals(this.giroNegocio, empresa.giroNegocio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, documento, nombre, razonSocial, estado, activa, rubros, canales, giroNegocio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Empresa {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    razonSocial: ").append(toIndentedString(razonSocial)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    activa: ").append(toIndentedString(activa)).append("\n");
    sb.append("    rubros: ").append(toIndentedString(rubros)).append("\n");
    sb.append("    canales: ").append(toIndentedString(canales)).append("\n");
    sb.append("    giroNegocio: ").append(toIndentedString(giroNegocio)).append("\n");
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

