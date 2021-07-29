package pe.com.banbif.mantenimiento.builder;

import java.util.Map;

import org.springframework.data.domain.Page;
import pe.com.banbif.mantenimiento.models.GetTemplatesCorreosDtoResponse;
import pe.com.banbif.mantenimiento.models.TemplateCorreoDto;

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
