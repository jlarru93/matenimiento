package pe.com.banbif.correo.eletronico.service.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.model.TiposCorreos;
import pe.com.banbif.correo.eletronico.service.business.EmailTagService;
import pe.com.banbif.correo.eletronico.service.data.entity.EmailTag;

@RestController()
@RequestMapping("/tag")
public class EmailTagController {

	private EmailTagService emailTagService;

	public EmailTagController(EmailTagService emailTagService) {
		this.emailTagService = emailTagService;

	}

	@PostMapping
	public ResponseEntity<EmailTag> post(@RequestBody EmailTag emailTag) {
		return ResponseEntity.ok(emailTagService.save(emailTag));
	}
	
	@PutMapping
	public ResponseEntity<EmailTag> put(@RequestBody EmailTag emailTag) {
		return ResponseEntity.ok(emailTagService.update(emailTag));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmailTag> get(@PathVariable("id") String id) {
		return ResponseEntity.ok(emailTagService.findById(id));
	}
	@GetMapping("/list/{tiposCorreos}")
	public ResponseEntity<List<EmailTag>> get(@PathVariable("tiposCorreos") TiposCorreos tiposCorreos) {
		return ResponseEntity.ok(emailTagService.findByTiposCorreos(tiposCorreos));
	}


}
