package pe.com.banbif.correo.eletronico.service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.banbif.correo.eletronico.service.business.EmailContentService;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailContent;

@RestController()
@RequestMapping("/content")
public class EmailContentController {

	private EmailContentService emailContentService;

	public EmailContentController(EmailContentService emailContentService) {
		this.emailContentService = emailContentService;
	}
	
	
	@PostMapping
	public ResponseEntity<EmailContent> post(@RequestBody EmailContent emailContent) {
		return ResponseEntity.ok(emailContentService.save(emailContent));
	}
	
	@PutMapping
	public ResponseEntity<EmailContent> put(@RequestBody EmailContent emailContent) {
		return ResponseEntity.ok(emailContentService.update(emailContent));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmailContent> get(@PathVariable("id") String id) {
		return ResponseEntity.ok(emailContentService.findById(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<EmailContent> delete(@PathVariable("id") String id) {
		return ResponseEntity.ok(emailContentService.delete(id));
	}

}
