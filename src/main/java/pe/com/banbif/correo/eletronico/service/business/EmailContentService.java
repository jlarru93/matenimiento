package pe.com.banbif.correo.eletronico.service.business;

import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.com.banbif.correo.eletronico.service.data.entity.EmailContent;
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
		Optional<EmailContent> findByTiposCorreos = findByUniqueKey(emailContent);
		if (findByTiposCorreos.isPresent()) {
			throw new AlreadyExistsException();
		}
		emailContent.setId(null);

		return emailContentRepository.save(emailContent);
	}

	private Optional<EmailContent> findByUniqueKey(EmailContent emailContent) {
		return emailContentRepository.findByTiposCorreos(emailContent.getTiposCorreos());
	}

	public EmailContent update(EmailContent emailContent) {
		EmailContent findById = findById(emailContent.getId());

		Optional<EmailContent> findByUniqueKey = findByUniqueKey(emailContent);

		if (findByUniqueKey.isPresent()) {
			EmailContent email = findByUniqueKey.get();

			if (!email.getId().equalsIgnoreCase(findById.getId())) {
				throw new AlreadyExistsException();
			}
		}

		return emailContentRepository.save(emailContent);
	}

	public EmailContent findById(String id) {
		Optional<EmailContent> findById = emailContentRepository.findById(id);
		
		return findById.orElseThrow(() -> new NotFoundException());
	}

	public EmailContent delete(String id) {
		EmailContent findById = findById(id);
		emailContentRepository.delete(findById);
		return findById;
	}

}
