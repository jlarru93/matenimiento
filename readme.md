**Templates**

Existem 5 templates de envio de e-mail mapeados, cada um deles tem seu set de variáveis para ser enviada, segue relação abaixo: 

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
    