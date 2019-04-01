package pe.com.banbif.correo.eletronico.service.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pe.com.banbif.correo.eletronico.service.data.entity.ErrorLog;

public interface ErrorLogRepository extends MongoRepository<ErrorLog, String> {
    ErrorLog findByEmail_Id(String emailId);
}
