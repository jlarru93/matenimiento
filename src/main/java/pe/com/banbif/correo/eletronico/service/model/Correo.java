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
 * Correo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-04-02T12:18:15.278Z")
public class Correo   {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("templateCorreo")
  private TemplateCorreo templateCorreo = null;

  @JsonProperty("valoresTags")
  private List<ValorTag> valoresTags = null;

  public Correo codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Codigo do correo
   * @return codigo
   **/
  @JsonProperty("codigo")
  @ApiModelProperty(value = "Codigo do correo")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Correo templateCorreo(TemplateCorreo templateCorreo) {
    this.templateCorreo = templateCorreo;
    return this;
  }

  /**
   * Get templateCorreo
   * @return templateCorreo
   **/
  @JsonProperty("templateCorreo")
  @ApiModelProperty(value = "")
  public TemplateCorreo getTemplateCorreo() {
    return templateCorreo;
  }

  public void setTemplateCorreo(TemplateCorreo templateCorreo) {
    this.templateCorreo = templateCorreo;
  }

  public Correo valoresTags(List<ValorTag> valoresTags) {
    this.valoresTags = valoresTags;
    return this;
  }

  public Correo addValoresTagsItem(ValorTag valoresTagsItem) {
    if (this.valoresTags == null) {
      this.valoresTags = new ArrayList<ValorTag>();
    }
    this.valoresTags.add(valoresTagsItem);
    return this;
  }

  /**
   * Get valoresTags
   * @return valoresTags
   **/
  @JsonProperty("valoresTags")
  @ApiModelProperty(value = "")
  public List<ValorTag> getValoresTags() {
    return valoresTags;
  }

  public void setValoresTags(List<ValorTag> valoresTags) {
    this.valoresTags = valoresTags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Correo correo = (Correo) o;
    return Objects.equals(this.codigo, correo.codigo) &&
        Objects.equals(this.templateCorreo, correo.templateCorreo) &&
        Objects.equals(this.valoresTags, correo.valoresTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, templateCorreo, valoresTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Correo {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    templateCorreo: ").append(toIndentedString(templateCorreo)).append("\n");
    sb.append("    valoresTags: ").append(toIndentedString(valoresTags)).append("\n");
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

