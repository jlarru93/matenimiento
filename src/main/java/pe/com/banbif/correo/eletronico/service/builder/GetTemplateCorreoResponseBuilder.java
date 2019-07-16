package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import io.swagger.model.GetTemplateCorreoResponse;
import io.swagger.model.TemplateCorreo;

public class GetTemplateCorreoResponseBuilder {
	
	public static GetTemplateCorreoResponseBuilder getInstace() {
		return new GetTemplateCorreoResponseBuilder();
	}
	
	public GetTemplateCorreoResponse build(Map<String, String> headers, TemplateCorreo TemplateCorreo) {
		GetTemplateCorreoResponse response = new GetTemplateCorreoResponse();
		response.setDatos(TemplateCorreo);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers));
		return response;
	}
	
	
}
