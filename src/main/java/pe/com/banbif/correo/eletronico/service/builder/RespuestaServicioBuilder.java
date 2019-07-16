package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;

import io.swagger.model.RespuestaServicio;

public class RespuestaServicioBuilder {
	
	public static RespuestaServicioBuilder getInstace() {
		return new RespuestaServicioBuilder();
	}
	
	public RespuestaServicio build(Map<String, String> headers) {
		RespuestaServicio response = new RespuestaServicio();
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers));
		return response;
	}
	
}
