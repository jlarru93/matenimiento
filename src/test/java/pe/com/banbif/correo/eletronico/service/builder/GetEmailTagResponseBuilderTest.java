package pe.com.banbif.correo.eletronico.service.builder;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Map;

import org.junit.Test;

import pe.com.banbif.correo.eletronico.service.data.entity.EmailTag;
import pe.com.banbif.correo.eletronico.service.data.entity.GetEmailTagResponse;

public class GetEmailTagResponseBuilderTest  extends CommonsTest{

	@Test
	public void sucessTest() {
		Map<String, String> headers = getHeaders();
		EmailTag emailTag= getEmailTag();
		GetEmailTagResponse response = GetEmailTagResponseBuilder.getInstace().build(headers, emailTag);
		
		assertTrue(response.getDatos().size() == 1);
		assertTrue(response.getMeta().getIdTransaccion() != null);
		assertTrue(response.getMeta().getTotalRegistros() == 1);
	}
	
	@Test
	public void sucess2Test() {
		Map<String, String> headers = getHeaders();
		EmailTag e1 = getEmailTag();
		EmailTag e2 = getEmailTag();
		GetEmailTagResponse response = GetEmailTagResponseBuilder.getInstace().build(headers, Arrays.asList(e1,e2));
		
		assertTrue(response.getDatos().size() == 2);
		assertTrue(response.getMeta().getIdTransaccion() != null);
		assertTrue(response.getMeta().getTotalRegistros() == 2);
	}

	
}
