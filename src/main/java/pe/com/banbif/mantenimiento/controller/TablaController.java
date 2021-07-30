package pe.com.banbif.mantenimiento.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.com.banbif.mantenimiento.data.entity.Db;
import pe.com.banbif.mantenimiento.data.entity.Servidor;
import pe.com.banbif.mantenimiento.data.entity.Tabla;
import pe.com.banbif.mantenimiento.service.ServidorService;
import pe.com.banbif.mantenimiento.service.TablaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tabla")
@RequiredArgsConstructor
public class TablaController {

    private final TablaService tablaService;

    @GetMapping({"/listar/{id}", "/listar"})
    public List<Tabla> listar(@PathVariable Optional<Integer> id) {
        return tablaService.listarTabla(id);
    }

    @PostMapping("/crear")
    public Tabla crear(@RequestBody Tabla tabla) {
        return tablaService.crear(tabla);
    }

    @DeleteMapping("/delete/{id}")
    public Tabla delete(@PathVariable Integer id) {
        return tablaService.delete(id);
    }

    @PutMapping("/actualizar")
    public Tabla actualizar(@RequestBody Tabla tabla) {
        return tablaService.actualizar(tabla);
    }


}
