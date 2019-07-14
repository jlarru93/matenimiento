package pe.com.banbif.correo.eletronico.service.busines;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import io.swagger.model.Correo;
import io.swagger.model.TagCorreo;
import io.swagger.model.TemplateCorreo;
import io.swagger.model.TiposCorreos;
import io.swagger.model.ValorTag;
import pe.com.banbif.correo.eletronico.service.business.TemplateCorreoService;
import pe.com.banbif.correo.eletronico.service.business.TemplateService;

public class TemplateServiceTest {
	
	private TemplateService templateService;
	@Mock
	private TemplateCorreoService TemplateCorreoService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		templateService = new TemplateService(TemplateCorreoService);
	}
	
	@Test
	public void getContentSucessTest() {
		when(TemplateCorreoService.findByUniqueKey(eq(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO),any())).thenReturn(getTemplateCorreo());		
		
		Correo email = new Correo();
		TemplateCorreo templateCorreo = new TemplateCorreo();
		templateCorreo.setTipoCorreo(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		email.setTemplateCorreo(templateCorreo);
		email.addValoresTagsItem(buildValortagItem());
		String content = templateService.getContent(email, templateCorreo);
		
		assertTrue("template: valido ".equals(content));
	}

	private ValorTag buildValortagItem() {
		ValorTag v = new ValorTag();
		TagCorreo tag = new TagCorreo();
		tag.setClave("teste");
		v.setTag(tag);
		v.setValor("valido");
		return v;
	}

	private Optional<TemplateCorreo> getTemplateCorreo() {
		TemplateCorreo e = new TemplateCorreo();
		e.setContenido("template: ${teste} ");
		e.setTipoCorreo(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		return Optional.of(e);
	}
	

}
