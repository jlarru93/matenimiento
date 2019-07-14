package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import io.swagger.model.TemplateCorreo;
import io.swagger.model.PostTemplateCorreoResponse;

public class PostTemplateCorreoResponseBuilder {
	
	public static PostTemplateCorreoResponseBuilder getInstace() {
		return new PostTemplateCorreoResponseBuilder();
	}
	
	public PostTemplateCorreoResponse build(Map<String, String> headers, TemplateCorreo TemplateCorreo) {
		PostTemplateCorreoResponse response = new PostTemplateCorreoResponse();
		response.setDatos(TemplateCorreo);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers));
		return response;
	}
	
}
