package pe.com.banbif.correo.eletronico.service.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.model.RespuestaServicio;
import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.business.EmailContentService;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailContent;
import pe.com.banbif.correo.eletronico.service.data.entity.GetEmailContentResponse;
import pe.com.banbif.correo.eletronico.service.data.entity.PostEmailContentResponse;
import pe.com.banbif.correo.eletronico.service.data.entity.PutEmailContentResponse;

@RestController()
@RequestMapping("/content")
public class EmailContentController {

	private EmailContentService emailContentService;

	public EmailContentController(EmailContentService emailContentService) {
		this.emailContentService = emailContentService;
	}
	
	@PostMapping
	public ResponseEntity<PostEmailContentResponse> post(@RequestHeader Map<String, String> headers, @RequestBody EmailContent emailContent) {
		return ResponseEntity.ok(emailContentService.save(headers, emailContent));
	}
	
	@PutMapping
	public ResponseEntity<PutEmailContentResponse> put(@RequestHeader Map<String, String> headers, @RequestBody EmailContent emailContent) {
		return ResponseEntity.ok(emailContentService.update(headers, emailContent));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<GetEmailContentResponse> get(@RequestHeader Map<String, String> headers, @PathVariable("id") String id) {
		return ResponseEntity.ok(emailContentService.findById(headers, id));
	}
	
	@GetMapping("/list")
	public ResponseEntity<GetEmailContentResponse> get(@RequestHeader Map<String, String> headers) {
		return ResponseEntity.ok(emailContentService.list(headers));
	}
	
	@GetMapping("/list/{tiposCorreos}")
	public ResponseEntity<GetEmailContentResponse> get(@RequestHeader Map<String, String> headers, @PathVariable("tiposCorreos") TiposCorreos tiposCorreos) {
		return ResponseEntity.ok(emailContentService.findByUniqueKey(headers, tiposCorreos));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<RespuestaServicio> delete(@RequestHeader Map<String, String> headers, @PathVariable("id") String id) {
		return ResponseEntity.ok(emailContentService.delete(headers, id));
	}

}
