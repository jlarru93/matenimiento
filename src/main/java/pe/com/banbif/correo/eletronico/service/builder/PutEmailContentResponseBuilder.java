package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import pe.com.banbif.correo.eletronico.service.data.entity.EmailContent;
import pe.com.banbif.correo.eletronico.service.data.entity.PutEmailContentResponse;

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
