package pe.com.banbif.correo.eletronico.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pe.com.banbif.correo.eletronico.service.business.ErrorLogService;
import pe.com.banbif.correo.eletronico.service.data.entity.ErrorLog;

@RestController
public class ErrorLogController {

    private final ErrorLogService service;

    @Autowired
    public ErrorLogController(final ErrorLogService service) {
        this.service = service;
    }

    @GetMapping("/errorLog/{emailId}")
    public ResponseEntity<ErrorLog> getLog(@PathVariable String emailId) {
        return ResponseEntity.ok(service.findByEmailId(emailId));
    }
}
