// mongeez formatted javascript
// changeset martinelli:templateCorreo_ahorro_programado_cambiado

db.templateCorreo.insert({
  "envioCorreoCliente": true,
  "remetente": {
    "enderecoCorreo": "banbif@banbif.com.pe"
  },
  "asunto": "",

  "destinatario": {

    "enderecoCorreo": "banbif@banbif.com.pe"
  },
  "canal": "BACKOFFICE",
			"tipoCorreo": "AHORRO_PROGRAMADO_EDICION_DE_AHORRO",
			"contenido":"<!DOCTYPE html>\r\n<html lang=\"es\">\r\n\r\n<head>\r\n    <title>BanBif - Ahorro Programado <\/title>\r\n    <meta http-equiv=\"Content-Type\" content=\"text\/html; charset=UTF-8\"\/>\r\n    <meta http-equiv=\"content-language\" content=\"es\">\r\n<\/head>\r\n\r\n<body>\r\n<table class=\"x_x_MsoNormalTable\" style=\"width: 100.0%\" border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tbody>\r\n    <tr>\r\n        <td style=\"padding: 0cm 0cm 0cm 0cm\">\r\n            <div align=\"center\">\r\n                <table class=\"x_x_MsoNormalTable\" style=\"width: 495.0pt; background: #F8F8F8\" border=\"0\"\r\n                       width=\"729\" cellspacing=\"0\" cellpadding=\"0\">\r\n                    <tbody>\r\n                    <tr>\r\n                        <td style=\"padding: 0cm 0cm 0cm 0cm\">\r\n                            <table class=\"x_x_MsoNormalTable\" style=\"width: 100.0%; background: white\"\r\n                                   border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                <tbody>\r\n                                <tr>\r\n                                    <td style=\"padding: 0cm 0cm 0cm 0cm\">\r\n                                        <p class=\"x_x_MsoNormal\" style=\"text-align: center\" align=\"center\">\r\n                                            <span style=\"font-size: 7.5pt\">&nbsp; <\/span>\r\n                                        <\/p>\r\n                                    <\/td>\r\n                                <\/tr>\r\n                                <tr style=\"height: 67.5pt\">\r\n                                    <td style=\"background: #0096D7; padding: 0cm 0cm 0cm 0cm; height: 67.5pt\">\r\n                                        <p class=\"x_x_MsoNormal\">\r\n                                            <img id=\"_x0000_i1025\" alt=\"BANBIF\" src=\"http:\/\/i.imgur.com\/6PjIx2t.png\">\r\n                                        <\/p>\r\n                                    <\/td>\r\n                                <\/tr>\r\n                                <tr>\r\n                                    <td style=\"padding: 0cm 0cm 0cm 0cm\">\r\n                                        <img id=\"_x0000_i1026\"\r\n                                             src=\"http:\/\/i.imgur.com\/0WOQ8cR.png\">\r\n                                    <\/td>\r\n                                <\/tr>\r\n                                <tr>\r\n                                    <td style=\"width: 495.0pt; border: none; border-bottom: solid #E3E2E2 1.0pt; padding: 7.5pt 15.0pt 22.5pt 30.0pt\"\r\n                                        width=\"729\">\r\n                                        <p class=\"x_x_MsoNormal\">\r\n                                            <strong><span>Ahorro Programado \u2013 Programaci\u00F3n Cambiado con Exit\u00F3<\/span><\/strong>\r\n                                            <span><\/span>\r\n                                        <\/p>\r\n                                        <p class=\"x_x_MsoNormal\">\r\n                                            <span style=\"font-size: 9pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\"><\/span>\r\n                                        <\/p>\r\n                                    <\/td>\r\n                                <\/tr>\r\n                                <\/tbody>\r\n                            <\/table>\r\n                        <\/td>\r\n                    <\/tr>\r\n                    <tr>\r\n                        <td style=\"padding: 0cm 0cm 0cm 0cm\" valign=\"top\">\r\n                            <table class=\"x_x_MsoNormalTable\"\r\n                                   style=\"width: 495.0pt; background: white; border: none; border-bottom: solid #E3E2E2 1.0pt\"\r\n                                   border=\"1\" width=\"729\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                <tbody>\r\n                                <tr>\r\n                                    <td style=\"border: none; padding: 1.35pt 15.0pt 1.35pt 30.0pt\">\r\n                                        <table class=\"x_x_MsoNormalTable\" style=\"width: 100.0%\"\r\n                                               border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                            <tbody>\r\n                                            <tr>\r\n                                                <td style=\"width: 50.0%; border: none; border-bottom: solid #CCCCCC 1.0pt; background: white; padding: 7.5pt 1.5pt 3.75pt 0cm\"\r\n                                                    colspan=\"2\" nowrap=\"nowrap\" width=\"50%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 11.5pt; font-family: 'Verdana', sans-serif; color: #0097a7\"> \r\n                                                                Informaci\u00F3n de la Programaci\u00F3n\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                            <\/tr>\r\n                                            <tr>\r\n                                                <td style=\"width: 20.0%; background: white; padding: 3.75pt 7.5pt 0cm 0cm\" width=\"20%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">\r\n                                                                Cliente\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                                <td style=\"width: 50.0%; padding: 3.75pt 3.75pt 0cm 7.5pt\" width=\"50%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 10.0pt; font-family: 'Verdana', sans-serif; color: #333333\">\r\n                                                                ${NOMBRE_CLIENTE}\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                            <\/tr>\r\n                                            <tr>\r\n                                                <td style=\"width: 20.0%; background: white; padding: 3.75pt 7.5pt 0cm 0cm\" width=\"20%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">\r\n                                                                Nombre Ahorro\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                                <td style=\"width: 50.0%; padding: 3.75pt 3.75pt 0cm 7.5pt\" width=\"50%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 10.0pt; font-family: 'Verdana', sans-serif; color: #333333\">\r\n                                                                ${NOMBRE_AHORRO}\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                            <\/tr>\r\n                                            <tr>\r\n                                                <td style=\"width: 20.0%; background: white; padding: 3.75pt 7.5pt 0cm 0cm\" width=\"20%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">\r\n                                                                Cuenta Origen\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                                <td style=\"width: 50.0%; padding: 3.75pt 3.75pt 0cm 7.5pt\" width=\"50%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 10.0pt; font-family: 'Verdana', sans-serif; color: #333333\">\r\n                                                                ${CUENTA_ORIGEN}\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                            <\/tr>\r\n                                            <tr>\r\n                                                <td style=\"width: 20.0%; background: white; padding: 3.75pt 7.5pt 0cm 0cm\" width=\"20%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">\r\n                                                                Cuenta Destino\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                                <td style=\"width: 50.0%; padding: 3.75pt 3.75pt 0cm 7.5pt\" width=\"50%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 10.0pt; font-family: 'Verdana', sans-serif; color: #333333\">\r\n                                                                ${CUENTA_DESTINO}\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                            <\/tr>\r\n                                            <tr>\r\n                                                <td style=\"width: 20.0%; background: white; padding: 3.75pt 7.5pt 0cm 0cm\" width=\"20%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">\r\n                                                                Monto a Ahorrar\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                                <td style=\"width: 50.0%; padding: 3.75pt 3.75pt 0cm 7.5pt\" width=\"50%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 10.0pt; font-family: 'Verdana', sans-serif; color: #333333\">\r\n                                                                ${MONTO_POR_AHORRA}\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                            <\/tr>\r\n                                            <tr>\r\n                                                <td style=\"width: 20.0%; background: white; padding: 3.75pt 7.5pt 0cm 0cm\" width=\"20%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">\r\n                                                                Frecuencia\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                                <td style=\"width: 50.0%; padding: 3.75pt 3.75pt 0cm 7.5pt\" width=\"50%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 10.0pt; font-family: 'Verdana', sans-serif; color: #333333\">\r\n                                                                ${FRECUENCIA_AHORRO}\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                            <\/tr>\r\n                                            <tr>\r\n                                                <td style=\"width: 20.0%; background: white; padding: 3.75pt 7.5pt 0cm 0cm\" width=\"20%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">\r\n                                                                Ciclo de Vida\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                                <td style=\"width: 50.0%; padding: 3.75pt 3.75pt 0cm 7.5pt\" width=\"50%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 10.0pt; font-family: 'Verdana', sans-serif; color: #333333\">\r\n                                                                ${CICLO_VIDA}\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                            <\/tr>\r\n                                            <tr>\r\n                                                <td style=\"width: 20.0%; background: white; padding: 3.75pt 7.5pt 0cm 0cm\" width=\"20%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">\r\n                                                                Fecha y Hora\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                                <td style=\"width: 50.0%; padding: 3.75pt 3.75pt 0cm 7.5pt\" width=\"50%\">\r\n                                                    <p class=\"x_x_MsoNormal\">\r\n                                                        <span style=\"font-size: 10.0pt; font-family: 'Verdana', sans-serif; color: #333333\">\r\n                                                                ${FECHA_FIN}\r\n                                                        <\/span>\r\n                                                    <\/p>\r\n                                                <\/td>\r\n                                            <\/tr>\r\n                                            <\/tbody>\r\n                                        <\/table>\r\n                                    <\/td>\r\n                                <\/tr>\r\n                                <tr>\r\n                                    <td style=\"border: none; border-bottom: solid #CCCCCC 1.0pt; padding: 1.35pt 15.0pt 1.35pt 30.0pt\">\r\n                                        <p class=\"x_x_MsoNormal\">\r\n                                            &nbsp;\r\n                                        <\/p>\r\n                                    <\/td>\r\n                                <\/tr>\r\n                                <tr style=\"height: 37.5pt\">\r\n                                    <td style=\"border: none; border-bottom: solid #E6E5E5 1.0pt; padding: 1.35pt 15.0pt 1.35pt 30.0pt; height: 37.5pt\">\r\n                                        <p class=\"x_x_MsoNormal\" style=\"text-align: center\" align=\"center\">\r\n                                            <span style=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">\r\n                                                Banca Telef\u00F3nica: Lima (01) 631-9000 Provincias 0-801-0-0456.\r\n                                                Banca Telef\u00F3nica Empresas: <br>Lima (01) 625-3333 Provincias\r\n                                                0-801-0-0457\r\n                                            <\/span>\r\n                                        <\/p>\r\n                                    <\/td>\r\n                                <\/tr>\r\n                                <tr style=\"height: 30.0pt\">\r\n                                    <td style=\"border: none; padding: 1.35pt 15.0pt 1.35pt 30.0pt; height: 30.0pt\">\r\n                                        <p class=\"x_x_MsoNormal\" style=\"text-align: center\" align=\"center\">\r\n                                            <span style=\"font-size: 8.5pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">Nota:\r\n                                                Este e-mail es generado de manera autom\u00E1tica, por favor\r\n                                                no responda a este mensaje.\r\n                                            <\/span>\r\n                                        <\/p>\r\n                                    <\/td>\r\n                                <\/tr>\r\n                                <\/tbody>\r\n                            <\/table>\r\n                        <\/td>\r\n                    <\/tr>\r\n                    <tr>\r\n                        <td style=\"padding: 0cm 0cm 0cm 0cm\" valign=\"top\">\r\n                            <p class=\"x_x_MsoNormal\">\r\n                                &nbsp;\r\n                                <!-- node type 8 -->\r\n                            <\/p>\r\n                        <\/td>\r\n                    <\/tr>\r\n                    <\/tbody>\r\n                <\/table>\r\n            <\/div>\r\n        <\/td>\r\n    <\/tr>\r\n    <\/tbody>\r\n<\/table>\r\n<\/body>\r\n\r\n<\/html>"});