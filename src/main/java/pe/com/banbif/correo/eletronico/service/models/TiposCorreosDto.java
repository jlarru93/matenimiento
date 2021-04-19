package pe.com.banbif.correo.eletronico.service.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.TiposCorreos;

public enum TiposCorreosDto {
    CONTROL_LOGIN_NOTIFICACION_IP_MALICIOSO("CONTROL_LOGIN_NOTIFICACION_IP_MALICIOSO"),
    CONTROL_LOGIN_BLOQUEO_MAS_DE_UN_CANAL("CONTROL_LOGIN_BLOQUEO_MAS_DE_UN_CANAL"),
    AHORRO_PROGRAMADO_OPERACION_NO_PUDO_SER_COMPLETADA("AHORRO_PROGRAMADO_OPERACION_NO_PUDO_SER_COMPLETADA"),
    AHORRO_PROGRAMADO_OPERACION_COMPLETUD_PARCIAL("AHORRO_PROGRAMADO_OPERACION_COMPLETUD_PARCIAL"),
    AHORRO_PROGRAMADO_SERVICIO_DE_AHORRO_DESACTIVADO("AHORRO_PROGRAMADO_SERVICIO_DE_AHORRO_DESACTIVADO"),
    AHORRO_PROGRAMADO_AHORRO_PROGRAMADO("AHORRO_PROGRAMADO_AHORRO_PROGRAMADO"),
    AHORRO_VUELTO_AHORRO_PROGRAMADO("AHORRO_VUELTO_AHORRO_PROGRAMADO"),
    AHORRO_PROGRAMADO_AHORRO_PROGRAMADO_EJECUTADO("AHORRO_PROGRAMADO_AHORRO_PROGRAMADO_EJECUTADO"),
    AHORRO_PROGRAMADO_EDICION_DE_AHORRO("AHORRO_PROGRAMADO_EDICION_DE_AHORRO"),
    AHORRO_PROGRAMADO_SUPRESSION_DE_AHORRO("AHORRO_PROGRAMADO_SUPRESSION_DE_AHORRO"),
    AHORRO_VUELTO_EDICION_DE_AHORRO("AHORRO_VUELTO_EDICION_DE_AHORRO"),
    AHORRO_VUELTO_SUPRESSION_DE_AHORRO("AHORRO_VUELTO_SUPRESSION_DE_AHORRO"),
    DISPOSICION_EFECTIVO_OPERACION_COMPLETADA("DISPOSICION_EFECTIVO_OPERACION_COMPLETADA"),
    DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA("DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA"),
    CONTROL_LOGIN_NOTIFICACION_IP_MALICIOSO_Y_MAS_DE_UN_CANAL("CONTROL_LOGIN_NOTIFICACION_IP_MALICIOSO_Y_MAS_DE_UN_CANAL"),
    SEGURIDAD_EMPRESAS_SOFTTOKEN("SEGURIDAD_EMPRESAS_SOFTTOKEN"),
    L2P_AFILIACION("L2P_AFILIACION"),
    L2P_TRANSFERENCIA("L2P_TRANSFERENCIA"),
    L2P_TOKEN("L2P_TOKEN"),
    L2P_CUENTA_PREFERIDA("L2P_CUENTA_PREFERIDA"),
    L2P_CUENTA_ELIMINADA("L2P_CUENTA_ELIMINADA"),
    L2P_CUENTA_ACTUALIZADA("L2P_CUENTA_ACTUALIZADA"),
    QR_TOKEN("QR_TOKEN"),
    QR_TRANSFERENCIA("QR_TRANSFERENCIA"),
    L2P_INVITACION("L2P_INVITACION"),
    COMPARTIR_OPERACION_PLIN("COMPARTIR_OPERACION_PLIN"),
    CARDLESS_SMS_TOKEN("CARDLESS_SMS_TOKEN"),
    CARDLESS_CONFIRMACION_TOKEN("CARDLESS_CONFIRMACION_TOKEN"),
    CARDLESS_COMPARTIR_TOKEN("CARDLESS_COMPARTIR_TOKEN"),
    CARDLESS_CONFIRMACION_RETIRO("CARDLESS_CONFIRMACION_RETIRO"),
    CARDLESS_CONFIRMACION_RETIRO_SINTC("CARDLESS_CONFIRMACION_RETIRO_SINTC"),
    TDV_ACTIVACION_CUENTA("TDV_ACTIVACION_CUENTA"),
    TDV_ACTIVACION_ASOCIACION("TDV_ACTIVACION_ASOCIACION"),
    TDV_ASOCIACION_CUENTA_TARJETA("TDV_ASOCIACION_CUENTA_TARJETA"),
    TDV_DESASOCIACION_CUENTA_TARJETA("TDV_DESASOCIACION_CUENTA_TARJETA"),
    TDV_TOKEN("TDV_TOKEN");

    private String value;

    private TiposCorreosDto(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    @JsonCreator
    public static TiposCorreosDto fromValue(String text) {
        TiposCorreosDto[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            TiposCorreosDto b = var1[var3];
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }

        return null;
    }
}
