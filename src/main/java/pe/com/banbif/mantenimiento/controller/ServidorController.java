package pe.com.banbif.mantenimiento.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import pe.com.banbif.mantenimiento.data.entity.Db;
import pe.com.banbif.mantenimiento.data.entity.Servidor;
import pe.com.banbif.mantenimiento.service.ServidorService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/servidor")
@RequiredArgsConstructor
public class ServidorController {

    private final ServidorService servidorService;

    @GetMapping("/listar")
    public List<Servidor> listar() {
        return servidorService.listarServidor();
    }

    @PostMapping("/crear")
    public Servidor crear(@RequestBody Servidor servidor) {
        return servidorService.crear(servidor);
    }

    @DeleteMapping("/delete/{id}")
    public Servidor delete(@PathVariable Integer id) {
      return  servidorService.delete(id);
    }

    @PutMapping("/actualizar")
    public Servidor actualizar(@RequestBody Servidor servidor) {
        return  servidorService.actualizar(servidor);
    }

}
