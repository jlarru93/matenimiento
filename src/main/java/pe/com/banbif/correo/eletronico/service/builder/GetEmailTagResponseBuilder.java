package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import pe.com.banbif.correo.eletronico.service.data.entity.EmailTag;
import pe.com.banbif.correo.eletronico.service.data.entity.GetEmailTagResponse;

public class GetEmailTagResponseBuilder {
	
	public static GetEmailTagResponseBuilder getInstace() {
		return new GetEmailTagResponseBuilder();
	}
	
	public GetEmailTagResponse build(Map<String, String> headers, EmailTag emailtag) {
		return build(headers, Arrays.asList(emailtag));
	}
	
	public GetEmailTagResponse build(Map<String, String> headers, List<EmailTag> tags) {
		GetEmailTagResponse response = new GetEmailTagResponse();
		response.setDatos(tags);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers, tags.size()));
		return response;
	}
	
}
