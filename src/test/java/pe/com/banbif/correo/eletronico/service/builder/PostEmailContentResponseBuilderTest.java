package pe.com.banbif.correo.eletronico.service.builder;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.swagger.model.PostEmailContentResponse;

public class PostEmailContentResponseBuilderTest extends CommonsTest{
	
	@Test
	public void aTest() {
		PostEmailContentResponse response = PostEmailContentResponseBuilder.getInstace().build(getHeaders(), getEmailContent());
		assertTrue(response.getDatos() != null);
		assertTrue(response.getMeta() != null);
	}

}
