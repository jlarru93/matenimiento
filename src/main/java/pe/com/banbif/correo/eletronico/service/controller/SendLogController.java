package pe.com.banbif.correo.eletronico.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pe.com.banbif.correo.eletronico.service.business.SendLogService;
import pe.com.banbif.correo.eletronico.service.data.entity.SendLog;

@RestController
public class SendLogController {
    private final SendLogService service;

    @Autowired
    public SendLogController(final SendLogService service) {
        this.service = service;
    }

    @GetMapping("sendLog/{emailId}")
    public ResponseEntity<SendLog> getLog(@PathVariable String emailId) {
        return ResponseEntity.ok(service.findByEmailId(emailId));
    }

}
