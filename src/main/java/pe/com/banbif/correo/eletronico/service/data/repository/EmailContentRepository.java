package pe.com.banbif.correo.eletronico.service.data.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailContent;

public interface EmailContentRepository extends MongoRepository<EmailContent, String> {

	Optional<EmailContent> findByTiposCorreos(TiposCorreos tiposCorreos);
}
