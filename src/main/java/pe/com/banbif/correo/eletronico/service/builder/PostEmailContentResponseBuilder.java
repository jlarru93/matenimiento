package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import io.swagger.model.EmailContent;
import io.swagger.model.PostEmailContentResponse;

public class PostEmailContentResponseBuilder {
	
	public static PostEmailContentResponseBuilder getInstace() {
		return new PostEmailContentResponseBuilder();
	}
	
	public PostEmailContentResponse build(Map<String, String> headers, EmailContent emailContent) {
		PostEmailContentResponse response = new PostEmailContentResponse();
		response.setDatos(emailContent);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers));
		return response;
	}
	
}
