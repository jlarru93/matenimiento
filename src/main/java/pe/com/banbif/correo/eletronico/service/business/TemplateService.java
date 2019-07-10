package pe.com.banbif.correo.eletronico.service.business;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.Version;
import io.swagger.model.Correo;
import io.swagger.model.TagCorreo;
import io.swagger.model.ValorTag;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailContent;

@Service
public class TemplateService {

	private static final String TEMPLATE_NOT_FOUND_ERROR_MESSAGE = null;
	private EmailContentService emailContentService;

	public TemplateService(EmailContentService emailContentService) {
		this.emailContentService = emailContentService;
	}

	public String getContent(Correo email) {
		try {
			Optional<EmailContent> emailContent = emailContentService
					.findByUniqueKey(email.getTemplateCorreo().getTipoCorreo());
			emailContent.orElseThrow(() -> new RuntimeException(TEMPLATE_NOT_FOUND_ERROR_MESSAGE));
			String template = emailContent.get().getContent();

			Map<String, Object> model = getModel(email);
			Version version = new Version("2.3.28");
			Configuration cfg = new Configuration(version);
			cfg.setObjectWrapper(new DefaultObjectWrapper(version));

			Template t = new Template("template", new StringReader(template), cfg);

			Writer out = new StringWriter();
			t.process(model, out);

			return out.toString();

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	private Map<String, Object> getModel(Correo email) {
		Map<String, Object> map = new HashMap<String, Object>();

		for (ValorTag tag : email.getValoresTags()) {
			map.put(tag.getTag().getClave(), tag.getValor());
		}

		return map;
	}

	public Map<String, Object> toMap(List<ValorTag> tags) {
		Map<String, Object> mappedValues = new LinkedHashMap<>();
		tags.forEach(tag -> {
			mappedValues.put(tag.getTag().getClave(), tag.getValor());
		});

		return mappedValues;
	}

	public List<ValorTag> fromMap(Map<String, Object> values) {
		List<ValorTag> tags = new ArrayList<>();
		values.forEach((key, value) -> {
			if (value != null) {
				ValorTag tag = new ValorTag();
				TagCorreo tagCorreo = new TagCorreo();
				tagCorreo.setClave(key);
				tag.setTag(tagCorreo);
				tag.setValor(value.toString());
				tags.add(tag);
			}
		});

		return tags;
	}

}
