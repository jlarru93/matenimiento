package pe.com.banbif.correo.eletronico.service.builder;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

import io.swagger.model.MetadatoServicio;

public class MetadatoServicioBuilderTest extends CommonsTest {

	
	@Test
	public void withoutIdTransactionTest() {
		MetadatoServicio meta = MetadatoServicioBuilder.getInstace().buildMeta(getHeaders());
		
		assertTrue(meta.getIdTransaccion() != null);
		assertTrue(meta.getTotalRegistros() == null);
		
	}
	
	@Test
	public void withIdTransactionTest() {
		Map<String, String> headers = getHeaders();
		headers.put("idtransaccion", "1234a");
		MetadatoServicio meta = MetadatoServicioBuilder.getInstace().buildMeta(headers,1);
		
		assertTrue("1234a".equalsIgnoreCase(meta.getIdTransaccion()));
		assertTrue(meta.getTotalRegistros() == 1);
		
	}
	
	
}
