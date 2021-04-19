package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import io.swagger.model.TemplateCorreo;
import io.swagger.model.PostTemplateCorreoResponse;
import pe.com.banbif.correo.eletronico.service.models.PostTemplateCorreoDtoResponse;
import pe.com.banbif.correo.eletronico.service.models.TemplateCorreoDto;

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
