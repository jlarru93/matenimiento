package pe.com.banbif.correo.eletronico.service.data.entity;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Objects;

public class ErrorLog {

    @Id
    private String id;
    private Email email;
    private String errorMessage;
    private String stackTrace;
    private LocalDateTime time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorLog errorLog = (ErrorLog) o;
        return Objects.equals(id, errorLog.id) &&
                Objects.equals(email, errorLog.email) &&
                Objects.equals(errorMessage, errorLog.errorMessage) &&
                Objects.equals(stackTrace, errorLog.stackTrace) &&
                Objects.equals(time, errorLog.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, errorMessage, stackTrace, time);
    }

    @Override
    public String toString() {
        return "ErrorLog{" +
                "id='" + id + '\'' +
                ", email=" + email +
                ", errorMessage='" + errorMessage + '\'' +
                ", stackTrace='" + stackTrace + '\'' +
                ", time=" + time +
                '}';
    }
}
