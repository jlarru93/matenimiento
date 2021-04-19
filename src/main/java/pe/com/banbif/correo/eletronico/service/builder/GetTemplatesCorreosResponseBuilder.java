package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import org.springframework.data.domain.Page;
import io.swagger.model.TemplateCorreo;
import pe.com.banbif.correo.eletronico.service.models.GetTemplatesCorreosDtoResponse;
import pe.com.banbif.correo.eletronico.service.models.TemplateCorreoDto;

public class GetTemplatesCorreosResponseBuilder {
	
	public static GetTemplatesCorreosResponseBuilder getInstace() {
		return new GetTemplatesCorreosResponseBuilder();
	}
	
	public GetTemplatesCorreosDtoResponse build(Map<String, String> headers, Page<TemplateCorreoDto> contents, int numeroPagina) {
		GetTemplatesCorreosDtoResponse response = new GetTemplatesCorreosDtoResponse();
		response.setDatos(contents.getContent());
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers, (int) contents.getTotalElements()));
		response.getMeta().setNumeroTotalPaginas((int) contents.getTotalPages());
		response.getMeta().setNumeroPaginaSiguiente(contents.getTotalPages() > numeroPagina + 1 ? numeroPagina + 1 : null);
		
		return response;
	}
	
}
