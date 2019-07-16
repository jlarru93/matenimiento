package pe.com.banbif.correo.eletronico.service.exception;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AlreadyExistsExceptionTest {
	
	@Test
	public void sucessTest() {
		try {
			throw new AlreadyExistsException();
		} catch (Exception e) {
			assertTrue("¡TemplateCorreo ya existe!".equalsIgnoreCase(e.getMessage()));
		}
	}
	
	@Test
	public void sucess2Test() {
		try {
			throw new AlreadyExistsException("abc teste");
		} catch (Exception e) {
			assertTrue("abc teste".equalsIgnoreCase(e.getMessage()));
		}
	}

}
