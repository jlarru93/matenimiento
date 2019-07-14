package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import io.swagger.model.TemplateCorreo;
import io.swagger.model.PutTemplateCorreoResponse;

public class PutTemplateCorreoResponseBuilder {
	
	public static PutTemplateCorreoResponseBuilder getInstace() {
		return new PutTemplateCorreoResponseBuilder();
	}
	
	public PutTemplateCorreoResponse build(Map<String, String> headers, TemplateCorreo TemplateCorreo) {
		PutTemplateCorreoResponse response = new PutTemplateCorreoResponse();
		response.setDatos(TemplateCorreo);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers));
		return response;
	}
	
}
