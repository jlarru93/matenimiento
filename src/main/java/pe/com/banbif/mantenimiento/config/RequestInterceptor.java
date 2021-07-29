package pe.com.banbif.mantenimiento.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import pe.com.banbif.mantenimiento.exception.BanbifRuntimeException;
import pe.com.banbif.mantenimiento.exception.InvalidAuthorizationException;
import pe.com.banbif.mantenimiento.exception.InvalidCodigoCanalException;

@Component
public class RequestInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String canal = request.getHeader("codigoCanal");
		String autorization = request.getHeader("Authorization");
		String numeroPagina = request.getHeader("numeroPagina");
		String cantidadRegistros = request.getHeader("cantidadRegistros");
		
		if (request.getMethod().equals("GET")) {
			if (numeroPagina == null || !numeroPagina.matches("[-+]?\\d*\\.?\\d+")) {
				throw new BanbifRuntimeException("¡Encabezado numeroPagina inválido!");
			}
			
			if (cantidadRegistros == null || !cantidadRegistros.matches("[-+]?\\d*\\.?\\d+")) {
				throw new BanbifRuntimeException("¡Encabezado cantidadRegistros inválido!");
			}
		}
		
		if (StringUtils.isBlank(autorization)) {
			throw new InvalidAuthorizationException();
		}

		if (StringUtils.isBlank(canal)) {
			throw new InvalidCodigoCanalException();
		}
		
		if (canal.length() > 20) {
			throw new InvalidCodigoCanalException();
		}

		return true;
	}

}