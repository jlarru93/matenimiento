package pe.com.banbif.correo.eletronico.service.data.entity;

import java.util.List;

import io.swagger.model.MetadatoServicio;

public class GetEmailTagResponse {
	
	private MetadatoServicio meta;
	private List<EmailTag> datos;
	
	public MetadatoServicio getMeta() {
		return meta;
	}
	public void setMeta(MetadatoServicio meta) {
		this.meta = meta;
	}
	public List<EmailTag> getDatos() {
		return datos;
	}
	public void setDatos(List<EmailTag> datos) {
		this.datos = datos;
	}

	
}
