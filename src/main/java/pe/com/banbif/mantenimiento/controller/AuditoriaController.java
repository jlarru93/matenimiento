package pe.com.banbif.mantenimiento.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.banbif.mantenimiento.data.entity.Auditoria;

import pe.com.banbif.mantenimiento.service.AuditoriaService;


@RestController
@RequestMapping("/auditoria")
@RequiredArgsConstructor
public class AuditoriaController {
    private final AuditoriaService auditoriaService;

    @PostMapping("/crear")
    public Auditoria crear(@RequestBody Auditoria auditoria) {
        return auditoriaService.crear(auditoria);
    }


}
