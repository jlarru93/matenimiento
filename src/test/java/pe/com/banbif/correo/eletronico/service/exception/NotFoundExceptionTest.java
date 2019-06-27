package pe.com.banbif.correo.eletronico.service.exception;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NotFoundExceptionTest {
	@Test
	public void sucessTest() {
		try {
			throw new NotFoundException();
		} catch (Exception e) {
			assertTrue("Object Not Found".equalsIgnoreCase(e.getMessage()));
		}
	}
}
