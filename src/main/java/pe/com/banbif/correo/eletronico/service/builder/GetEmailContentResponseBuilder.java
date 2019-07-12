package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import io.swagger.model.EmailContent;
import io.swagger.model.GetEmailContentResponse;

public class GetEmailContentResponseBuilder {
	
	public static GetEmailContentResponseBuilder getInstace() {
		return new GetEmailContentResponseBuilder();
	}
	
	public GetEmailContentResponse build(Map<String, String> headers, EmailContent emailContent) {
		return build(headers, Arrays.asList(emailContent));
	}
	
	public GetEmailContentResponse build(Map<String, String> headers, List<EmailContent> contents) {
		GetEmailContentResponse response = new GetEmailContentResponse();
		response.setDatos(contents);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers, contents.size()));
		return response;
	}
	
}
