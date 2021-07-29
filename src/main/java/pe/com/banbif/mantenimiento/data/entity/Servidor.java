package pe.com.banbif.mantenimiento.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "man_servidor")
@Data
public class Servidor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_servidor")
	 private Integer id_servidor;
	 private String nombre_servidor;	
	 private String descripcion;
	 private String estado;
	 private String fecha_registro;
	 private String usuario_registro;
	 private String fecha_actualizacion;
	 private String usuario_actualizacion;
	

}
