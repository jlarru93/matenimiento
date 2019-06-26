package pe.com.banbif.correo.eletronico.service.data.entity;

import io.swagger.model.MetadatoServicio;

public class PostEmailContentResponse {
	
	private MetadatoServicio meta;
	private EmailContent datos;
	
	public MetadatoServicio getMeta() {
		return meta;
	}
	public void setMeta(MetadatoServicio meta) {
		this.meta = meta;
	}
	public EmailContent getDatos() {
		return datos;
	}
	public void setDatos(EmailContent datos) {
		this.datos = datos;
	}
	
}
