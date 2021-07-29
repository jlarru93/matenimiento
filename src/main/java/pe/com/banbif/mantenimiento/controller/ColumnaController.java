package pe.com.banbif.mantenimiento.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.banbif.mantenimiento.data.entity.*;
import pe.com.banbif.mantenimiento.service.ColumnaService;
import pe.com.banbif.mantenimiento.service.ServidorService;

import java.util.List;

@RestController
@RequestMapping("/columna")
@RequiredArgsConstructor
public class ColumnaController {


    private final ColumnaService columnaService;

    @GetMapping("/listar")
    public List<Columna> listar() {
        return columnaService.listar();
    }

    @PostMapping("/crear")
    public Columna crear(@RequestBody Columna columna) {
        return columnaService.crear(columna);
    }

    @DeleteMapping("/delete/{id}")
    public Columna delete(@PathVariable int id) {
        return columnaService.delete(id);
    }

    @PutMapping("/actualizar")
    public Columna actualizar(@RequestBody Columna columna) {
        return columnaService.actualizar(columna);
    }
}
