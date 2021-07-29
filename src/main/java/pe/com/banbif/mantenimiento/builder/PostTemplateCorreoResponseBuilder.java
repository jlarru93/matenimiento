package pe.com.banbif.mantenimiento.builder;

import java.util.Map;

import pe.com.banbif.mantenimiento.models.PostTemplateCorreoDtoResponse;
import pe.com.banbif.mantenimiento.models.TemplateCorreoDto;

public class PostTemplateCorreoResponseBuilder {
	
	public static PostTemplateCorreoResponseBuilder getInstace() {
		return new PostTemplateCorreoResponseBuilder();
	}
	
	public PostTemplateCorreoDtoResponse build(Map<String, String> headers, TemplateCorreoDto TemplateCorreo) {
		PostTemplateCorreoDtoResponse response = new PostTemplateCorreoDtoResponse();
		response.setDatos(TemplateCorreo);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers));
		return response;
	}
	
}
