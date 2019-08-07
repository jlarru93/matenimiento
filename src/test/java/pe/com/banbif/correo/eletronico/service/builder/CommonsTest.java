package pe.com.banbif.correo.eletronico.service.builder;

import java.util.HashMap;
import java.util.Map;

import io.swagger.model.CodigosCanales;
import io.swagger.model.TagCorreo;
import io.swagger.model.TemplateCorreo;

public class CommonsTest {

	protected TemplateCorreo getTemplateCorreo() {
		TemplateCorreo e = new TemplateCorreo();
		return e;
	}
	
	protected Map<String, String> getHeaders() {
		 Map<String, String> map = new HashMap<String, String>();
		 map.put("codigoCanal", CodigosCanales.BACKOFFICE.getValue());
		return map;
	}
	
	protected Map<String, String> getHeadersList() {
		 Map<String, String> map = new HashMap<String, String>();
		 map.put("codigoCanal", CodigosCanales.BACKOFFICE.getValue());
		 map.put("cantidadregistros", "2");
		 map.put("numeropagina", "0");
		 
		return map;
	}
	

	protected TagCorreo getEmailTag() {
		TagCorreo tag = new TagCorreo();
		tag.setClave("ab");
		tag.setDescripicion("ab");
		return tag;
	}
	
	

}
