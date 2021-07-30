package pe.com.banbif.mantenimiento.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.com.banbif.mantenimiento.data.entity.Auditoria;
import pe.com.banbif.mantenimiento.data.entity.Db;

import pe.com.banbif.mantenimiento.data.entity.Servidor;
import pe.com.banbif.mantenimiento.service.DbService;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/db")
@RequiredArgsConstructor
public class DbController {

    private final DbService dbService;

    @GetMapping({"/listar/{idDb}", "/listar"})
    public List<Db> listar(@PathVariable Optional<Integer> idDb) {
        return dbService.listar(idDb);
    }

    @PostMapping("/crear")
    public Db crear(@RequestBody Db db) {
        return dbService.crear(db);
    }

    @DeleteMapping("/delete/{id}")
    public Db delete(@PathVariable int id) {
        return dbService.delete(id);
    }

    @PutMapping("/actualizar")
    public Db actualizar(@RequestBody Db db) {
        return dbService.actualizar(db);
    }
}
