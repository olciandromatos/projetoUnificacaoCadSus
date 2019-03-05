package br.com.sus.sus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Estado;
import br.com.sus.sus.service.EstadoService;

@RestController
@RequestMapping("/api")
public class EstadoResource {

	@Autowired
	private EstadoService service;
	
	@GetMapping("/estado")
	public List<Estado> GetEstado(){
		return service.findAllEstado();
	}
}
