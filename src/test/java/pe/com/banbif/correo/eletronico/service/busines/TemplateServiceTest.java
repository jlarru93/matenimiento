package pe.com.banbif.correo.eletronico.service.busines;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
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
import pe.com.banbif.correo.eletronico.service.business.EmailContentService;
import pe.com.banbif.correo.eletronico.service.business.TemplateService;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailContent;

public class TemplateServiceTest {
	
	private TemplateService templateService;
	@Mock
	private EmailContentService emailContentService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		templateService = new TemplateService(emailContentService);
	}
	
	@Test
	public void getContentSucessTest() {
		when(emailContentService.findByUniqueKey(any())).thenReturn(getContent());		
		
		Correo email = new Correo();
		TemplateCorreo templateCorreo = new TemplateCorreo();
		templateCorreo.setTipoCorreo(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		email.setTemplateCorreo(templateCorreo);
		email.addValoresTagsItem(buildValortagItem());
		String content = templateService.getContent(email);
		
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

	private Optional<EmailContent> getContent() {
		EmailContent e = new EmailContent();
		e.setContent("template: ${teste} ");
		e.setTiposCorreos(TiposCorreos.AHORRO_PROGRAMADO_AHORRO_PROGRAMADO);
		return Optional.of(e);
	}
	

}
