package pe.com.banbif.mantenimiento.data.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "man_db")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Db implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_db;
    private Integer id_servidor;
    private String nombre_db;
    private String descripcion;
    private String estado;
    private String fecha_registro;
    private String usuario_registro;
    private String fecha_actualizacion;
    private String usuario_actualizacion;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_db")
    private List<Tabla> tablas = new ArrayList<>();


}
