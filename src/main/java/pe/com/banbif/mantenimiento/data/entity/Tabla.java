package pe.com.banbif.mantenimiento.data.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "man_tabla")
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Tabla implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tabla;
    private Integer id_db;
    private String nombre_tabla;
    private String descripcion;
    private String estado;
    private String fecha_registro;
    private String usuario_registro;
    private String fecha_actualizacion;
    private String usuario_actualizacion;
    private String flag_eliminar_fila;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_tabla")
    private List<Columna> columnas = new ArrayList<>();

}
