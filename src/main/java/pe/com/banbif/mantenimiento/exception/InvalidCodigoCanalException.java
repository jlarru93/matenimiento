package pe.com.banbif.mantenimiento.exception;


public class InvalidCodigoCanalException  extends RuntimeException {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 559769598293915750L;

	public InvalidCodigoCanalException() {
		super("¡Encabezado codigoCanal inválido!");
	}
}

