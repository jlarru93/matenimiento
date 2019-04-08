**- Crear Secrets DSV:**

* oc create secret generic spring-correo-eletronico-service --from-literal=spring.mail.username=gabriel.schaidhauer.ntconsult --from-literal=spring.mail.password=S3gur4nc4+ --from-literal=spring.data.mongodb.database=maildb --from-literal=spring.data.mongodb.username=userSF7 --from-literal=spring.data.mongodb.password=8MegXXohsbyPGkrT

* oc create configmap spring-correo-eletronico-service --from-env-file=conf/cm-dev.properties

* Despliegue en Openshift
oc login https://desconsoleops.dombif.peru
oc project email-service
mvn clean -DskipTests fabric8:deploy -Popenshift

**Templates**

Existem 7 templates de envio de e-mail mapeados, cada um deles tem seu set de variáveis para ser enviada, segue relação abaixo: 

* AHORRO_PROGRAMADO_AHORRO_PROGRAMADO

    ```json
        {
            "templateCorreo": {
                "tipoCorreo": "AHORRO_VUELTO_AHORRO_PROGRAMADO",
                "remetente": {
                    "enderecoCorreo": "gabriel.schaidhauer.ntconsult@gmail.com"
                },
                "asunto": "Teste @ 123",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "Cliente"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "Nombre Ahorro"
                    },
                    "valor": "Educación de mi hijo"
                },
                {
                	"tag": {
                		"clave": "Cuenta Origen"
                	},
                	"valor": "001-00"
                },
                {
                	"tag": {
                		"clave": "Cuenta Destino"
                	},
                	"valor": "003-00"
                },
                {
                	"tag": {
                		"clave": "Monto de Redondeo"
                	},
                	"valor": "U$ 450,00"
                },
                {
                	"tag": {
                		"clave": "Frecuencia"
                	},
                	"valor": "Diario"
                },
                {
                	"tag": {
                		"clave": "ITF"
                	},
                	"valor": "999999"
                },
                {
                	"tag": {
                		"clave": "Fecha y Hora"
                	},
                	"valor": "15/07/2019 10:55:10"
                }
            ]
        }
    ```
* AHORRO_PROGRAMADO_AHORRO_PROGRAMADO_EJECUTADO

    ```json
        {
            "templateCorreo": {
                "tipoCorreo": "AHORRO_PROGRAMADO_AHORRO_PROGRAMADO_EJECUTADO",
                "remetente": {
                    "enderecoCorreo": "gabriel.schaidhauer@gmail.com"
                },
                "asunto": "Ejecución Ahorro Programado",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "Cliente"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "Nombre Ahorro"
                    },
                    "valor": "Educación de mi hijo"
                },
                {
                    "tag": {
                        "clave": "Cuenta Origen"
                    },
                    "valor": "001-00"
                },
                {
                    "tag": {
                        "clave": "Cuenta Destino"
                    },
                    "valor": "003-00"
                },
                {
                    "tag": {
                        "clave": "Monto"
                    },
                    "valor": "U$ 450,00"
                },
                {
                    "tag": {
                        "clave": "Frecuencia"
                    },
                    "valor": "Diario"
                },
                {
                    "tag": {
                        "clave": "ITF"
                    },
                    "valor": "999999"
                },
                {
                    "tag": {
                        "clave": "Fecha y Hora"
                    },
                    "valor": "15/07/2019 10:55:10"
                }
            ]
        }
    ```
    
* AHORRO_VUELTO_AHORRO_PROGRAMADO

    ```json
        {
            "templateCorreo": {
                "tipoCorreo": "AHORRO_VUELTO_AHORRO_PROGRAMADO",
                "remetente": {
                    "enderecoCorreo": "gabriel.schaidhauer@gmail.com"
                },
                "asunto": "Programacíon de Ahorro Vuelto",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "Cliente"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "Nombre Ahorro"
                    },
                    "valor": "Educación de mi hijo"
                },
                {
                    "tag": {
                        "clave": "Cuenta Origen"
                    },
                    "valor": "001-00"
                },
                {
                    "tag": {
                        "clave": "Cuenta Destino"
                    },
                    "valor": "003-00"
                },
                {
                    "tag": {
                        "clave": "Monto de Redondeo"
                    },
                    "valor": "U$ 450,00"
                },
                {
                    "tag": {
                        "clave": "Frecuencia"
                    },
                    "valor": "Diario"
                },
                {
                    "tag": {
                        "clave": "ITF"
                    },
                    "valor": "999999"
                },
                {
                    "tag": {
                        "clave": "Fecha y Hora"
                    },
                    "valor": "15/07/2019 10:55:10"
                }
            ]
        }
    ```
    
