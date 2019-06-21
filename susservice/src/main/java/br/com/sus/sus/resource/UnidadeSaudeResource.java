package br.com.sus.sus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.UnidadeSaude;
import br.com.sus.sus.service.UnidadeSaudeService;

@RestController
@RequestMapping("/api")
public class UnidadeSaudeResource {
	
	@Autowired
	private UnidadeSaudeService service;
	
	@GetMapping("/unidadeSaude")
	public List<UnidadeSaude> getUnidadeSaude(){
		return service.getUnidadesSaude();
	}

}
