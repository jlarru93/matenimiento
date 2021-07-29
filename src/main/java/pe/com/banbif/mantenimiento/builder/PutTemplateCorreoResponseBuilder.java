package pe.com.banbif.mantenimiento.builder;

import java.util.Map;

import pe.com.banbif.mantenimiento.models.PutTemplateCorreoDtoResponse;
import pe.com.banbif.mantenimiento.models.TemplateCorreoDto;

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
