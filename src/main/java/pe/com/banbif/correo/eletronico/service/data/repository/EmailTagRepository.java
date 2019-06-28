package pe.com.banbif.correo.eletronico.service.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailTag;

public interface EmailTagRepository extends MongoRepository<EmailTag, String> {

	Optional<List<EmailTag>> findByTiposCorreos(TiposCorreos tiposCorreos);

	Optional<EmailTag> findByTiposCorreosAndTagCorreoClave(TiposCorreos tiposCorreos, String Clave);

}