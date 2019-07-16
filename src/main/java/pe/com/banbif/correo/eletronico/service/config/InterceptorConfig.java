package pe.com.banbif.correo.eletronico.service.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class InterceptorConfig implements WebMvcConfigurer {

	private RequestInterceptor requestInterceptor;

	public InterceptorConfig(RequestInterceptor requestInterceptor) {
		this.requestInterceptor = requestInterceptor;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestInterceptor);
	}
}