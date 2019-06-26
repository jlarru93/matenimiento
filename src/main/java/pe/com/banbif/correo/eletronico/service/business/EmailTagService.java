package pe.com.banbif.correo.eletronico.service.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.swagger.model.RespuestaServicio;
import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.builder.GetEmailTagResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.PostEmailTagResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.PutEmailTagResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.RespuestaServicioBuilder;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailTag;
import pe.com.banbif.correo.eletronico.service.data.entity.GetEmailTagResponse;
import pe.com.banbif.correo.eletronico.service.data.entity.PostEmailTagResponse;
import pe.com.banbif.correo.eletronico.service.data.entity.PutEmailTagResponse;
import pe.com.banbif.correo.eletronico.service.data.repository.EmailTagRepository;
import pe.com.banbif.correo.eletronico.service.exception.AlreadyExistsException;
import pe.com.banbif.correo.eletronico.service.exception.NotFoundException;

@Service
public class EmailTagService {

	private EmailTagRepository emailTagRepository;

	public EmailTagService(EmailTagRepository emailTagRepository) {
		this.emailTagRepository = emailTagRepository;
	}

	public EmailTag save(EmailTag emailTag) {
		Optional<EmailTag> findByValorTagTagClave = getByUniqueKey(emailTag);

		if (findByValorTagTagClave.isPresent()) {
			throw new AlreadyExistsException();
		}
		emailTag.setId(null);
		
		return emailTagRepository.save(emailTag);
	}

	public PostEmailTagResponse save(Map<String, String> headers, EmailTag emailTag) {
		EmailTag save = save(emailTag);
		return PostEmailTagResponseBuilder.getInstace().build(headers, save);
	}
	
	public GetEmailTagResponse save(Map<String, String> headers, List<EmailTag> emailTags) {
		List<EmailTag> tags = new ArrayList<EmailTag>();
		for (EmailTag et : emailTags) {
			EmailTag save = save(et);
			tags.add(save);
		}
		
		return GetEmailTagResponseBuilder.getInstace().build(headers, tags);
	}
	
	public EmailTag update(EmailTag emailTag) {
		
		EmailTag findById = findById(emailTag.getId());

		Optional<EmailTag> findByValorTagTagClave = getByUniqueKey(emailTag);

		if (findByValorTagTagClave.isPresent()) {
			EmailTag clave = findByValorTagTagClave.get();

			if (!clave.getId().equalsIgnoreCase(findById.getId())) {
				throw new AlreadyExistsException();
			}
		}

		return emailTagRepository.save(emailTag);
	}
	
	public PutEmailTagResponse update(Map<String, String> headers, EmailTag emailTag) {
		EmailTag update = update(emailTag);
		return PutEmailTagResponseBuilder.getInstace().build(headers, update);
	}

	public EmailTag findById(String id) {
		Optional<EmailTag> findById = emailTagRepository.findById(id);

		return findById.orElseThrow(() -> new NotFoundException());
	}

	public GetEmailTagResponse findById(Map<String, String> headers, String id) {
		EmailTag findById = findById(id);
		
		return GetEmailTagResponseBuilder.getInstace().build(headers, findById);
	}
	
	public List<EmailTag> findByTiposCorreos(TiposCorreos tiposCorreos) {
		Optional<List<EmailTag>> findByTiposCorreos = emailTagRepository.findByTiposCorreos(tiposCorreos);

		return findByTiposCorreos.orElseThrow(() -> new NotFoundException());
	}

	public GetEmailTagResponse findByTiposCorreos(Map<String, String> headers, TiposCorreos tiposCorreos) {
		List<EmailTag> findByTiposCorreos = findByTiposCorreos(tiposCorreos);
		
		return GetEmailTagResponseBuilder.getInstace().build(headers, findByTiposCorreos);
	}
	
	public List<EmailTag> list() {
		return emailTagRepository.findAll();
	}
	
	public GetEmailTagResponse list(Map<String, String> headers) {
		List<EmailTag> list = list();
		return GetEmailTagResponseBuilder.getInstace().build(headers, list);
	}
	
	public Optional<EmailTag> getByUniqueKey(EmailTag emailTag) {
		String clave = emailTag.getValorTag().getTag().getClave();
		TiposCorreos tc = emailTag.getTiposCorreos();

		return emailTagRepository.findByTiposCorreosAndValorTagTagClave(tc, clave);
	}

	public EmailTag delete(String id) {
		EmailTag findById = findById(id);
		emailTagRepository.delete(findById);

		return findById;
	}

	public RespuestaServicio delete(Map<String, String> headers, String id) {
		delete(id);
		return RespuestaServicioBuilder.getInstace().build(headers);
	}


}
