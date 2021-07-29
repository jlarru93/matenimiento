package pe.com.banbif.mantenimiento.service;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Service;
import pe.com.banbif.mantenimiento.data.entity.Servidor;
import pe.com.banbif.mantenimiento.data.entity.Tabla;
import pe.com.banbif.mantenimiento.data.repository.ServidorRepository;
import pe.com.banbif.mantenimiento.data.repository.TablaRepository;
import pe.com.banbif.mantenimiento.exception.BanbifRuntimeException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TablaService {

    private final TablaRepository tablaRepository;
    private static final String RECORD_NOT_FOUND = "No se encontro ningun registro";
    public List<Tabla> listarTabla() {
        return  tablaRepository.findAll();
    }

    public Tabla crear(Tabla tabla) {
        return  tablaRepository.save(tabla);
    }

    public Tabla delete(Integer id) {
        Tabla tabla = tablaRepository.findById(id).orElseThrow(() -> new BanbifRuntimeException(RECORD_NOT_FOUND));
        tablaRepository.deleteById(tabla.getId_tabla());
        return tabla;
    }

    public Tabla actualizar(Tabla tabla) {
        Tabla resultServidor= tablaRepository.findById(tabla.getId_tabla()).orElseThrow(() -> new BanbifRuntimeException(RECORD_NOT_FOUND));
        resultServidor.setNombre_tabla(tabla.getNombre_tabla());
        resultServidor.setDescripcion(tabla.getDescripcion());
        resultServidor.setEstado(tabla.getEstado());
        resultServidor.setFecha_actualizacion(tabla.getFecha_actualizacion());
        resultServidor.setUsuario_actualizacion(tabla.getUsuario_actualizacion());
        return tablaRepository.save(tabla);
    }

}
