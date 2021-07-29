package pe.com.banbif.mantenimiento.builder;

import java.util.Map;

import pe.com.banbif.mantenimiento.models.GetTemplateCorreoDtoResponse;
import pe.com.banbif.mantenimiento.models.TemplateCorreoDto;

public class GetTemplateCorreoResponseBuilder {
	
	public static GetTemplateCorreoResponseBuilder getInstace() {
		return new GetTemplateCorreoResponseBuilder();
	}
	
	public GetTemplateCorreoDtoResponse build(Map<String, String> headers, TemplateCorreoDto TemplateCorreo) {
		GetTemplateCorreoDtoResponse response = new GetTemplateCorreoDtoResponse();
		response.setDatos(TemplateCorreo);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers));
		return response;
	}
	
	
}
