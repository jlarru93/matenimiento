package pe.com.banbif.correo.eletronico.service.builder;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.swagger.model.PutTemplateCorreoResponse;

public class PutTemplateCorreoResponseBuilderTest extends CommonsTest{
	
	@Test
	public void aTest() {
		PutTemplateCorreoResponse response = PutTemplateCorreoResponseBuilder.getInstace().build(getHeaders(), getTemplateCorreo());
		assertTrue(response.getDatos() != null);
		assertTrue(response.getMeta() != null);
	}

}
