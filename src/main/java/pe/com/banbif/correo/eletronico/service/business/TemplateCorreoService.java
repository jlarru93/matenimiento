package pe.com.banbif.correo.eletronico.service.business;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.swagger.model.CodigosCanales;
import io.swagger.model.GetTemplateCorreoResponse;
import io.swagger.model.GetTemplatesCorreosResponse;
import io.swagger.model.PostTemplateCorreoResponse;
import io.swagger.model.PutTemplateCorreoResponse;
import io.swagger.model.RespuestaServicio;
import io.swagger.model.TemplateCorreo;
import pe.com.banbif.correo.eletronico.service.builder.GetTemplateCorreoResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.GetTemplatesCorreosResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.PostTemplateCorreoResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.PutTemplateCorreoResponseBuilder;
import pe.com.banbif.correo.eletronico.service.builder.RespuestaServicioBuilder;
import pe.com.banbif.correo.eletronico.service.data.repository.TemplateCorreoRepository;
import pe.com.banbif.correo.eletronico.service.exception.AlreadyExistsException;
import pe.com.banbif.correo.eletronico.service.exception.NotFoundException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import pe.com.banbif.correo.eletronico.service.models.*;

@Service
public class TemplateCorreoService {
	
//	private static final String CANTIDAD_REGISTROS_HEADER_NAME = "cantidadregistros";
//	private static final String NUMERO_PAGINA_HEADER_NAME = "numeropagina";
//	private static final int DEFAULT_PAGE_SIZE = 100;
//	private TemplateCorreoRepository templateCorreoRepository;
//	private ValidateService validadeService;
//
//	public TemplateCorreoService(TemplateCorreoRepository templateCorreoRepository, ValidateService validadeService) {
//		this.templateCorreoRepository = templateCorreoRepository;
//		this.validadeService = validadeService;
//	}

//	public TemplateCorreoDto save(TemplateCorreoDto templateCorreo) {
//		Optional<TemplateCorreoDto> findByTiposCorreos = findByUniqueKey(templateCorreo.getTipoCorreo(), templateCorreo.getCanal());
//		if (findByTiposCorreos.isPresent()) {
//			throw new AlreadyExistsException();
//		}
//		templateCorreo.setId(null);
//
//		return templateCorreoRepository.save(templateCorreo);
//	}
	
//	public PostTemplateCorreoDtoResponse save(Map<String, String> headers, TemplateCorreoDto templateCorreo) {
//		validadeService.validateTemplateCorreo(templateCorreo);
//		TemplateCorreoDto save = save(templateCorreo);
//		return PostTemplateCorreoResponseBuilder.getInstace().build(headers, save);
//	}


//	public Optional<TemplateCorreoDto> findByUniqueKey(TiposCorreosDto tiposCorreos, CodigosCanales codigosCanales) {
//		return templateCorreoRepository.findByTipoCorreoAndCanal(tiposCorreos, codigosCanales);
//	}

//	public TemplateCorreoDto update(TemplateCorreoDto templateCorreo) {
//		TemplateCorreoDto findById = findById(templateCorreo.getId());
//
//		Optional<TemplateCorreoDto> findByUniqueKey = findByUniqueKey(templateCorreo.getTipoCorreo(), templateCorreo.getCanal());
//
//		if (findByUniqueKey.isPresent()) {
//			TemplateCorreoDto email = findByUniqueKey.get();
//
//			if (!email.getId().equalsIgnoreCase(findById.getId())) {
//				throw new AlreadyExistsException();
//			}
//		}
//
//		return templateCorreoRepository.save(templateCorreo);
//	}

//	public PutTemplateCorreoDtoResponse update(Map<String, String> headers, TemplateCorreoDto templateCorreo) {
//		validadeService.validateTemplateCorreo(templateCorreo);
//		TemplateCorreoDto update = update(templateCorreo);
//		return PutTemplateCorreoResponseBuilder.getInstace().build(headers, update);
//	}
	
//	public TemplateCorreoDto findById(String id) {
//		Optional<TemplateCorreoDto> findById = templateCorreoRepository.findById(id);
//
//		return findById.orElseThrow(() -> new NotFoundException());
//	}
	
//	public GetTemplateCorreoDtoResponse findById(Map<String, String> headers, String id) {
//		TemplateCorreoDto findById = findById(id);
//
//		return GetTemplateCorreoResponseBuilder.getInstace().build(headers, findById);
//	}
	
//	public GetTemplateCorreoDtoResponse findByUniqueKey(Map<String, String> headers, TiposCorreosDto tiposCorreos) {
//		 String codigoCanal = headers.get("codigoCanal");
//		 CodigosCanales canales = CodigosCanales.valueOf(codigoCanal);
//		 Optional<TemplateCorreoDto> findByUniqueKey = findByUniqueKey(tiposCorreos, canales);
//
//		return GetTemplateCorreoResponseBuilder.getInstace().build(headers, findByUniqueKey.orElseThrow(() -> new NotFoundException()));
//	}
	
	
//	public GetTemplatesCorreosDtoResponse list(Map<String, String> headers) {
//		Pageable pageable;
//		int numeroPagina = 0;
//
//		if (Objects.nonNull(headers.get(NUMERO_PAGINA_HEADER_NAME)) && String.valueOf(headers.get(NUMERO_PAGINA_HEADER_NAME)).matches("[-+]?\\d*\\.?\\d+")) {
//			numeroPagina = Integer.parseInt(String.valueOf(headers.get(NUMERO_PAGINA_HEADER_NAME)));
//		}
//
//		if (Objects.nonNull(headers.get(CANTIDAD_REGISTROS_HEADER_NAME)) && String.valueOf(headers.get(CANTIDAD_REGISTROS_HEADER_NAME)).matches("[-+]?\\d*\\.?\\d+")) {
//            pageable = PageRequest.of(numeroPagina, Integer.parseInt(String.valueOf(headers.get(CANTIDAD_REGISTROS_HEADER_NAME))));
//        } else {
//            pageable = PageRequest.of(numeroPagina, DEFAULT_PAGE_SIZE);
//        }
//        Page<TemplateCorreoDto> list = templateCorreoRepository.findAll(pageable);
//
//		return GetTemplatesCorreosResponseBuilder.getInstace().build(headers, list, numeroPagina);
//	}

//	public TemplateCorreoDto delete(String id) {
//		TemplateCorreoDto findById = findById(id);
//		templateCorreoRepository.delete(findById);
//
//		return findById;
//	}
	
//	public RespuestaServicio delete(Map<String, String> headers, String id) {
//		delete(id);
//		return RespuestaServicioBuilder.getInstace().build(headers);
//	}
	


}
