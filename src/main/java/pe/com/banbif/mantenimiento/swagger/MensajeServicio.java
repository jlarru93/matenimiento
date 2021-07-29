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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * MensajeServicio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-26T14:18:57.786-05:00")
public class MensajeServicio {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("mensaje")
  private String mensaje = null;

  @JsonProperty("titulo")
  private String titulo = null;

  @JsonProperty("regresar")
  private Boolean regresar = null;

  @JsonProperty("rutaRegreso")
  private String rutaRegreso = null;

  /**
   * Código del tipo de resultado asociado a la operación. Puede ser utilizado para tratar adecuadamente la exhibición de los alertas en el frontend o en las pruebas automatizadas.
   */
  public enum TipoEnum {
    ERROR("error"),
    
    WARN("warn"),
    
    INVALID("invalid"),
    
    FATAL("fatal"),
    
    INFO("info"),
    
    R("R");

    private String value;

    TipoEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TipoEnum fromValue(String text) {
      for (TipoEnum b : TipoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("tipo")
  private TipoEnum tipo = null;

  public MensajeServicio codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

   /**
   * Códigos de validación de reglas de negocio. El valor ESM00 indica succeso, el valor &#39;HTTP&#39; indica que es un error ya considerado en los status code estándard del HTTP.
   * @return codigo
  **/
  @ApiModelProperty(value = "Códigos de validación de reglas de negocio. El valor ESM00 indica succeso, el valor 'HTTP' indica que es un error ya considerado en los status code estándard del HTTP.")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public MensajeServicio mensaje(String mensaje) {
    this.mensaje = mensaje;
    return this;
  }

   /**
   * Mensaje de resultado asociado a la operación
   * @return mensaje
  **/
  @ApiModelProperty(value = "Mensaje de resultado asociado a la operación")
  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  public MensajeServicio titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }

   /**
   * Titulo
   * @return titulo
  **/
  @ApiModelProperty(value = "Titulo")
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public MensajeServicio regresar(Boolean regresar) {
    this.regresar = regresar;
    return this;
  }

   /**
   * Flag si permite regresar a la pantalla anterior
   * @return regresar
  **/
  @ApiModelProperty(value = "Flag si permite regresar a la pantalla anterior")
  public Boolean isRegresar() {
    return regresar;
  }

  public void setRegresar(Boolean regresar) {
    this.regresar = regresar;
  }

  public MensajeServicio rutaRegreso(String rutaRegreso) {
    this.rutaRegreso = rutaRegreso;
    return this;
  }

   /**
   * Ruta a donde se debe regresar
   * @return rutaRegreso
  **/
  @ApiModelProperty(value = "Ruta a donde se debe regresar")
  public String getRutaRegreso() {
    return rutaRegreso;
  }

  public void setRutaRegreso(String rutaRegreso) {
    this.rutaRegreso = rutaRegreso;
  }

  public MensajeServicio tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

   /**
   * Código del tipo de resultado asociado a la operación. Puede ser utilizado para tratar adecuadamente la exhibición de los alertas en el frontend o en las pruebas automatizadas.
   * @return tipo
  **/
  @ApiModelProperty(value = "Código del tipo de resultado asociado a la operación. Puede ser utilizado para tratar adecuadamente la exhibición de los alertas en el frontend o en las pruebas automatizadas.")
  public TipoEnum getTipo() {
    return tipo;
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MensajeServicio mensajeServicio = (MensajeServicio) o;
    return Objects.equals(this.codigo, mensajeServicio.codigo) &&
        Objects.equals(this.mensaje, mensajeServicio.mensaje) &&
        Objects.equals(this.titulo, mensajeServicio.titulo) &&
        Objects.equals(this.regresar, mensajeServicio.regresar) &&
        Objects.equals(this.rutaRegreso, mensajeServicio.rutaRegreso) &&
        Objects.equals(this.tipo, mensajeServicio.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, mensaje, titulo, regresar, rutaRegreso, tipo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MensajeServicio {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    mensaje: ").append(toIndentedString(mensaje)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    regresar: ").append(toIndentedString(regresar)).append("\n");
    sb.append("    rutaRegreso: ").append(toIndentedString(rutaRegreso)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

