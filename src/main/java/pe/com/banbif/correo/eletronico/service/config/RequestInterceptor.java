package pe.com.banbif.correo.eletronico.service.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import pe.com.banbif.correo.eletronico.service.exception.InvalidAuthorizationException;
import pe.com.banbif.correo.eletronico.service.exception.InvalidCodigoCanalException;

@Component
public class RequestInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String canal = request.getHeader("codigoCanal");
		String autorization = request.getHeader("Authorization");

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