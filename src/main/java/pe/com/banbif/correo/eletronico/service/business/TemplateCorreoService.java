package pe.com.banbif.correo.eletronico.service.business;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.swagger.model.CodigosCanales;
import io.swagger.model.GetTemplateCorreoResponse;
import io.swagger.model.GetTemplatesCorreosResponse;
import io.swagger.model.PostTemplateCorreoResponse;
import io.swagger.model.PutTemplateCorreoResponse;
import io.swagger.model.RespuestaServicio;
import io.swagger.model.TemplateCorreo;
import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.builder.GetTemplateCorreoResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.GetTemplatesCorreosResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.PostTemplateCorreoResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.PutTemplateCorreoResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.RespuestaServicioBuilder;
import pe.com.banbif.correo.eletronico.service.data.repository.TemplateCorreoRepository;
import pe.com.banbif.correo.eletronico.service.exception.AlreadyExistsException;
import pe.com.banbif.correo.eletronico.service.exception.NotFoundException;

@Service
public class TemplateCorreoService {

	private TemplateCorreoRepository templateCorreoRepository;

	public TemplateCorreoService(TemplateCorreoRepository templateCorreoRepository) {
		this.templateCorreoRepository = templateCorreoRepository;
	}

	public TemplateCorreo save(TemplateCorreo templateCorreo) {
		Optional<TemplateCorreo> findByTiposCorreos = findByUniqueKey(templateCorreo.getTipoCorreo(), templateCorreo.getCanal());
		if (findByTiposCorreos.isPresent()) {
			throw new AlreadyExistsException();
		}
		templateCorreo.setId(null);

		return templateCorreoRepository.save(templateCorreo);
	}
	
	public PostTemplateCorreoResponse save(Map<String, String> headers, TemplateCorreo TemplateCorreo) {
		TemplateCorreo save = save(TemplateCorreo);
		return PostTemplateCorreoResponseBuilder.getInstace().build(headers, save);
	}


	public Optional<TemplateCorreo> findByUniqueKey(TiposCorreos tiposCorreos, CodigosCanales codigosCanales) {
		return templateCorreoRepository.findByTipoCorreoAndCanal(tiposCorreos, codigosCanales);
	}

	public TemplateCorreo update(TemplateCorreo templateCorreo) {
		TemplateCorreo findById = findById(templateCorreo.getId());

		Optional<TemplateCorreo> findByUniqueKey = findByUniqueKey(templateCorreo.getTipoCorreo(), templateCorreo.getCanal());

		if (findByUniqueKey.isPresent()) {
			TemplateCorreo email = findByUniqueKey.get();

			if (!email.getId().equalsIgnoreCase(findById.getId())) {
				throw new AlreadyExistsException();
			}
		}

		return templateCorreoRepository.save(templateCorreo);
	}

	public PutTemplateCorreoResponse update(Map<String, String> headers, TemplateCorreo TemplateCorreo) {
		TemplateCorreo update = update(TemplateCorreo);
		return PutTemplateCorreoResponseBuilder.getInstace().build(headers, update);
	}
	
	public TemplateCorreo findById(String id) {
		Optional<TemplateCorreo> findById = templateCorreoRepository.findById(id);
		
		return findById.orElseThrow(() -> new NotFoundException());
	}
	
	public GetTemplateCorreoResponse findById(Map<String, String> headers, String id) {
		TemplateCorreo findById = findById(id);
		
		return GetTemplateCorreoResponseBuilder.getInstace().build(headers, findById);
	}
	
	public GetTemplateCorreoResponse findByUniqueKey(Map<String, String> headers, TiposCorreos tiposCorreos) {
		 String codigoCanal = headers.get("codigoCanal");
		 CodigosCanales canales = CodigosCanales.valueOf(codigoCanal);
		 Optional<TemplateCorreo> findByUniqueKey = findByUniqueKey(tiposCorreos, canales);
		
		return GetTemplateCorreoResponseBuilder.getInstace().build(headers, findByUniqueKey.orElseThrow(() -> new NotFoundException()));
	}
	
	
	public GetTemplatesCorreosResponse list(Map<String, String> headers) {
		List<TemplateCorreo> list = list();
		return GetTemplatesCorreosResponseBuilder.getInstace().build(headers, list);
	}
	
	public List<TemplateCorreo> list(){
		return templateCorreoRepository.findAll();
	}

	public TemplateCorreo delete(String id) {
		TemplateCorreo findById = findById(id);
		templateCorreoRepository.delete(findById);
		
		return findById;
	}
	
	public RespuestaServicio delete(Map<String, String> headers, String id) {
		delete(id);
		return RespuestaServicioBuilder.getInstace().build(headers);
	}
	


}