* AHORRO_PROGRAMADO_SERVICIO_DE_AHORRO_DESACTIVADO

    ```json
        {
            "templateCorreo": {
                "tipoCorreo": "AHORRO_PROGRAMADO_SERVICIO_DE_AHORRO_DESACTIVADO",
                "remetente": {
                    "enderecoCorreo": "gabriel.schaidhauer@gmail.com"
                },
                "asunto": "Teste @ 123",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "Cliente"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "Nombre Ahorro"
                    },
                    "valor": "Educación de mi hijo"
                },
                {
                    "tag": {
                        "clave": "Cuenta Origen"
                    },
                    "valor": "001-00"
                },
                {
                    "tag": {
                        "clave": "Cuenta Destino"
                    },
                    "valor": "003-00"
                },
                {
                    "tag": {
                        "clave": "Monto a Ahorrar"
                    },
                    "valor": "U$ 450,00"
                },
                {
                    "tag": {
                        "clave": "Frecuencia"
                    },
                    "valor": "Diario"
                },
                {
                    "tag": {
                        "clave": "ITF"
                    },
                    "valor": "999999"
                },
                {
                    "tag": {
                        "clave": "Fecha y Hora"
                    },
                    "valor": "15/07/2019 10:55:10"
                }
            ]
        }
    ```
 
* AHORRO_PROGRAMADO_OPERACION_NO_PUDO_SER_COMPLETADA

    ```json
        {
            "templateCorreo": {
                "tipoCorreo": "AHORRO_PROGRAMADO_OPERACION_NO_PUDO_SER_COMPLETADA",
                "remetente": {
                    "enderecoCorreo": "gabriel.schaidhauer@gmail.com"
                },
                "asunto": "Teste @ 123",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "Cliente"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "Nombre Ahorro"
                    },
                    "valor": "Educación de mi hijo"
                },
                {
                    "tag": {
                        "clave": "Cuenta Origen"
                    },
                    "valor": "001-00"
                },
                {
                    "tag": {
                        "clave": "Cuenta Destino"
                    },
                    "valor": "003-00"
                },
                {
                    "tag": {
                        "clave": "Monto Ahorrado"
                    },
                    "valor": "U$ 450,00"
                },
                {
                    "tag": {
                        "clave": "Monto a Ahorrar"
                    },
                    "valor": "U$ 150,00"
                },
                {
                    "tag": {
                        "clave": "Frecuencia"
                    },
                    "valor": "10/05/2019 10:23:55"
                },
                {
                    "tag": {
                        "clave": "ITF"
                    },
                    "valor": "999999"
                },
                {
                    "tag": {
                        "clave": "Fecha y Hora"
                    },
                    "valor": "15/07/2019 10:55:10"
                }
            ]
        }
    ```
    
* AHORRO_PROGRAMADO_EDICION_DE_AHORRO

    ```json
        {
            "templateCorreo": {
                "tipoCorreo": "AHORRO_PROGRAMADO_EDICION_DE_AHORRO",
                "remetente": {
                    "enderecoCorreo": "gabriel.schaidhauer@gmail.com"
                },
                "asunto": "Teste @ 123",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "Cliente"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "Nombre Ahorro"
                    },
                    "valor": "Educación de mi hijo"
                },
                {
                    "tag": {
                        "clave": "Cuenta Origen"
                    },
                    "valor": "001-00"
                },
                {
                    "tag": {
                        "clave": "Cuenta Destino"
                    },
                    "valor": "003-00"
                },
                {
                    "tag": {
                        "clave": "Monto"
                    },
                    "valor": "U$ 450,00"
                },
                {
                    "tag": {
                        "clave": "Frecuencia"
                    },
                    "valor": "Diario"
                },
                {
                    "tag": {
                        "clave": "ITF"
                    },
                    "valor": "89999"
                },
                {
                    "tag": {
                        "clave": "Fecha y Hora"
                    },
                    "valor": "15/07/2019 10:55:10"
                }
            ]
        }
    ```

* AHORRO_VUELTO_EDICION_DE_AHORRO

    ```json
        {
            "templateCorreo": {
                "tipoCorreo": "AHORRO_VUELTO_EDICION_DE_AHORRO",
                "remetente": {
                    "enderecoCorreo": "gabriel.schaidhauer@gmail.com"
                },
                "asunto": "Teste @ 123",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "Cliente"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "Nombre Ahorro"
                    },
                    "valor": "Educación de mi hijo"
                },
                {
                    "tag": {
                        "clave": "Cuenta Origen"
                    },
                    "valor": "001-00"
                },
                {
                    "tag": {
                        "clave": "Cuenta Destino"
                    },
                    "valor": "003-00"
                },
                {
                    "tag": {
                        "clave": "Monto de Redondeo"
                    },
                    "valor": "U$ 450,00"
                },
                {
                    "tag": {
                        "clave": "Frecuencia"
                    },
                    "valor": "Diario"
                },
                {
                    "tag": {
                        "clave": "ITF"
                    },
                    "valor": "9999999"
                },
                {
                    "tag": {
                        "clave": "Fecha y Hora"
                    },
                    "valor": "15/07/2019 10:55:10"
                }
            ]
        }
    ```
    
