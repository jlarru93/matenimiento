package pe.com.banbif.correo.eletronico.service.data.entity;

import io.swagger.model.TiposCorreos;
import io.swagger.model.ValorTag;

public class EmailTag {

	private String id;
	private TiposCorreos tiposCorreos;
	private ValorTag valorTag;

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

	public ValorTag getValorTag() {
		return valorTag;
	}

	public void setValorTag(ValorTag valorTag) {
		this.valorTag = valorTag;
	}


}
