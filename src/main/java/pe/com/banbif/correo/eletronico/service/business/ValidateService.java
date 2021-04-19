package pe.com.banbif.correo.eletronico.service.business;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import io.swagger.model.CodigosCanales;
import io.swagger.model.Destinatario;
import io.swagger.model.Remetente;
import io.swagger.model.TemplateCorreo;
import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.exception.InvalidMailException;
import pe.com.banbif.correo.eletronico.service.exception.RequiredException;
import pe.com.banbif.correo.eletronico.service.models.TemplateCorreoDto;
import pe.com.banbif.correo.eletronico.service.models.TiposCorreosDto;

@Service
public class ValidateService {

	private static final String REGEX_MAIL = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

	public void validateTemplateCorreo(TemplateCorreoDto templateCorreo) {

		canalValidate(templateCorreo.getCanal());
		envioCorreoClienteValidate(templateCorreo.isEnvioCorreoCliente());
		tipoCorreoValidate(templateCorreo.getTipoCorreo());
		remetenteValidate(templateCorreo.getRemetente());
		assuntoValidate(templateCorreo.getAsunto());
		contenidoValidate(templateCorreo.getContenido());
		destinatarioValidade(templateCorreo.getDestinatario());
	}

	private void destinatarioValidade(Destinatario destinatario) {
		if (destinatario == null || StringUtils.isBlank(destinatario.getEnderecoCorreo())) {
			throw new RequiredException("destinatario");
		}
		
		validateEmail(destinatario.getEnderecoCorreo());
	}

	private void validateEmail(String enderecoCorreo) {
		String[] split = enderecoCorreo.split(";");
		for (int i = 0; i < split.length; i++) {
			if(!isValidMail(split[i])) {
				throw new InvalidMailException(split[i]);
			}
		}
		
	}

	private void contenidoValidate(String contenido) {
		if (StringUtils.isBlank(contenido)) {
			throw new RequiredException("contenido");
		}
	}

	private void assuntoValidate(String asunto) {
		if (StringUtils.isBlank(asunto)) {
			throw new RequiredException("asunto");
		}
	}

	private void remetenteValidate(Remetente remetente) {
		if (remetente == null || StringUtils.isBlank(remetente.getEnderecoCorreo())) {
			throw new RequiredException("remetente");
		} else if (remetente.getEnderecoCorreo().indexOf(";") > -1) {
			throw new InvalidMailException(remetente.getEnderecoCorreo());
		}
		
		validateEmail(remetente.getEnderecoCorreo());
	}

	private void tipoCorreoValidate(TiposCorreosDto tipoCorreo) {
		if (tipoCorreo == null) {
			throw new RequiredException("tipoCorreo");
		}
	}

	private void envioCorreoClienteValidate(Boolean envioCorreoCliente) {
		if (envioCorreoCliente == null) {
			throw new RequiredException("envioCorreoCliente");
		}
	}

	private void canalValidate(CodigosCanales canal) {
		if (canal == null) {
			throw new RequiredException("canal");
		}
	}

	private boolean isValidMail(String mail) {
		String regex = REGEX_MAIL;
		return mail.matches(regex);
	}

}
