package pe.com.banbif.correo.eletronico.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.com.banbif.correo.eletronico.service.business.EmailService;
import pe.com.banbif.correo.eletronico.service.data.entity.Email;

@RestController
public class EmailController {

    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/")
    public ResponseEntity<Email> queueEmail(@RequestBody Email email) {
        return ResponseEntity.ok(this.emailService.queueEmail(email));
    }
}
