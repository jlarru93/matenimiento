package pe.com.banbif.correo.eletronico.service.business;

import org.springframework.stereotype.Service;

import pe.com.banbif.correo.eletronico.service.data.repository.EmailContentRepository;

@Service
public class EmailContentService {
	

    private EmailContentRepository repository;

	public EmailContentService(EmailContentRepository repository) {
		this.repository = repository;
    }

	
	
}
