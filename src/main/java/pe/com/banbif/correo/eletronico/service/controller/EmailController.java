package pe.com.banbif.correo.eletronico.service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.com.banbif.correo.eletronico.service.business.EmailService;
import pe.com.banbif.correo.eletronico.service.models.CorreoDto;
import pe.com.banbif.correo.eletronico.service.models.PostCorreoDtoResponse;

@RestController("/correos")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<PostCorreoDtoResponse> queueEmail(@RequestBody CorreoDto email) {
        PostCorreoDtoResponse response = new PostCorreoDtoResponse().datos(this.emailService.queueEmail(email));
        return ResponseEntity.ok(response);
    }
    
    
}
