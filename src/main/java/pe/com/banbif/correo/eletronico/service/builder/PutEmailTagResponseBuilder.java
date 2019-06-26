package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import pe.com.banbif.correo.eletronico.service.data.entity.EmailTag;
import pe.com.banbif.correo.eletronico.service.data.entity.PutEmailTagResponse;

public class PutEmailTagResponseBuilder {
	
	public static PutEmailTagResponseBuilder getInstace() {
		return new PutEmailTagResponseBuilder();
	}
	
	public PutEmailTagResponse build(Map<String, String> headers, EmailTag emailTag) {
		PutEmailTagResponse response = new PutEmailTagResponse();
		response.setDatos(emailTag);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers));
		return response;
	}
	
}
