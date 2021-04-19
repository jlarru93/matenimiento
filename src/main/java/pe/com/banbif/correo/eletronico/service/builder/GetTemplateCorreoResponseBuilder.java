package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import io.swagger.model.GetTemplateCorreoResponse;
import io.swagger.model.TemplateCorreo;
import pe.com.banbif.correo.eletronico.service.models.GetTemplateCorreoDtoResponse;
import pe.com.banbif.correo.eletronico.service.models.TemplateCorreoDto;

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
