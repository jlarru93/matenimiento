package pe.com.banbif.mantenimiento.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "man_tabla")
@Data
public class Tabla {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id_tabla;
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_db")
	 private Integer id_db;
	 private String nombre_tabla;
	 private String descripcion;
	 private String estado;
	 private String fecha_registro;
	 private String usuario_registro;
	 private String fecha_actualizacion;
	 private String usuario_actualizacion;
	 private String FLAG_ELIMINAR_FILA;
	 

}
