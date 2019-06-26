package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import pe.com.banbif.correo.eletronico.service.data.entity.EmailTag;
import pe.com.banbif.correo.eletronico.service.data.entity.PostEmailTagResponse;

public class PostEmailTagResponseBuilder {
	
	public static PostEmailTagResponseBuilder getInstace() {
		return new PostEmailTagResponseBuilder();
	}
	
	public PostEmailTagResponse build(Map<String, String> headers, EmailTag emailContent) {
		PostEmailTagResponse response = new PostEmailTagResponse();
		response.setDatos(emailContent);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers));
		return response;
	}
	
}
