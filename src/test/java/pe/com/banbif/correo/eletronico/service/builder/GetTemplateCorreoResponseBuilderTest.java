package pe.com.banbif.correo.eletronico.service.builder;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

import io.swagger.model.GetTemplateCorreoResponse;
import io.swagger.model.TemplateCorreo;

public class GetTemplateCorreoResponseBuilderTest extends CommonsTest{

	@Test
	public void sucessTest() {
		Map<String, String> headers = getHeaders();
		TemplateCorreo TemplateCorreo= getTemplateCorreo();
		GetTemplateCorreoResponse response = GetTemplateCorreoResponseBuilder.getInstace().build(headers, TemplateCorreo);
		
		assertTrue(response.getMeta().getIdTransaccion() != null);
	}
	
	@Test
	public void sucess2Test() {
		Map<String, String> headers = getHeaders();
		TemplateCorreo e1 = getTemplateCorreo();
		GetTemplateCorreoResponse response = GetTemplateCorreoResponseBuilder.getInstace().build(headers, e1);
		
		assertTrue(response != null);
	}


}
