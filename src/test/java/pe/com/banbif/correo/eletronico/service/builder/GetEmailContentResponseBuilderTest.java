package pe.com.banbif.correo.eletronico.service.builder;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Map;

import org.junit.Test;

import pe.com.banbif.correo.eletronico.service.data.entity.EmailContent;
import pe.com.banbif.correo.eletronico.service.data.entity.GetEmailContentResponse;

public class GetEmailContentResponseBuilderTest extends CommonsTest{

	@Test
	public void sucessTest() {
		Map<String, String> headers = getHeaders();
		EmailContent emailContent= getEmailContent();
		GetEmailContentResponse response = GetEmailContentResponseBuilder.getInstace().build(headers, emailContent);
		
		assertTrue(response.getDatos().size() == 1);
		assertTrue(response.getMeta().getIdTransaccion() != null);
		assertTrue(response.getMeta().getTotalRegistros() == 1);
	}
	
	@Test
	public void sucess2Test() {
		Map<String, String> headers = getHeaders();
		EmailContent e1 = getEmailContent();
		EmailContent e2 = getEmailContent();
		GetEmailContentResponse response = GetEmailContentResponseBuilder.getInstace().build(headers, Arrays.asList(e1,e2));
		
		assertTrue(response.getDatos().size() == 2);
		assertTrue(response.getMeta().getIdTransaccion() != null);
		assertTrue(response.getMeta().getTotalRegistros() == 2);
	}


}
