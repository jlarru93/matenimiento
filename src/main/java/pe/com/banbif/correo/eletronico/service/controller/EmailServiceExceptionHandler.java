package pe.com.banbif.correo.eletronico.service.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import io.swagger.model.MensajeServicio;
import io.swagger.model.MetadatoServicio;
import pe.com.banbif.correo.eletronico.service.exception.AlreadyExistsException;
import pe.com.banbif.correo.eletronico.service.exception.BanbifRuntimeException;
import pe.com.banbif.correo.eletronico.service.exception.InvalidAuthorizationException;
import pe.com.banbif.correo.eletronico.service.exception.InvalidCodigoCanalException;
import pe.com.banbif.correo.eletronico.service.exception.NotFoundException;

@ControllerAdvice
public class EmailServiceExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<MetadatoServicio> runtimeHandler(RuntimeException ex) {
		HttpStatus status = ex instanceof BanbifRuntimeException? HttpStatus.BAD_REQUEST : HttpStatus.INTERNAL_SERVER_ERROR;
		return new ResponseEntity<>(handle(ex), status);
	}
	
	@ExceptionHandler(InvalidAuthorizationException.class)
	public ResponseEntity<MetadatoServicio> InvalidAuthorizationHandler(RuntimeException ex) {
		return new ResponseEntity<>(handle(ex), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(InvalidCodigoCanalException.class)
	public ResponseEntity<MetadatoServicio> InvalidCodigoCanalHandler(RuntimeException ex) {
		return new ResponseEntity<>(handle(ex), HttpStatus.BAD_REQUEST);
	}
	
	
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<MetadatoServicio> notFoundExceptionHandler(NotFoundException ex) {
        return new ResponseEntity<>(handle(ex), HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(AlreadyExistsException.class)
    public ResponseEntity<MetadatoServicio> notFoundExceptionHandler(AlreadyExistsException ex) {
        return new ResponseEntity<>(handle(ex), HttpStatus.CONFLICT);
    }
    
	protected MetadatoServicio handle(Exception exception) {
		String idTransaction = UUID.randomUUID().toString();
		return buildMeta(exception, idTransaction);

	}
	
	private MetadatoServicio buildMeta(Exception exception, String idTransaction) {
		MetadatoServicio meta = new MetadatoServicio();
		meta.setMensajes(buildMesaje(exception));
		meta.setResultado(Boolean.FALSE);
		meta.setIdTransaccion(idTransaction);

		return meta;
	}
    
	private List<MensajeServicio> buildMesaje(Exception exception) {
		List<MensajeServicio> messajes = new ArrayList<MensajeServicio>();
		messajes.add(buildMessajeError(exception.getMessage()));
		return messajes;
	}
    
	private MensajeServicio buildMessajeError(String msg) {
		MensajeServicio m = new MensajeServicio();
		m.setTipo(MensajeServicio.TipoEnum.ERROR);
		m.setMensaje(msg);
		m.setCodigo("HTTP");
		return m;
	}
}
