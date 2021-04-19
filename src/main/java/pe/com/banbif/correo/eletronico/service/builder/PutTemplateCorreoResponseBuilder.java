package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import io.swagger.model.TemplateCorreo;
import io.swagger.model.PutTemplateCorreoResponse;
import pe.com.banbif.correo.eletronico.service.models.PutTemplateCorreoDtoResponse;
import pe.com.banbif.correo.eletronico.service.models.TemplateCorreoDto;

public class PutTemplateCorreoResponseBuilder {
	
	public static PutTemplateCorreoResponseBuilder getInstace() {
		return new PutTemplateCorreoResponseBuilder();
	}
	
	public PutTemplateCorreoDtoResponse build(Map<String, String> headers, TemplateCorreoDto TemplateCorreo) {
		PutTemplateCorreoDtoResponse response = new PutTemplateCorreoDtoResponse();
		response.setDatos(TemplateCorreo);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers));
		return response;
	}
	
}
