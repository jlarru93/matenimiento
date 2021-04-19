package pe.com.banbif.correo.eletronico.service.data.repository;

//import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.banbif.correo.eletronico.service.data.entity.SendLog;

public interface SendLogRepository{//} extends MongoRepository<SendLog, String> {
    SendLog findByEmail_Id(String emailId);
}
