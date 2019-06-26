package pe.com.banbif.correo.eletronico.service.controller;

import java.util.List;
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
import pe.com.banbif.correo.eletronico.service.business.EmailTagService;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailTag;
import pe.com.banbif.correo.eletronico.service.data.entity.GetEmailTagResponse;
import pe.com.banbif.correo.eletronico.service.data.entity.PostEmailTagResponse;
import pe.com.banbif.correo.eletronico.service.data.entity.PutEmailTagResponse;

@RestController()
@RequestMapping("/tag")
public class EmailTagController {

	private EmailTagService emailTagService;

	public EmailTagController(EmailTagService emailTagService) {
		this.emailTagService = emailTagService;
	}

	@PostMapping
	public ResponseEntity<PostEmailTagResponse> post(@RequestHeader Map<String, String> headers, @RequestBody EmailTag emailTag) {
		return ResponseEntity.ok(emailTagService.save(headers, emailTag));
	}
	
	@PostMapping("/list")
	public ResponseEntity<GetEmailTagResponse> post(@RequestHeader Map<String, String> headers, @RequestBody List<EmailTag> emailTag) {
		return ResponseEntity.ok(emailTagService.save(headers, emailTag));
	}
	
	@PutMapping
	public ResponseEntity<PutEmailTagResponse> put(@RequestHeader Map<String, String> headers, @RequestBody EmailTag emailTag) {
		return ResponseEntity.ok(emailTagService.update(headers, emailTag));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<GetEmailTagResponse> get(@RequestHeader Map<String, String> headers, @PathVariable("id") String id) {
		return ResponseEntity.ok(emailTagService.findById(headers, id));
	}
	
	@GetMapping("/list/{tiposCorreos}")
	public ResponseEntity<GetEmailTagResponse> get(@RequestHeader Map<String, String> headers, @PathVariable("tiposCorreos") TiposCorreos tiposCorreos) {
		return ResponseEntity.ok(emailTagService.findByTiposCorreos(headers, tiposCorreos));
	}

	@GetMapping("/list")
	public ResponseEntity<GetEmailTagResponse> list(@RequestHeader Map<String, String> headers) {
		return ResponseEntity.ok(emailTagService.list(headers));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<RespuestaServicio> delete(@RequestHeader Map<String, String> headers, @PathVariable("id") String id) {
		return ResponseEntity.ok(emailTagService.delete(headers, id));
	}
	

}
