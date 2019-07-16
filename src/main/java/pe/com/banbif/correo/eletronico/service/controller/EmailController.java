package pe.com.banbif.correo.eletronico.service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.model.Correo;
import io.swagger.model.PostCorreoResponse;
import pe.com.banbif.correo.eletronico.service.business.EmailService;

@RestController("/correos")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<PostCorreoResponse> queueEmail(@RequestBody Correo email) {
        PostCorreoResponse response = new PostCorreoResponse().datos(this.emailService.queueEmail(email));
        return ResponseEntity.ok(response);
    }
    
    
}
