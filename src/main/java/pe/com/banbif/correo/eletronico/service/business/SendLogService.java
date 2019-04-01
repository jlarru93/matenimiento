package pe.com.banbif.correo.eletronico.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.banbif.correo.eletronico.service.data.entity.Email;
import pe.com.banbif.correo.eletronico.service.data.entity.SendLog;
import pe.com.banbif.correo.eletronico.service.data.repository.SendLogRepository;

import java.time.LocalDateTime;

@Service
public class SendLogService {
    private final SendLogRepository repository;

    @Autowired
    public SendLogService(final SendLogRepository repository) {
        this.repository = repository;
    }

    public void log(Email email) {
        SendLog log = new SendLog();
        log.setEmail(email);
        log.setTime(LocalDateTime.now());
        repository.save(log);
    }

    public SendLog saveLog(SendLog log) {
        return this.repository.save(log);
    }

    public SendLog findByEmailId(String emailId) {
        return repository.findByEmail_Id(emailId);
    }

}
