package pe.com.banbif.correo.eletronico.service.data.entity;

import java.util.List;

import io.swagger.model.MetadatoServicio;

public class GetEmailContentResponse {
	
	private MetadatoServicio meta;
	private List<EmailContent> datos;
	
	public MetadatoServicio getMeta() {
		return meta;
	}
	public void setMeta(MetadatoServicio meta) {
		this.meta = meta;
	}
	public List<EmailContent> getDatos() {
		return datos;
	}
	public void setDatos(List<EmailContent> datos) {
		this.datos = datos;
	}
	
}
