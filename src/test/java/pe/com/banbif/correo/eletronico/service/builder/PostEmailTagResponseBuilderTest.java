package pe.com.banbif.correo.eletronico.service.builder;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pe.com.banbif.correo.eletronico.service.data.entity.PostEmailTagResponse;

public class PostEmailTagResponseBuilderTest extends CommonsTest{
	
	@Test
	public void aTest() {
		PostEmailTagResponse response = PostEmailTagResponseBuilder.getInstace().build(getHeaders(), getEmailTag());
		assertTrue(response.getDatos() != null);
		assertTrue(response.getMeta() != null);	
	}

}
