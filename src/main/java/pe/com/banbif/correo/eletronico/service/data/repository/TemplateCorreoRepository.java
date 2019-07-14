package pe.com.banbif.correo.eletronico.service.data.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.swagger.model.CodigosCanales;
import io.swagger.model.TemplateCorreo;
import io.swagger.model.TiposCorreos;

@Repository
public interface TemplateCorreoRepository extends MongoRepository<TemplateCorreo, String> {

	Optional<TemplateCorreo> findByTipoCorreoAndCanal(TiposCorreos tiposCorreos, CodigosCanales codigosCanales);
}
