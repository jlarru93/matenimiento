package pe.com.banbif.correo.eletronico.service.data.entity;

import io.swagger.model.TiposCorreos;

public class EmailContent {

	private String id;
	private TiposCorreos tiposCorreos;
	private String content;

	public TiposCorreos getTiposCorreos() {
		return tiposCorreos;
	}

	public void setTiposCorreos(TiposCorreos tiposCorreos) {
		this.tiposCorreos = tiposCorreos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
