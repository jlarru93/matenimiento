package pe.com.banbif.correo.eletronico.service.builder;

import java.util.HashMap;
import java.util.Map;

import io.swagger.model.TagCorreo;
import io.swagger.model.ValorTag;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailContent;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailTag;

public class CommonsTest {

	protected EmailContent getEmailContent() {
		EmailContent e = new EmailContent();
		return e;
	}
	
	protected Map<String, String> getHeaders() {
		 Map<String, String> map = new HashMap<String, String>();
		return map;
	}
	

	protected EmailTag getEmailTag() {
		EmailTag e = new EmailTag();
		ValorTag valorTag = new ValorTag();
		TagCorreo tag = new TagCorreo();
		tag.setClave("ab");
		tag.setDescripicion("ab");
		valorTag.setTag(tag );
		valorTag.setValor("ab");
		e.setValorTag(valorTag);
		return e;
	}
	
	

}
