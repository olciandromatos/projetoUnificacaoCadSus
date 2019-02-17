package br.com.sus.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PacienteResource {
	
	@GetMapping
	public String teste() {
		return "testando...";
	}

}
