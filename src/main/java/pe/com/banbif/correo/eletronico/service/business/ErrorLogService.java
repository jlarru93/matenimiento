package pe.com.banbif.correo.eletronico.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.banbif.correo.eletronico.service.data.entity.Email;
import pe.com.banbif.correo.eletronico.service.data.entity.ErrorLog;

import org.apache.commons.lang3.exception.ExceptionUtils;
import pe.com.banbif.correo.eletronico.service.data.repository.ErrorLogRepository;

import java.time.LocalDateTime;

@Service
public class ErrorLogService {

    private final ErrorLogRepository repository;

    @Autowired
    public ErrorLogService(final ErrorLogRepository repository) {
        this.repository = repository;
    }

    public void log(final Throwable ex, final Email email) {
        ErrorLog log = new ErrorLog();
        log.setEmail(email);
        log.setErrorMessage(ex.getMessage());
        log.setTime(LocalDateTime.now());
        log.setStackTrace(ExceptionUtils.getStackTrace(ex));
        saveLog(log);
    }

    public ErrorLog saveLog(final ErrorLog log) {
        return this.repository.save(log);
    }

    public ErrorLog findByEmailId(String emailId) {
        return repository.findByEmail_Id(emailId);
    }
}
