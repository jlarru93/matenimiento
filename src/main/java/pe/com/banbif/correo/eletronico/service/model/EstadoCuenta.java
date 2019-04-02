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

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Estado de la Cuenta  (A&#x3D;Activo, C&#x3D;Cancelado, I&#x3D;Inactivo, etc.)
 */
public enum EstadoCuenta {
  
  ACTIVO("Activo"),
  
  CANCELADO("Cancelado"),
  
  INACTIVO("Inactivo");

  private String value;

  EstadoCuenta(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EstadoCuenta fromValue(String text) {
    for (EstadoCuenta b : EstadoCuenta.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

