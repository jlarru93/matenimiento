package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import org.springframework.data.domain.Page;

import io.swagger.model.GetTemplatesCorreosResponse;
import io.swagger.model.TemplateCorreo;

public class GetTemplatesCorreosResponseBuilder {
	
	public static GetTemplatesCorreosResponseBuilder getInstace() {
		return new GetTemplatesCorreosResponseBuilder();
	}
	
	public GetTemplatesCorreosResponse build(Map<String, String> headers, Page<TemplateCorreo> contents, int numeroPagina) {
		GetTemplatesCorreosResponse response = new GetTemplatesCorreosResponse();
		response.setDatos(contents.getContent());
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers, (int) contents.getTotalElements()));
		response.getMeta().setNumeroTotalPaginas((int) contents.getTotalPages());
		response.getMeta().setNumeroPaginaSiguiente(contents.getTotalPages() > numeroPagina + 1 ? numeroPagina + 1 : null);
		
		return response;
	}
	
}
