package pe.com.banbif.correo.eletronico.service.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.swagger.model.TagCorreo;
import io.swagger.model.TiposCorreos;

public interface TagCorreoRepository extends MongoRepository<TagCorreo, String> {

	Optional<List<TagCorreo>> findByTipoCorreo(TiposCorreos tiposCorreos);

}