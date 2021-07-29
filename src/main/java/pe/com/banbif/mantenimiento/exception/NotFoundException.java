package pe.com.banbif.mantenimiento.exception;

public class NotFoundException  extends RuntimeException {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1548517751871460837L;

	public NotFoundException() {
		super("¡Registro no encontrado!");
	}

}

