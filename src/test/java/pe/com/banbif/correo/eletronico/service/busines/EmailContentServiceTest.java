package pe.com.banbif.correo.eletronico.service.busines;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.builder.CommonsTest;
import pe.com.banbif.correo.eletronico.service.business.EmailContentService;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailContent;
import pe.com.banbif.correo.eletronico.service.data.entity.PostEmailContentResponse;
import pe.com.banbif.correo.eletronico.service.data.repository.EmailContentRepository;
import pe.com.banbif.correo.eletronico.service.exception.AlreadyExistsException;

public class EmailContentServiceTest extends CommonsTest{
	
	private EmailContentService emailContentService;
	
	@Mock
	private EmailContentRepository emailContentRepository;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		emailContentService = new EmailContentService(emailContentRepository);
	}

	@Test
	public void saveSucessTest() {
		EmailContent emailContent = getEmailContent();
		emailContent.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		emailContent.setId("saved");
		
		EmailContent ec = getEmailContent();
		ec.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		
		when(emailContentRepository.findByTiposCorreos(any())).thenReturn(Optional.empty());		
		when(emailContentService.save(ec)).thenReturn(emailContent);		
		
		EmailContent save = emailContentService.save(ec);
		
		assertTrue("saved".equalsIgnoreCase(save.getId()));
	}
	
	@Test(expected = AlreadyExistsException.class )
	public void saveFailTest() {
		EmailContent emailContent = getEmailContent();
		emailContent.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		emailContent.setId("saved");
		
		EmailContent ec = getEmailContent();
		ec.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		
		when(emailContentRepository.findByTiposCorreos(any())).thenReturn(Optional.of(ec));		
		when(emailContentService.save(ec)).thenReturn(emailContent);		
		
		emailContentService.save(ec);
		
	}
	
	@Test
	public void saveCanonicoTest() {
		PostEmailContentResponse save = emailContentService.save(getHeaders(), getEmailContent());
		assertTrue(save.getMeta().getIdTransaccion() != null);
	}
	
	
}
