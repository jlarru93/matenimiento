package pe.com.banbif.correo.eletronico.service.exception;

public class InvalidAuthorizationException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5386235005819374939L;

	public InvalidAuthorizationException() {
		super("Encabezado Authorization inválido");
	}

}
