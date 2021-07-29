package pe.com.banbif.mantenimiento.service;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import pe.com.banbif.mantenimiento.data.entity.Auditoria;
import pe.com.banbif.mantenimiento.data.repository.AuditoriaRepository;


@Service
@RequiredArgsConstructor
public class AuditoriaService {

    private final AuditoriaRepository auditoriaRepository;


    public Auditoria crear(Auditoria auditoria) {
        return  auditoriaRepository.save(auditoria);
    }

}
