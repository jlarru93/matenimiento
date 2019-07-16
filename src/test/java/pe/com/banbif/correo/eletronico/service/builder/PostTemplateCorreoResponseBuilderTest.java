package pe.com.banbif.correo.eletronico.service.builder;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.swagger.model.PostTemplateCorreoResponse;

public class PostTemplateCorreoResponseBuilderTest extends CommonsTest{
	
	@Test
	public void aTest() {
		PostTemplateCorreoResponse response = PostTemplateCorreoResponseBuilder.getInstace().build(getHeaders(), getTemplateCorreo());
		assertTrue(response.getDatos() != null);
		assertTrue(response.getMeta() != null);
	}

}
