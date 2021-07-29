package pe.com.banbif.mantenimiento.data.entity;

import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;

@EnableJpaRepositories
@Data
@Entity
@Table(name = "man_db")
public class Db {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_db;
    //	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_servidor")
    private Integer id_servidor;
    private String nombre_db;
    private String descripcion;
    private String estado;
    private String fecha_registro;
    private String usuario_registro;
    private String fecha_actualizacion;
    private String usuario_actualizacion;


}
