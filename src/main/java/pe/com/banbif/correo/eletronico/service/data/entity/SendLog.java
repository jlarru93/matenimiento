package pe.com.banbif.correo.eletronico.service.data.entity;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Objects;

public class SendLog {

    @Id
    private String id;
    private Email email;
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
        SendLog sendLog = (SendLog) o;
        return Objects.equals(id, sendLog.id) &&
                Objects.equals(email, sendLog.email) &&
                Objects.equals(time, sendLog.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, time);
    }

    @Override
    public String toString() {
        return "SendLog{" +
                "id='" + id + '\'' +
                ", email=" + email +
                ", time=" + time +
                '}';
    }
}
