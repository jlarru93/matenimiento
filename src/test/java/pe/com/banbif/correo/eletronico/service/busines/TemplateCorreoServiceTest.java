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

import io.swagger.model.GetTemplateCorreoResponse;
import io.swagger.model.GetTemplatesCorreosResponse;
import io.swagger.model.PostTemplateCorreoResponse;
import io.swagger.model.PutTemplateCorreoResponse;
import io.swagger.model.RespuestaServicio;
import io.swagger.model.TemplateCorreo;
import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.builder.CommonsTest;
import pe.com.banbif.correo.eletronico.service.business.TemplateCorreoService;
import pe.com.banbif.correo.eletronico.service.data.repository.TemplateCorreoRepository;
import pe.com.banbif.correo.eletronico.service.exception.AlreadyExistsException;
import pe.com.banbif.correo.eletronico.service.exception.NotFoundException;

public class TemplateCorreoServiceTest extends CommonsTest{
	
	private TemplateCorreoService templateCorreoService;
	
	@Mock
	private TemplateCorreoRepository templateCorreoRepository;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		templateCorreoService = new TemplateCorreoService(templateCorreoRepository);
	}

	@Test
	public void saveSucessTest() {
		TemplateCorreo templateCorreo = getTemplateCorreo();
		templateCorreo.setTipoCorreo(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		templateCorreo.setId("saved");
		
		TemplateCorreo ec = getTemplateCorreo();
		ec.setTipoCorreo(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		
		when(templateCorreoRepository.findByTipoCorreoAndCanal(any(), any())).thenReturn(Optional.empty());		
		when(templateCorreoService.save(ec)).thenReturn(templateCorreo);		
		
		TemplateCorreo save = templateCorreoService.save(ec);
		
		assertTrue("saved".equalsIgnoreCase(save.getId()));
	}
	
	@Test(expected = AlreadyExistsException.class )
	public void saveFailTest() {
		TemplateCorreo TemplateCorreo = getTemplateCorreo();
		TemplateCorreo.setTipoCorreo(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		TemplateCorreo.setId("saved");
		
		TemplateCorreo ec = getTemplateCorreo();
		ec.setTipoCorreo(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		
		when(templateCorreoRepository.findByTipoCorreoAndCanal(any(), any())).thenReturn(Optional.of(ec));		
		when(templateCorreoService.save(ec)).thenReturn(TemplateCorreo);		
		
		templateCorreoService.save(ec);
		
	}
	
	@Test
	public void saveCanonicoTest() {
		TemplateCorreo TemplateCorreo = getTemplateCorreo();
		TemplateCorreo.setTipoCorreo(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		TemplateCorreo.setId("saved");
		
		when(templateCorreoRepository.findByTipoCorreoAndCanal(any(), any())).thenReturn(Optional.empty());	
		when(templateCorreoRepository.save(any())).thenReturn(TemplateCorreo);		
		
		PostTemplateCorreoResponse save = templateCorreoService.save(getHeaders(), TemplateCorreo);
		
		
		assertTrue(save.getMeta().getIdTransaccion() != null);
		assertTrue(save.getDatos() != null);
		
	}
	
	@Test
	public void putSucessCanonicoTest() {
		TemplateCorreo TemplateCorreo = getTemplateCorreo();
		TemplateCorreo.setTipoCorreo(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		TemplateCorreo.setId("saved");
		
		when(templateCorreoRepository.findByTipoCorreoAndCanal(any(), any())).thenReturn(Optional.empty());	
		when(templateCorreoRepository.save(any())).thenReturn(TemplateCorreo);		
		when(templateCorreoRepository.findById(anyString())).thenReturn(Optional.of(TemplateCorreo));		
		
		PutTemplateCorreoResponse save = templateCorreoService.update(getHeaders(), TemplateCorreo);
		
		
		assertTrue(save.getMeta().getIdTransaccion() != null);
		assertTrue(save.getDatos() != null);
		assertTrue("saved".equalsIgnoreCase(save.getDatos().getId()));
		
	}
	
	@Test(expected = AlreadyExistsException.class)
	public void putFailCanonicoTest() {
		TemplateCorreo TemplateCorreo = getTemplateCorreo();
		TemplateCorreo.setTipoCorreo(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		TemplateCorreo.setId("saved");
		
		TemplateCorreo e = getTemplateCorreo();
		e.setId("fail");
		
		
		when(templateCorreoRepository.findByTipoCorreoAndCanal(any(), any())).thenReturn(Optional.of(e));	
		when(templateCorreoRepository.findById(anyString())).thenReturn(Optional.of(TemplateCorreo));		
		
		templateCorreoService.update(getHeaders(), TemplateCorreo);
		
		fail("fail");
		
	}
	
	@Test
	public void findByIdSucessTest() {
		TemplateCorreo TemplateCorreo = getTemplateCorreo();
		TemplateCorreo.setId("saved");
		
		when(templateCorreoRepository.findById(anyString())).thenReturn(Optional.of(TemplateCorreo));
		
		GetTemplateCorreoResponse findById = templateCorreoService.findById(getHeaders(), "saved");
		
		assertTrue("saved".equalsIgnoreCase(findById.getDatos().getId()));
	}
	
	@Test(expected = NotFoundException.class)
	public void findByIdFailTest() {
		TemplateCorreo TemplateCorreo = getTemplateCorreo();
		TemplateCorreo.setId("saved");
		
		when(templateCorreoRepository.findById(anyString())).thenReturn(Optional.empty());
		
		templateCorreoService.findById(getHeaders(), "saved");
		
		fail("fail");
	}
	
	@Test
	public void deleteSucessTest() {
		TemplateCorreo TemplateCorreo = getTemplateCorreo();
		TemplateCorreo.setId("saved");
		when(templateCorreoRepository.findById(anyString())).thenReturn(Optional.of(TemplateCorreo));
		
		RespuestaServicio delete = templateCorreoService.delete(getHeaders(), "saved");
		
		assertTrue(delete.getMeta().getIdTransaccion() != null);
	}
	
	@Test(expected = NotFoundException.class)
	public void deleteFailTest() {
		TemplateCorreo TemplateCorreo = getTemplateCorreo();
		TemplateCorreo.setId("saved");
		when(templateCorreoRepository.findById(anyString())).thenReturn(Optional.empty());
		
		templateCorreoService.delete(getHeaders(), "saved");
		fail("fail");
	}
	
	@Test
	public void findByUniqueKeySucessTest() {
		TemplateCorreo TemplateCorreo = getTemplateCorreo();
		TemplateCorreo.setTipoCorreo(TiposCorreos.DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA);
		TemplateCorreo.setId("saved");
		when(templateCorreoRepository.findByTipoCorreoAndCanal(any(), any())).thenReturn(Optional.of(TemplateCorreo));
		
		GetTemplateCorreoResponse findByUniqueKey = templateCorreoService.findByUniqueKey(getHeaders(), TiposCorreos.DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA);
	
		TemplateCorreo e = findByUniqueKey.getDatos();
		
		assertTrue("saved".equalsIgnoreCase(e.getId()));
	}
	
	@Test(expected = NotFoundException.class)
	public void findByUniqueKeyTest() {
		TemplateCorreo TemplateCorreo = getTemplateCorreo();
		TemplateCorreo.setTipoCorreo(TiposCorreos.DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA);
		TemplateCorreo.setId("saved");
		when(templateCorreoRepository.findByTipoCorreoAndCanal(any(), any())).thenReturn(Optional.empty());
		
		templateCorreoService.findByUniqueKey(getHeaders(), TiposCorreos.DISPOSICION_EFECTIVO_OPERACION_NO_COMPLETADA);
		fail("fail");
		
	}
	
	@Test
	public void listSucessTest() {
		when(templateCorreoRepository.findAll()).thenReturn(Arrays.asList(getTemplateCorreo(), getTemplateCorreo()));
		GetTemplatesCorreosResponse response = templateCorreoService.list(getHeaders());
		
		assertTrue(response.getMeta().getTotalRegistros() == 2);
	}
	
	
}
