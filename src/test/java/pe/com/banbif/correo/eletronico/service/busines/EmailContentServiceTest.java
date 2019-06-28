package pe.com.banbif.correo.eletronico.service.busines;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import io.swagger.model.RespuestaServicio;
import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.builder.CommonsTest;
import pe.com.banbif.correo.eletronico.service.business.EmailContentService;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailContent;
import pe.com.banbif.correo.eletronico.service.data.entity.GetEmailContentResponse;
import pe.com.banbif.correo.eletronico.service.data.entity.PostEmailContentResponse;
import pe.com.banbif.correo.eletronico.service.data.entity.PutEmailContentResponse;
import pe.com.banbif.correo.eletronico.service.data.repository.EmailContentRepository;
import pe.com.banbif.correo.eletronico.service.exception.AlreadyExistsException;
import pe.com.banbif.correo.eletronico.service.exception.NotFoundException;

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
		EmailContent emailContent = getEmailContent();
		emailContent.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		emailContent.setId("saved");
		
		when(emailContentRepository.findByTiposCorreos(any())).thenReturn(Optional.empty());	
		when(emailContentRepository.save(any())).thenReturn(emailContent);		
		
		PostEmailContentResponse save = emailContentService.save(getHeaders(), emailContent);
		
		
		assertTrue(save.getMeta().getIdTransaccion() != null);
		assertTrue(save.getDatos() != null);
		
	}
	
	@Test
	public void putSucessCanonicoTest() {
		EmailContent emailContent = getEmailContent();
		emailContent.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		emailContent.setId("saved");
		
		when(emailContentRepository.findByTiposCorreos(any())).thenReturn(Optional.empty());	
		when(emailContentRepository.save(any())).thenReturn(emailContent);		
		when(emailContentRepository.findById(anyString())).thenReturn(Optional.of(emailContent));		
		
		PutEmailContentResponse save = emailContentService.update(getHeaders(), emailContent);
		
		
		assertTrue(save.getMeta().getIdTransaccion() != null);
		assertTrue(save.getDatos() != null);
		assertTrue("saved".equalsIgnoreCase(save.getDatos().getId()));
		
	}
	
	@Test(expected = AlreadyExistsException.class)
	public void putFailCanonicoTest() {
		EmailContent emailContent = getEmailContent();
		emailContent.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		emailContent.setId("saved");
		
		EmailContent e = getEmailContent();
		e.setId("fail");
		
		
		when(emailContentRepository.findByTiposCorreos(any())).thenReturn(Optional.of(e));	
		when(emailContentRepository.findById(anyString())).thenReturn(Optional.of(emailContent));		
		
		emailContentService.update(getHeaders(), emailContent);
		
		fail("fail");
		
	}
	
	@Test
	public void findByIdSucessTest() {
		EmailContent emailContent = getEmailContent();
		emailContent.setId("saved");
		
		when(emailContentRepository.findById(anyString())).thenReturn(Optional.of(emailContent));
		
		GetEmailContentResponse findById = emailContentService.findById(getHeaders(), "saved");
		
		assertTrue("saved".equalsIgnoreCase(findById.getDatos().iterator().next().getId()));
	}
	
	@Test(expected = NotFoundException.class)
	public void findByIdFailTest() {
		EmailContent emailContent = getEmailContent();
		emailContent.setId("saved");
		
		when(emailContentRepository.findById(anyString())).thenReturn(Optional.empty());
		
		emailContentService.findById(getHeaders(), "saved");
		
		fail("fail");
	}
	
	@Test
	public void deleteSucessTest() {
		EmailContent emailContent = getEmailContent();
		emailContent.setId("saved");
		when(emailContentRepository.findById(anyString())).thenReturn(Optional.of(emailContent));
		
		RespuestaServicio delete = emailContentService.delete(getHeaders(), "saved");
		
		assertTrue(delete.getMeta().getIdTransaccion() != null);
	}
	
	@Test(expected = NotFoundException.class)
	public void deleteFailTest() {
		EmailContent emailContent = getEmailContent();
		emailContent.setId("saved");
		when(emailContentRepository.findById(anyString())).thenReturn(Optional.empty());
		
		emailContentService.delete(getHeaders(), "saved");
		fail("fail");
	}
	
	@Test
	public void findByUniqueKeySucessTest() {
		EmailContent emailContent = getEmailContent();
		emailContent.setTiposCorreos(TiposCorreos.DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA);
		emailContent.setId("saved");
		when(emailContentRepository.findByTiposCorreos(any())).thenReturn(Optional.of(emailContent));
		
		GetEmailContentResponse findByUniqueKey = emailContentService.findByUniqueKey(getHeaders(), TiposCorreos.DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA);
	
		EmailContent e = findByUniqueKey.getDatos().iterator().next();
		
		assertTrue("saved".equalsIgnoreCase(e.getId()));
	}
	
	@Test(expected = NotFoundException.class)
	public void findByUniqueKeyTest() {
		EmailContent emailContent = getEmailContent();
		emailContent.setTiposCorreos(TiposCorreos.DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA);
		emailContent.setId("saved");
		when(emailContentRepository.findByTiposCorreos(any())).thenReturn(Optional.empty());
		
		emailContentService.findByUniqueKey(getHeaders(), TiposCorreos.DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA);
		fail("fail");
		
	}
	
	@Test
	public void listSucessTest() {
		when(emailContentRepository.findAll()).thenReturn(Arrays.asList(getEmailContent(), getEmailContent()));
		GetEmailContentResponse response = emailContentService.list(getHeaders());
		
		assertTrue(response.getMeta().getTotalRegistros() == 2);
	}
	
	
}
