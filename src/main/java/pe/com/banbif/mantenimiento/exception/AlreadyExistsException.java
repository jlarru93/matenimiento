package pe.com.banbif.mantenimiento.exception;

public class AlreadyExistsException  extends RuntimeException {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -5357222778644022194L;

	public AlreadyExistsException() {
		super("¡TemplateCorreo ya existe!");
	}
	
	public AlreadyExistsException(String msg) {
		super(msg);
	}


}

