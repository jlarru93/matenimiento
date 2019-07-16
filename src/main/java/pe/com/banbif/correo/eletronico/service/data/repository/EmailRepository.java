package pe.com.banbif.correo.eletronico.service.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pe.com.banbif.correo.eletronico.service.data.entity.Email;

@Repository
public interface EmailRepository extends MongoRepository<Email, String> {
}
