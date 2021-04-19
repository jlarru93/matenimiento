package pe.com.banbif.correo.eletronico.service.data.repository;

import java.util.Optional;

//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.swagger.model.CodigosCanales;
import pe.com.banbif.correo.eletronico.service.models.TemplateCorreoDto;
import pe.com.banbif.correo.eletronico.service.models.TiposCorreosDto;

@Repository
public interface TemplateCorreoRepository{//} extends MongoRepository<TemplateCorreoDto, String> {

	Optional<TemplateCorreoDto> findByTipoCorreoAndCanal(TiposCorreosDto tiposCorreos, CodigosCanales codigosCanales);
}
