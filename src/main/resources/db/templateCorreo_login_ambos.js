// mongeez formatted javascript
// changeset martinelli:templateCorreo_login_ambos

db.templateCorreo.insert({
  "envioCorreoCliente": false,
  "remetente": {
    "enderecoCorreo": "banbif@banbif.com.pe"
  },
  "asunto": "Informe: Bloqueio IP Malicioso y mas de un Canal",
  "destinatario": {
    "enderecoCorreo": "banbif@banbif.com.pe"
  },
  "canal": "BANCA_POR_INTERNET",
			"tipoCorreo": "CONTROL_LOGIN_NOTIFICACION_IP_MALICIOSO_Y_MAS_DE_UN_CANAL",
			"content" : "<!DOCTYPE html>\r\n\r\n<head>\r\n    <title>Banbif - Bloqueio Login<\/title>\r\n    <meta http-equiv=\"Content-Type\" content=\"text\/html; charset=UTF-8\" \/>\r\n<\/head>\r\n\r\n<body>\r\n    <table class=\"x_x_MsoNormalTable\" style=\"width: 100.0%\" border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tbody>\r\n            <tr>\r\n                <td style=\"padding: 0cm 0cm 0cm 0cm\">\r\n                    <div align=\"center\">\r\n                        <table class=\"x_x_MsoNormalTable\" style=\"width: 495.0pt; background: #F8F8F8\" border=\"0\"\r\n                            width=\"729\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tbody>\r\n                                <tr>\r\n                                    <td style=\"padding: 0cm 0cm 0cm 0cm\">\r\n                                        <table class=\"x_x_MsoNormalTable\" style=\"width: 100.0%; background: white\"\r\n                                            border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                            <tbody>\r\n                                                <tr>\r\n                                                    <td style=\"padding: 0cm 0cm 0cm 0cm\">\r\n                                                        <p class=\"x_x_MsoNormal\" style=\"text-align: center\"\r\n                                                            align=\"center\">\r\n                                                            <span style=\"font-size: 7.5pt\">&nbsp;<\/span>\r\n                                                        <\/p>\r\n                                                    <\/td>\r\n                                                <\/tr>\r\n                                                <tr style=\"height: 67.5pt\">\r\n                                                    <td\r\n                                                        style=\"background: #0096D7; padding: 0cm 0cm 0cm 0cm; height: 67.5pt\">\r\n                                                        <p class=\"x_x_MsoNormal\">\r\n                                                            <img id=\"_x0000_i1025\" alt=\"BANBIF\"\r\n                                                                src=\"http:\/\/i.imgur.com\/6PjIx2t.png\">\r\n                                                        <\/p>\r\n                                                    <\/td>\r\n                                                <\/tr>\r\n                                                <tr>\r\n                                                    <td style=\"padding: 0cm 0cm 0cm 0cm\">\r\n                                                        <p class=\"x_x_MsoNormal\">\r\n                                                            <span style=\"font-size: 7.5pt\"><img id=\"_x0000_i1026\"\r\n                                                                    src=\"http:\/\/i.imgur.com\/0WOQ8cR.png\"><\/span>\r\n                                                        <\/p>\r\n                                                    <\/td>\r\n                                                <\/tr>\r\n                                                <tr>\r\n                                                    <td style=\"width: 495.0pt; border: none; border-bottom: solid #E3E2E2 1.0pt; padding: 7.5pt 15.0pt 22.5pt 30.0pt\"\r\n                                                        width=\"729\">\r\n                                                        <p class=\"x_x_MsoNormal\">\r\n                                                            <strong><span>Tipo de Notifica\u00E7\u00E3o<\/span><\/strong>\r\n                                                            <span><\/span>\r\n                                                        <\/p>\r\n                                                        <p class=\"x_x_MsoNormal\">\r\n                                                            <span\r\n                                                                style=\"font-size: 9pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAtenci\u00F3n comportamiento sospechoso - Intentos por m\u00E1s de un ip y m\u00E1s de un canal\r\n                                                            <\/span>\r\n                                                        <\/p>\r\n                                                    <\/td>\r\n                                                <\/tr>\r\n                                            <\/tbody>\r\n                                        <\/table>\r\n                                    <\/td>\r\n                                <\/tr>\r\n                                <tr>\r\n                                    <td style=\"padding: 0cm 0cm 0cm 0cm\" valign=\"top\">\r\n                                        <table class=\"x_x_MsoNormalTable\"\r\n                                            style=\"width: 495.0pt; background: white; border: none; border-bottom: solid #E3E2E2 1.0pt\"\r\n                                            border=\"1\" width=\"729\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                            <tbody>\r\n                                                <tr>\r\n                                                    <td style=\"border: none; padding: 1.35pt 15.0pt 1.35pt 30.0pt\">\r\n                                                        <table class=\"x_x_MsoNormalTable\" style=\"width: 100.0%\"\r\n                                                            border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                                            <tbody>\r\n                                                                <tr>\r\n                                                                    <td style=\"width: 50.0%; border: none; border-bottom: solid #CCCCCC 1.0pt; background: white; padding: 7.5pt 1.5pt 3.75pt 0cm\"\r\n                                                                        colspan=\"2\" nowrap=\"nowrap\" width=\"50%\">\r\n                                                                        <p class=\"x_x_MsoNormal\">\r\n                                                                            <span\r\n                                                                                style=\"font-size: 11.5pt; font-family: 'Verdana', sans-serif; color: #0097a7\">Datos\r\n                                                                                del intento de acceso\r\n                                                                            <\/span>\r\n                                                                        <\/p>\r\n                                                                    <\/td>\r\n                                                                <\/tr>\r\n                                                                <tr>\r\n                                                                    <td style=\"width: 20.0%; background: white; padding: 3.75pt 7.5pt 0cm 0cm\"\r\n                                                                        width=\"20%\">\r\n                                                                        <p class=\"x_x_MsoNormal\">\r\n                                                                            <span\r\n                                                                                style=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">Horario\r\n                                                                            <\/span>\r\n                                                                        <\/p>\r\n                                                                    <\/td>\r\n                                                                    <td style=\"width: 50.0%; padding: 3.75pt 3.75pt 0cm 7.5pt\"\r\n                                                                        width=\"50%\">\r\n                                                                        <p class=\"x_x_MsoNormal\">\r\n                                                                            <span style=\"font-size: 10.0pt; font-family: 'Verdana', sans-serif; color: #333333\">\r\n                                                                               ${FECHA}\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/p>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"width: 20.0%; background: white; padding: 3.75pt 7.5pt 0cm 0cm\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"20%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"x_x_MsoNormal\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">DNI\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/p>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"width: 50.0%; padding: 3.75pt 3.75pt 0cm 7.5pt\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"50%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"x_x_MsoNormal\">\r\n                                                                            <span style=\"font-size: 10.0pt; font-family: 'Verdana', sans-serif; color: #333333\">\r\n                                                                                ${DNI}\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/p>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"width: 20.0%; background: white; padding: 3.75pt 7.5pt 0cm 0cm\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"20%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"x_x_MsoNormal\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">Direcci\u00F3n IP\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/p>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"width: 50.0%; padding: 3.75pt 3.75pt 0cm 7.5pt\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"50%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"x_x_MsoNormal\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size: 10.0pt; font-family: 'Verdana', sans-serif; color: #333333\">\r\n                                                                                ${LISTA_IP}\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/p>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"width: 20.0%; border: none; border-bottom: solid #E3E2E2 1.0pt; padding: 3.75pt 3.75pt 15.0pt 0cm\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"20%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"x_x_MsoNormal\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-size: 10.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">Canal\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/p>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"width: 50.0%; border: none; border-bottom: solid #E3E2E2 1.0pt; background: white; padding: 3.75pt 7.5pt 15.0pt 7.5pt\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"50%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"x_x_MsoNormal\">\r\n                                                                            <span style=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #333333\">\r\n                                                                                    ${LISTA_CANALES}\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/p>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/tbody>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<\/tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border: none; border-bottom: solid #CCCCCC 1.0pt; padding: 1.35pt 15.0pt 1.35pt 30.0pt\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"x_x_MsoNormal\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/p>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<\/tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr style=\"height: 37.5pt\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border: none; border-bottom: solid #E6E5E5 1.0pt; padding: 1.35pt 15.0pt 1.35pt 30.0pt; height: 37.5pt\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"x_x_MsoNormal\" style=\"text-align: center\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-size: 9.0pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">Banca\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTelef\u00F3nica: Lima (01) 631-9000 Provincias 0-801-0-0456.\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tBanca Telef\u00F3nica Empresas: Lima (01) 625-3333 Provincias\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t0-801-0-0457\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/p>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<\/tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr style=\"height: 30.0pt\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"border: none; padding: 1.35pt 15.0pt 1.35pt 30.0pt; height: 30.0pt\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"x_x_MsoNormal\" style=\"text-align: center\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\talign=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-size: 8.5pt; font-family: 'Verdana', sans-serif; color: #8a8a8a\">Nota:\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEste e-mail es generado de manera autom\u00E1tica, por favor\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tno responda a este mensaje.\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<\/p>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<\/tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<\/tbody>\r\n\t\t\t\t\t\t\t\t\t\t<\/table>\r\n\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t<\/tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td style=\"padding: 0cm 0cm 0cm 0cm\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t<p class=\"x_x_MsoNormal\">\r\n\t\t\t\t\t\t\t\t\t\t\t&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t<\/p>\r\n\t\t\t\t\t\t\t\t\t<\/td>\r\n\t\t\t\t\t\t\t\t<\/tr>\r\n\t\t\t\t\t\t\t<\/tbody>\r\n\t\t\t\t\t\t<\/table>\r\n\t\t\t\t\t<\/div>\r\n\t\t\t\t<\/td>\r\n\t\t\t<\/tr>\r\n\t\t<\/tbody>\r\n\t<\/table>\r\n<\/body>\r\n\r\n<\/html>"
			});