package pe.com.banbif.mantenimiento.exception;

public class InvalidMailException  extends BanbifRuntimeException {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMailException(String msg) {
		super("¡".concat(msg).concat(": no es un email valido!"));
	}

}

