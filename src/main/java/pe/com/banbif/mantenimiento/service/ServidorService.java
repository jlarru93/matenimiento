package pe.com.banbif.mantenimiento.service;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Service;
import pe.com.banbif.mantenimiento.data.entity.Auditoria;
import pe.com.banbif.mantenimiento.data.entity.Db;
import pe.com.banbif.mantenimiento.data.entity.Servidor;
import pe.com.banbif.mantenimiento.data.repository.AuditoriaRepository;
import pe.com.banbif.mantenimiento.data.repository.ServidorRepository;
import pe.com.banbif.mantenimiento.exception.BanbifRuntimeException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServidorService {

    private final ServidorRepository servidorRepository;
    private static final String RECORD_NOT_FOUND = "No se encontro ningun registro";

    public List<Servidor> listarServidor() {
        return servidorRepository.findAll();
    }

    public Servidor crear(Servidor servidor) {
        return servidorRepository.save(servidor);
    }

    public Servidor delete(Integer id) {
        Servidor servidor = servidorRepository.findById(id).orElseThrow(() -> new BanbifRuntimeException(RECORD_NOT_FOUND));
        servidorRepository.deleteById(servidor.getId_servidor());
        return servidor;
    }

    public Servidor actualizar(Servidor servidor) {
        Servidor resultServidor = servidorRepository.findById(servidor.getId_servidor()).orElseThrow(() -> new BanbifRuntimeException(RECORD_NOT_FOUND));
        resultServidor.setNombre_servidor(servidor.getNombre_servidor());
        resultServidor.setDescripcion(servidor.getDescripcion());
        resultServidor.setEstado(servidor.getEstado());
        resultServidor.setFecha_actualizacion(servidor.getFecha_actualizacion());
        return servidorRepository.save(resultServidor);
    }

}
