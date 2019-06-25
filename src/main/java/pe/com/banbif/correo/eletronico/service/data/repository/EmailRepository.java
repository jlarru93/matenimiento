package pe.com.banbif.correo.eletronico.service.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.banbif.correo.eletronico.service.data.entity.Email;

public interface EmailRepository extends MongoRepository<Email, String> {
}
