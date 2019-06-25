package pe.com.banbif.correo.eletronico.service.business;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailTag;
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

	public EmailTag findById(String id) {
		Optional<EmailTag> findById = emailTagRepository.findById(id);

		return findById.orElseThrow(() -> new NotFoundException());
	}

	public List<EmailTag> findByTiposCorreos(TiposCorreos tiposCorreos) {
		Optional<List<EmailTag>> findByTiposCorreos = emailTagRepository.findByTiposCorreos(tiposCorreos);

		return findByTiposCorreos.orElseThrow(() -> new NotFoundException());
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
}
