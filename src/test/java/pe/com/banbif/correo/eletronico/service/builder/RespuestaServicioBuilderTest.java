package pe.com.banbif.correo.eletronico.service.builder;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.swagger.model.RespuestaServicio;

public class RespuestaServicioBuilderTest  extends CommonsTest {

	@Test
	public void sucessTest() {
		RespuestaServicio build = RespuestaServicioBuilder.getInstace().build(getHeaders());
		
		assertTrue(build.getMeta().getIdTransaccion() != null);
	}
}
