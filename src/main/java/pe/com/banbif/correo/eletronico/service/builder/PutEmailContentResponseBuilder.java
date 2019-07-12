package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import io.swagger.model.EmailContent;
import io.swagger.model.PutEmailContentResponse;

public class PutEmailContentResponseBuilder {
	
	public static PutEmailContentResponseBuilder getInstace() {
		return new PutEmailContentResponseBuilder();
	}
	
	public PutEmailContentResponse build(Map<String, String> headers, EmailContent emailContent) {
		PutEmailContentResponse response = new PutEmailContentResponse();
		response.setDatos(emailContent);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers));
		return response;
	}
	
}
