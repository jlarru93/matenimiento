package pe.com.banbif.correo.eletronico.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.com.banbif.correo.eletronico.service.business.EmailService;

import pe.com.banbif.correo.eletronico.service.model.Correo;
import pe.com.banbif.correo.eletronico.service.model.PostCorreoResponse;

@RestController
public class EmailController {

    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/")
    public ResponseEntity<PostCorreoResponse> queueEmail(@RequestBody Correo email) {
        PostCorreoResponse response = new PostCorreoResponse().datos(this.emailService.queueEmail(email));
        return ResponseEntity.ok(response);
    }
}
