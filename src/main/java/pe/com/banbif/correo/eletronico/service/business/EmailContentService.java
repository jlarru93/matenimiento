package pe.com.banbif.correo.eletronico.service.business;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.swagger.model.EmailContent;
import io.swagger.model.GetEmailContentResponse;
import io.swagger.model.PostEmailContentResponse;
import io.swagger.model.PutEmailContentResponse;
import io.swagger.model.RespuestaServicio;
import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.builder.GetEmailContentResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.PostEmailContentResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.PutEmailContentResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.RespuestaServicioBuilder;
import pe.com.banbif.correo.eletronico.service.data.repository.EmailContentRepository;
import pe.com.banbif.correo.eletronico.service.exception.AlreadyExistsException;
import pe.com.banbif.correo.eletronico.service.exception.NotFoundException;

@Service
public class EmailContentService {

	private EmailContentRepository emailContentRepository;

	public EmailContentService(EmailContentRepository emailContentRepository) {
		this.emailContentRepository = emailContentRepository;
	}

	public EmailContent save(EmailContent emailContent) {
		Optional<EmailContent> findByTiposCorreos = findByUniqueKey(emailContent.getTiposCorreos());
		if (findByTiposCorreos.isPresent()) {
			throw new AlreadyExistsException();
		}
		emailContent.setId(null);

		return emailContentRepository.save(emailContent);
	}
	
	public PostEmailContentResponse save(Map<String, String> headers, EmailContent emailContent) {
		EmailContent save = save(emailContent);
		return PostEmailContentResponseBuilder.getInstace().build(headers, save);
	}


	public Optional<EmailContent> findByUniqueKey(TiposCorreos tiposCorreos) {
		return emailContentRepository.findByTiposCorreos(tiposCorreos);
	}

	public EmailContent update(EmailContent emailContent) {
		EmailContent findById = findById(emailContent.getId());

		Optional<EmailContent> findByUniqueKey = findByUniqueKey(emailContent.getTiposCorreos());

		if (findByUniqueKey.isPresent()) {
			EmailContent email = findByUniqueKey.get();

			if (!email.getId().equalsIgnoreCase(findById.getId())) {
				throw new AlreadyExistsException();
			}
		}

		return emailContentRepository.save(emailContent);
	}

	public PutEmailContentResponse update(Map<String, String> headers, EmailContent emailContent) {
		EmailContent update = update(emailContent);
		return PutEmailContentResponseBuilder.getInstace().build(headers, update);
	}
	
	public EmailContent findById(String id) {
		Optional<EmailContent> findById = emailContentRepository.findById(id);
		
		return findById.orElseThrow(() -> new NotFoundException());
	}
	
	public GetEmailContentResponse findById(Map<String, String> headers, String id) {
		EmailContent findById = findById(id);
		
		return GetEmailContentResponseBuilder.getInstace().build(headers, findById);
	}
	
	public GetEmailContentResponse findByUniqueKey(Map<String, String> headers, TiposCorreos tiposCorreos) {
		 Optional<EmailContent> findByUniqueKey = findByUniqueKey(tiposCorreos);
		
		return GetEmailContentResponseBuilder.getInstace().build(headers, findByUniqueKey.orElseThrow(() -> new NotFoundException()));
	}
	
	
	public GetEmailContentResponse list(Map<String, String> headers) {
		List<EmailContent> list = list();
		
		return GetEmailContentResponseBuilder.getInstace().build(headers, list);
	}
	
	public List<EmailContent> list(){
		return emailContentRepository.findAll();
	}

	public EmailContent delete(String id) {
		EmailContent findById = findById(id);
		emailContentRepository.delete(findById);
		
		return findById;
	}
	
	public RespuestaServicio delete(Map<String, String> headers, String id) {
		delete(id);
		return RespuestaServicioBuilder.getInstace().build(headers);
	}
	


}
