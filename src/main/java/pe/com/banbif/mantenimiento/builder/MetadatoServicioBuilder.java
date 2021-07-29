package pe.com.banbif.mantenimiento.builder;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import io.swagger.model.MensajeServicio;
import io.swagger.model.MensajeServicio.TipoEnum;
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
		m.setMensajes(buildMesajes());
		return m;
	}

	private List<MensajeServicio> buildMesajes() {
		MensajeServicio m = new MensajeServicio();
		m.setCodigo("ESM00");
		m.setMensaje("Solicitud exitosa y generó una representación");
		m.setTipo(TipoEnum.INFO);
		return Arrays.asList(m);
	}

}
