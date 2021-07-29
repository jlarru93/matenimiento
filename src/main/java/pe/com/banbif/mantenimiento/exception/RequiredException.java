package pe.com.banbif.mantenimiento.exception;

public class RequiredException  extends BanbifRuntimeException {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RequiredException(String msg) {
		super("¡".concat(msg).concat(": Falta, pero se requiere!"));
	}

}

