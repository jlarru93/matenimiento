package pe.com.banbif.correo.eletronico.service.data.entity;

import io.swagger.model.MetadatoServicio;

public class PutEmailTagResponse {
	
	private MetadatoServicio meta;
	private EmailTag datos;
	
	public MetadatoServicio getMeta() {
		return meta;
	}
	public void setMeta(MetadatoServicio meta) {
		this.meta = meta;
	}
	public EmailTag getDatos() {
		return datos;
	}
	public void setDatos(EmailTag datos) {
		this.datos = datos;
	}
	
}
