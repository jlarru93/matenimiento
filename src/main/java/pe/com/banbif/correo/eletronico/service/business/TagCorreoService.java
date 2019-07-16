package pe.com.banbif.correo.eletronico.service.business;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import io.swagger.model.GetTagsCorreosResponse;
import io.swagger.model.TagCorreo;
import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.builder.GetTagCorreoResponseBuilder;
import pe.com.banbif.correo.eletronico.service.data.repository.TagCorreoRepository;
import pe.com.banbif.correo.eletronico.service.exception.NotFoundException;

@Service
public class TagCorreoService {

	private TagCorreoRepository tagCorreoRepository;

	public TagCorreoService(TagCorreoRepository tagCorreoRepository) {
		this.tagCorreoRepository = tagCorreoRepository;
	}
	
	public List<TagCorreo> listByUniqueKey(TiposCorreos tiposCorreos) {
		return tagCorreoRepository.findByTipoCorreo(tiposCorreos).orElseThrow(() -> new NotFoundException());
	}

	public GetTagsCorreosResponse list(Map<String, String> headers, TiposCorreos tiposCorreos) {
		List<TagCorreo> tags = listByUniqueKey(tiposCorreos);
		return GetTagCorreoResponseBuilder.getInstace().build(headers, tags);
	}

}
