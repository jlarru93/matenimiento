package pe.com.banbif.correo.eletronico.service.builder;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pe.com.banbif.correo.eletronico.service.data.entity.PutEmailContentResponse;

public class PutEmailContentResponseBuilderTest extends CommonsTest{
	
	@Test
	public void aTest() {
		PutEmailContentResponse response = PutEmailContentResponseBuilder.getInstace().build(getHeaders(), getEmailContent());
		assertTrue(response.getDatos() != null);
		assertTrue(response.getMeta() != null);
	}

}
