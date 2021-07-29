package pe.com.banbif.mantenimiento.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "man_auditoria")
@Data
public class Auditoria {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id_auditoria;
	 private String nombre_tabla;
	 private String nombre_campo;
	 private String accion;
	 private String valor_anterior;
	 private String valor_nuevo;
	 private String fecha_registro;
	 private String usuario_registro;
	 private String fecha_actualizacion;
	 private String usuario_actualizacion;
	 

	 
	 

}
