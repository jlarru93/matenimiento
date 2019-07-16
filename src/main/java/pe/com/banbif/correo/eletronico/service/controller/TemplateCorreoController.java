package pe.com.banbif.correo.eletronico.service.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.model.GetTagsCorreosResponse;
import io.swagger.model.GetTemplateCorreoResponse;
import io.swagger.model.GetTemplatesCorreosResponse;
import io.swagger.model.PostTemplateCorreoResponse;
import io.swagger.model.PutTemplateCorreoResponse;
import io.swagger.model.RespuestaServicio;
import io.swagger.model.TemplateCorreo;
import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.business.TagCorreoService;
import pe.com.banbif.correo.eletronico.service.business.TemplateCorreoService;

@RestController()
public class TemplateCorreoController {

	private TemplateCorreoService templateCorreoService;
	private TagCorreoService tagCorreoService;

	public TemplateCorreoController(TemplateCorreoService templateCorreoService, TagCorreoService tagCorreoService) {
		this.templateCorreoService = templateCorreoService;
		this.tagCorreoService = tagCorreoService;
	}
	
	@PostMapping("/templatesCorreos")
	public ResponseEntity<PostTemplateCorreoResponse> post(@RequestHeader Map<String, String> headers, @RequestBody TemplateCorreo TemplateCorreo) {
		return ResponseEntity.ok(templateCorreoService.save(headers, TemplateCorreo));
	}
	
	public ResponseEntity<PutTemplateCorreoResponse> put(@RequestHeader Map<String, String> headers, @RequestBody TemplateCorreo TemplateCorreo) {
		return ResponseEntity.ok(templateCorreoService.update(headers, TemplateCorreo));
	}
	
	@GetMapping("/templatesCorreo/{id}")
	public ResponseEntity<GetTemplateCorreoResponse> get(@RequestHeader Map<String, String> headers, @PathVariable("id") String id) {
		return ResponseEntity.ok(templateCorreoService.findById(headers, id));
	}
	
	@GetMapping("/templatesCorreos")
	public ResponseEntity<GetTemplatesCorreosResponse> get(@RequestHeader Map<String, String> headers) {
		return ResponseEntity.ok(templateCorreoService.list(headers));
	}
	
	@DeleteMapping("/templatesCorreo/{id}")
	public ResponseEntity<RespuestaServicio> delete(@RequestHeader Map<String, String> headers, @PathVariable("id") String id) {
		return ResponseEntity.ok(templateCorreoService.delete(headers, id));
	}
	
	@GetMapping("/templatesCorreo/{tipoCorreo}/tagsCorreo")
	public ResponseEntity<GetTagsCorreosResponse> get(@RequestHeader Map<String, String> headers, @PathVariable("tipoCorreo") TiposCorreos tiposCorreos) {
		return ResponseEntity.ok(tagCorreoService.list(headers, tiposCorreos));
	}
	

}
