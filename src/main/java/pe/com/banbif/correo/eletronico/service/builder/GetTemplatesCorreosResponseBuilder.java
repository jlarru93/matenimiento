package pe.com.banbif.correo.eletronico.service.builder;

import java.util.List;
import java.util.Map;

import io.swagger.model.GetTemplatesCorreosResponse;
import io.swagger.model.TemplateCorreo;

public class GetTemplatesCorreosResponseBuilder {
	
	public static GetTemplatesCorreosResponseBuilder getInstace() {
		return new GetTemplatesCorreosResponseBuilder();
	}
	
	public GetTemplatesCorreosResponse build(Map<String, String> headers, List<TemplateCorreo> contents) {
		GetTemplatesCorreosResponse response = new GetTemplatesCorreosResponse();
		response.setDatos(contents);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers, contents.size()));
		return response;
	}
	
}