* AHORRO_VUELTO_SUPRESSION_DE_AHORRO

    ```json
        {
            "templateCorreo": {
                "tipoCorreo": "AHORRO_VUELTO_SUPRESSION_DE_AHORRO",
                "remetente": {
                    "enderecoCorreo": "gabriel.schaidhauer@gmail.com"
                },
                "asunto": "Teste @ 123",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "Cliente"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "Nombre Ahorro"
                    },
                    "valor": "Educación de mi hijo"
                },
                {
                    "tag": {
                        "clave": "Frecuencia"
                    },
                    "valor": "Diario"
                },
                {
                    "tag": {
                        "clave": "ITF"
                    },
                    "valor": "9999"
                },
                {
                    "tag": {
                        "clave": "Fecha y Hora"
                    },
                    "valor": "15/07/2019 10:55:10"
                }
            ]
        }
    ```
    
* AHORRO_PROGRAMADO_SUPRESSION_DE_AHORRO

    ```json
        {
            "templateCorreo": {
                "tipoCorreo": "AHORRO_PROGRAMADO_SUPRESSION_DE_AHORRO",
                "remetente": {
                    "enderecoCorreo": "gabriel.schaidhauer@gmail.com"
                },
                "asunto": "Teste @ 123",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "Cliente"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "Nombre Ahorro"
                    },
                    "valor": "Educación de mi hijo"
                },
                {
                    "tag": {
                        "clave": "Frecuencia"
                    },
                    "valor": "Diario"
                },
                {
                    "tag": {
                        "clave": "ITF"
                    },
                    "valor": "9999"
                },
                {
                    "tag": {
                        "clave": "Fecha y Hora"
                    },
                    "valor": "15/07/2019 10:55:10"
                }
            ]
        }
    ```
    
* DISPOSICION_EFECTIVO_OPERACION_COMPLETADA

    ```json
        {
            "templateCorreo": {
                "tipoCorreo": "DISPOSICION_EFECTIVO_OPERACION_COMPLETADA",
                "remetente": {
                    "enderecoCorreo": "gabriel.schaidhauer@gmail.com"
                },
                "asunto": "Teste @ 123",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "cliente"
                    },
                    "valor": "cliente *"
                },
                {
                    "tag": {
                        "clave": "tipoOperacion"
                    },
                    "valor": "tipoOperacion *"
                },
                {
                    "tag": {
                        "clave": "tarjeta"
                    },
                    "valor": " tarjeta *"
                },
                {
                    "tag": {
                        "clave": "montoCargo"
                    },
                    "valor": "montoCargo *"
                },
                {
                    "tag": {
                        "clave": "modalidad"
                    },
                    "valor": "modalidad *"
                },
                {
                    "tag": {
                        "clave": "numeroCuotas"
                    },
                    "valor": "numeroCuotas *"
                },
                {
                    "tag": {
                        "clave": "nombreBeneficiario"
                    },
                    "valor": "nombreBeneficiario *"
                },
                {
                    "tag": {
                        "clave": "cuentaAbono"
                    },
                    "valor": "cuentaAbono *"
                },
                {
                    "tag": {
                        "clave": "montoAbono"
                    },
                    "valor": "montoAbono *"
                },
                {
                    "tag": {
                        "clave": "itf"
                    },
                    "valor": "itf *"
                },
                {
                    "tag": {
                        "clave": "fechaOperacion"
                    },
                    "valor": "fechaOperacion *"
                },
                {
                    "tag": {
                        "clave": "descricion"
                    },
                    "valor": "descricion *"
                },
                {
                    "tag": {
                        "clave": "numero"
                    },
                    "valor": "123456"
                }
            ]
        }
    ```
    
* DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA

    ```json
        {
            "templateCorreo": {
                "tipoCorreo": "DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA",
                "remetente": {
                    "enderecoCorreo": "gabriel.schaidhauer@gmail.com"
                },
                "asunto": "Teste @ 123",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "cliente"
                    },
                    "valor": "cliente *"
                },
                {
                    "tag": {
                        "clave": "tipoOperacion"
                    },
                    "valor": "tipoOperacion *"
                },
                {
                    "tag": {
                        "clave": "tarjeta"
                    },
                    "valor": " tarjeta *"
                },
                {
                    "tag": {
                        "clave": "montoCargo"
                    },
                    "valor": "montoCargo *"
                },
                {
                    "tag": {
                        "clave": "modalidad"
                    },
                    "valor": "modalidad *"
                },
                {
                    "tag": {
                        "clave": "numeroCuotas"
                    },
                    "valor": "numeroCuotas *"
                },
                {
                    "tag": {
                        "clave": "nombreBeneficiario"
                    },
                    "valor": "nombreBeneficiario *"
                },
                {
                    "tag": {
                        "clave": "cuentaAbono"
                    },
                    "valor": "cuentaAbono *"
                },
                {
                    "tag": {
                        "clave": "montoAbono"
                    },
                    "valor": "montoAbono *"
                },
                {
                    "tag": {
                        "clave": "itf"
                    },
                    "valor": "itf *"
                },
                {
                    "tag": {
                        "clave": "fechaOperacion"
                    },
                    "valor": "fechaOperacion *"
                },
                {
                    "tag": {
                        "clave": "descricion"
                    },
                    "valor": "descricion *"
                }
            ]
        }
    ```
    
    
    
    