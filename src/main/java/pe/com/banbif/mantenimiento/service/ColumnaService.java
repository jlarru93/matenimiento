package pe.com.banbif.mantenimiento.service;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Service;
import pe.com.banbif.mantenimiento.data.entity.Columna;
import pe.com.banbif.mantenimiento.data.entity.Db;
import pe.com.banbif.mantenimiento.data.entity.Servidor;
import pe.com.banbif.mantenimiento.data.repository.ColumnaRepository;
import pe.com.banbif.mantenimiento.data.repository.ServidorRepository;
import pe.com.banbif.mantenimiento.exception.BanbifRuntimeException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ColumnaService {

    private final ColumnaRepository columnaRepository;

    private static final String RECORD_NOT_FOUND="No se encontro ningun registro";

    public List<Columna> listar() {
        return columnaRepository.findAll();
    }


    public Columna crear(Columna columna) {
        return columnaRepository.save(columna);
    }

    public Columna delete(Integer id) {
        Columna columna = columnaRepository.findById(id).orElseThrow(() -> new BanbifRuntimeException(RECORD_NOT_FOUND));
        columnaRepository.deleteById(columna.getId_columna());
        return columna;
    }

    public Columna actualizar(Columna columna) {
        Columna resultServidor = columnaRepository.findById(columna.getId_columna()).orElseThrow(() -> new BanbifRuntimeException(RECORD_NOT_FOUND));

        resultServidor.setNombre_campo(columna.getNombre_campo());
        resultServidor.setNombre_corto(columna.getNombre_corto());
        resultServidor.setDescripcion(columna.getDescripcion());
        resultServidor.setTipo_dato(columna.getTipo_dato());
        resultServidor.setFlag_nulo(columna.getFlag_nulo());
        resultServidor.setFlag_obligatorio(columna.getFlag_obligatorio());
        resultServidor.setFlag_pk(columna.getFlag_pk());
        resultServidor.setFlag_fk(columna.getFlag_fk());
        resultServidor.setEstado(columna.getEstado());
        resultServidor.setFecha_actualizacion(columna.getFecha_actualizacion());
        resultServidor.setUsuario_actualizacion(columna.getUsuario_actualizacion());
        resultServidor.setFlag_auditorio(columna.getFlag_auditorio());
        resultServidor.setControl(columna.getControl());
        resultServidor.setLista_cbo(columna.getLista_cbo());

        return columnaRepository.save(resultServidor);
    }


}
