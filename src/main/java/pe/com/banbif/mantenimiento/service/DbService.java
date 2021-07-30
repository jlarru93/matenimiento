package pe.com.banbif.mantenimiento.service;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Service;
import pe.com.banbif.mantenimiento.data.entity.Auditoria;
import pe.com.banbif.mantenimiento.data.entity.Columna;
import pe.com.banbif.mantenimiento.data.entity.Db;
import pe.com.banbif.mantenimiento.data.entity.Servidor;
import pe.com.banbif.mantenimiento.data.repository.DbRepository;
import pe.com.banbif.mantenimiento.data.repository.ServidorRepository;
import pe.com.banbif.mantenimiento.exception.BanbifRuntimeException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbService {

    private final DbRepository dbRepository;
    private static final String RECORD_NOT_FOUND = "No se encontro ningun registro";

    public List<Db> listar(Optional<Integer> idDb) {
        List<Db> resultDb = null;
        if (idDb.isPresent()) {
            resultDb = dbRepository.getTableByDb(idDb.get());
        } else {
            resultDb = dbRepository.findAll();
        }
        return resultDb;
    }

    public Db crear(Db db) {
        return dbRepository.save(db);
    }

    public Db delete(Integer id) {
        Db db = dbRepository.findById(id).orElseThrow(() -> new BanbifRuntimeException(RECORD_NOT_FOUND));
        dbRepository.deleteById(db.getId_db());
        return db;
    }

    public Db actualizar(Db db) {
        Db resultServidor = dbRepository.findById(db.getId_db()).orElseThrow(() -> new BanbifRuntimeException("RECORD_NOT_FOUND"));
        resultServidor.setNombre_db(db.getNombre_db());
        resultServidor.setDescripcion(db.getDescripcion());
        resultServidor.setEstado(db.getEstado());
        resultServidor.setFecha_actualizacion(db.getFecha_actualizacion());
        resultServidor.setUsuario_actualizacion(db.getUsuario_actualizacion());
        return dbRepository.save(resultServidor);
    }

}
