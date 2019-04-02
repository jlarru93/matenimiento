**- Crear Secrets DSV:**

* oc create secret generic spring-correo-eletronico-service --from-literal=spring.mail.username=gabriel.schaidhauer.ntconsult --from-literal=spring.mail.password=S3gur4nc4+ --from-literal=spring.data.mongodb.database=maildb --from-literal=spring.data.mongodb.username=userSF7 --from-literal=spring.data.mongodb.password=8MegXXohsbyPGkrT

* oc create configmap spring-correo-eletronico-service --from-env-file=conf/cm-dev.properties

* Despliegue en Openshift
oc login https://desconsoleops.dombif.peru
oc project rhdm
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
                        "clave": "customerName"
                    },
                    "valor": "John Doe"
                },
                {
                	"tag": {
                		"clave": "originAccount"
                	},
                	"valor": "001-00"
                },
                {
                	"tag": {
                		"clave": "destinyAccount"
                	},
                	"valor": "003-00"
                },
                {
                	"tag": {
                		"clave": "value"
                	},
                	"valor": "U$ 450,00"
                },
                {
                	"tag": {
                		"clave": "frequency"
                	},
                	"valor": "Diario"
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
                "asunto": "Teste @ 123",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "customerName"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "originAccount"
                    },
                    "valor": "001-00"
                },
                {
                    "tag": {
                        "clave": "destinyAccount"
                    },
                    "valor": "003-00"
                },
                {
                    "tag": {
                        "clave": "value"
                    },
                    "valor": "U$ 450,00"
                },
                {
                    "tag": {
                        "clave": "datetime"
                    },
                    "valor": "10/05/2019 10:00:23"
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
                "asunto": "Teste @ 123",
                "destinatario": {
                    "enderecoCorreo": "gabriel.schaidhauer@ntconsult.com.br"
                }
            },
            "valoresTags": [
                {
                    "tag": {
                        "clave": "customerName"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "originAccount"
                    },
                    "valor": "001-00"
                },
                {
                    "tag": {
                        "clave": "destinyAccount"
                    },
                    "valor": "003-00"
                },
                {
                    "tag": {
                        "clave": "value"
                    },
                    "valor": "U$ 450,00"
                },
                {
                    "tag": {
                        "clave": "frequency"
                    },
                    "valor": "A cada transacion"
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
                        "clave": "customerName"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "originAccount"
                    },
                    "valor": "001-00"
                },
                {
                    "tag": {
                        "clave": "destinyAccount"
                    },
                    "valor": "003-00"
                },
                {
                    "tag": {
                        "clave": "value"
                    },
                    "valor": "U$ 450,00"
                },
                {
                    "tag": {
                        "clave": "datetime"
                    },
                    "valor": "10/05/2019 10:00:23"
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
                        "clave": "customerName"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "originAccount"
                    },
                    "valor": "001-00"
                },
                {
                    "tag": {
                        "clave": "destinyAccount"
                    },
                    "valor": "003-00"
                },
                {
                    "tag": {
                        "clave": "value"
                    },
                    "valor": "U$ 450,00"
                },
                {
                    "tag": {
                        "clave": "datetime"
                    },
                    "valor": "10/05/2019 10:23:55"
                }
            ]
        }
    ```
    
* AHORRO_PROGRAMADO_EDICION_DE_AHORRO

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
                        "clave": "customerName"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "originAccount"
                    },
                    "valor": "001-00"
                },
                {
                    "tag": {
                        "clave": "destinyAccount"
                    },
                    "valor": "003-00"
                },
                {
                    "tag": {
                        "clave": "value"
                    },
                    "valor": "U$ 450,00"
                },
                {
                    "tag": {
                        "clave": "frequency"
                    },
                    "valor": "Diario"
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
                        "clave": "customerName"
                    },
                    "valor": "John Doe"
                },
                {
                    "tag": {
                        "clave": "originAccount"
                    },
                    "valor": "001-00"
                },
                {
                    "tag": {
                        "clave": "destinyAccount"
                    },
                    "valor": "003-00"
                },
                {
                    "tag": {
                        "clave": "value"
                    },
                    "valor": "U$ 450,00"
                },
                {
                    "tag": {
                        "clave": "frequency"
                    },
                    "valor": "A cada transacion"
                }
            ]
        }
    ```
    