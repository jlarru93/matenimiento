package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import pe.com.banbif.correo.eletronico.service.data.entity.EmailContent;
import pe.com.banbif.correo.eletronico.service.data.entity.GetEmailContentResponse;

public class GetEmailContentResponseBuilder {
	
	public static GetEmailContentResponseBuilder getInstace() {
		return new GetEmailContentResponseBuilder();
	}
	
	public GetEmailContentResponse build(Map<String, String> headers, EmailContent emailContent) {
		return build(headers, Arrays.asList(emailContent));
	}
	
	public GetEmailContentResponse build(Map<String, String> headers, List<EmailContent> emailContent) {
		GetEmailContentResponse response = new GetEmailContentResponse();
		response.setDatos(emailContent);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers));
		return response;
	}
	
}
