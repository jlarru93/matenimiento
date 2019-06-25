package pe.com.banbif.correo.eletronico.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.banbif.correo.eletronico.service.business.EmailContentService;

@RestController()
@RequestMapping("/content")
public class EmailContentController {

	private EmailContentService emailContentService;

	public EmailContentController(EmailContentService emailContentService) {
		this.emailContentService = emailContentService;
	}

}
