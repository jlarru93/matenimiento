package pe.com.banbif.mantenimiento.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "man_columna")
@Data
public class Columna {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id_columna;
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_tabla")
	 private Integer id_tabla;
	 private String nombre_campo;
	 private String nombre_corto;
	 private String descripcion;
	 private String tipo_dato;
	 private Integer size;
	 private String flag_nulo;
	 private String flag_obligatorio;
	 private String flag_pk;
	 private String flag_fk;
	 private String estado;
	 private String fecha_registro;
	 private String usuario_registro;
	 private String fecha_actualizacion;
	 private String usuario_actualizacion;
	 private String flag_auditorio;
	 private String control;
	 private String lista_cbo;


}
