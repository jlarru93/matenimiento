package pe.com.banbif.correo.eletronico.service.builder;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pe.com.banbif.correo.eletronico.service.data.entity.PutEmailTagResponse;

public class PutEmailTagResponseBuilderTest extends CommonsTest{
	
	@Test
	public void aTest() {
		PutEmailTagResponse response = PutEmailTagResponseBuilder.getInstace().build(getHeaders(), getEmailTag());
		assertTrue(response.getDatos() != null);
		assertTrue(response.getMeta() != null);
	}

}
