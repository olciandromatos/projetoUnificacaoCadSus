package br.com.sus.sus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Pais;
import br.com.sus.sus.service.PaisService;

@RestController
@RequestMapping("/api")
public class PaisResource {
	
	@Autowired
	private PaisService service;
	
	@GetMapping("/pais")
	public List<Pais> getPais(){
		return service.findAllPais();
	}

}
