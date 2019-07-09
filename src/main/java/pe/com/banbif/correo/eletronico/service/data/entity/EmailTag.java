package pe.com.banbif.correo.eletronico.service.data.entity;

import io.swagger.model.TagCorreo;
import io.swagger.model.TiposCorreos;

public class EmailTag {

	private String id;
	private TiposCorreos tiposCorreos;
	private TagCorreo tagCorreo;

	public TiposCorreos getTiposCorreos() {
//		TiposCorreos.AHORRO_VUELTO_EDICION_DE_AHORRO
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

	public TagCorreo getTagCorreo() {
		return tagCorreo;
	}

	public void setTagCorreo(TagCorreo tagCorreo) {
		this.tagCorreo = tagCorreo;
	}

}
