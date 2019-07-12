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
import pe.com.banbif.correo.eletronico.service.business.EmailTagService;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailTag;
import pe.com.banbif.correo.eletronico.service.data.entity.GetEmailTagResponse;
import pe.com.banbif.correo.eletronico.service.data.entity.PostEmailTagResponse;
import pe.com.banbif.correo.eletronico.service.data.entity.PutEmailTagResponse;
import pe.com.banbif.correo.eletronico.service.data.repository.EmailTagRepository;
import pe.com.banbif.correo.eletronico.service.exception.AlreadyExistsException;
import pe.com.banbif.correo.eletronico.service.exception.NotFoundException;

public class EmailTagServiceTest extends CommonsTest {
	
	private EmailTagService emailTagService;
	
	@Mock
	private EmailTagRepository emailTagRepository;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		emailTagService = new EmailTagService(emailTagRepository);
	}

	
	@Test(expected = AlreadyExistsException.class )
	public void saveFailTest() {
		EmailTag emailTag = getEmailTag();
		emailTag.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		emailTag.setId("saved");
		
		EmailTag ec = getEmailTag();
		ec.setId("ac");
		ec.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		
		when(emailTagRepository.findByTiposCorreosAndTagCorreoClave(any(), any())).thenReturn(Optional.of(ec));	
		
		emailTagService.save(ec);
		
	}
	
	@Test
	public void saveCanonicoTest() {
		EmailTag emailTag = getEmailTag();
		emailTag.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		emailTag.setId("saved");
		
		when(emailTagRepository.findByTiposCorreos(any())).thenReturn(Optional.empty());	
		when(emailTagRepository.save(any())).thenReturn(emailTag);		
		PostEmailTagResponse save = emailTagService.save(getHeaders(), emailTag);
		
		
		assertTrue(save.getMeta().getIdTransaccion() != null);
		assertTrue(save.getDatos() != null);
		
	}
	
	@Test
	public void putSucessCanonicoTest() {
		EmailTag emailTag = getEmailTag();
		emailTag.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		emailTag.setId("saved");
		
		when(emailTagRepository.findByTiposCorreos(any())).thenReturn(Optional.empty());	
		when(emailTagRepository.save(any())).thenReturn(emailTag);		
		when(emailTagRepository.findById(anyString())).thenReturn(Optional.of(emailTag));		
		
		PutEmailTagResponse save = emailTagService.update(getHeaders(), emailTag);
		
		
		assertTrue(save.getMeta().getIdTransaccion() != null);
		assertTrue(save.getDatos() != null);
		assertTrue("saved".equalsIgnoreCase(save.getDatos().getId()));
		
	}
	
	@Test(expected = AlreadyExistsException.class)
	public void putFailCanonicoTest() {
		EmailTag emailTag = getEmailTag();
		emailTag.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		emailTag.setId("saved");
		
		EmailTag e = getEmailTag();
		e.setId("fail");
		
		
		when(emailTagRepository.findByTiposCorreos(any())).thenReturn(Optional.empty());	
		when(emailTagRepository.findById(anyString())).thenReturn(Optional.of(emailTag));		
		when(emailTagRepository.findByTiposCorreosAndTagCorreoClave(any(), any())).thenReturn(Optional.of(e));		
		
		emailTagService.update(getHeaders(), emailTag);
		
		fail("fail");
		
	}
	
	@Test
	public void findByIdSucessTest() {
		EmailTag emailTag = getEmailTag();
		emailTag.setId("saved");
		
		when(emailTagRepository.findById(anyString())).thenReturn(Optional.of(emailTag));
		
		GetEmailTagResponse findById = emailTagService.findById(getHeaders(), "saved");
		
		assertTrue("saved".equalsIgnoreCase(findById.getDatos().iterator().next().getId()));
	}
	
	@Test(expected = NotFoundException.class)
	public void findByIdFailTest() {
		EmailTag emailTag = getEmailTag();
		emailTag.setId("saved");
		
		when(emailTagRepository.findById(anyString())).thenReturn(Optional.empty());
		
		emailTagService.findById(getHeaders(), "saved");
		
		fail("fail");
	}
	
	@Test
	public void deleteSucessTest() {
		EmailTag emailTag = getEmailTag();
		emailTag.setId("saved");
		when(emailTagRepository.findById(anyString())).thenReturn(Optional.of(emailTag));
		
		RespuestaServicio delete = emailTagService.delete(getHeaders(), "saved");
		
		assertTrue(delete.getMeta().getIdTransaccion() != null);
	}
	
	@Test(expected = NotFoundException.class)
	public void deleteFailTest() {
		EmailTag emailTag = getEmailTag();
		emailTag.setId("saved");
		when(emailTagRepository.findById(anyString())).thenReturn(Optional.empty());
		
		emailTagService.delete(getHeaders(), "saved");
		fail("fail");
	}
	
	@Test
	public void findByTiposCorreosSucessTest() {
		EmailTag emailTag = getEmailTag();
		emailTag.setId("saved");
		
		when(emailTagRepository.findByTiposCorreos(any())).thenReturn(Optional.of(Arrays.asList(emailTag)));
		GetEmailTagResponse response = emailTagService.findByTiposCorreos(getHeaders(), TiposCorreos.CONTROL_LOGIN_NOTIFICACION_IP_MALICIOSO_Y_MAS_DE_UN_CANAL);
	
		assertTrue(response.getMeta().getIdTransaccion() != null);
	}
	
	@Test
	public void listSucessTest() {
		
		when(emailTagRepository.findAll()).thenReturn(Arrays.asList(getEmailTag(), getEmailTag()));
		GetEmailTagResponse response = emailTagService.list(getHeaders());
		
		assertTrue(response.getDatos().size() == 2);
	}
	
}
