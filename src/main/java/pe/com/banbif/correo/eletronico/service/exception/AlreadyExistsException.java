package pe.com.banbif.correo.eletronico.service.exception;

public class AlreadyExistsException  extends RuntimeException {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -5357222778644022194L;

	public AlreadyExistsException() {
		super("Ya existe");
	}
	
	public AlreadyExistsException(String msg) {
		super(msg);
	}


}

