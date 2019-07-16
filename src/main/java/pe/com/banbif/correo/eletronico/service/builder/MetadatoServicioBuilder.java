package pe.com.banbif.correo.eletronico.service.builder;

import java.util.Map;
import java.util.UUID;

import io.swagger.model.MetadatoServicio;

public class MetadatoServicioBuilder {
	
	public static MetadatoServicioBuilder getInstace() {
		return new MetadatoServicioBuilder();
	}
	
	public MetadatoServicio buildMeta(Map<String, String> headers) {
		return buildMeta(headers, 0);
	}
	
	public MetadatoServicio buildMeta(Map<String, String> headers, int qtd) {
		String idTransaccion = headers.getOrDefault("idtransaccion", UUID.randomUUID().toString());
		
		MetadatoServicio m = new MetadatoServicio();
		m.setIdTransaccion(idTransaccion);
		m.setResultado(true);
		m.setTotalRegistros(qtd > 0 ? qtd : null);
		return m;
	}

}
