package br.com.sus.sus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Sexo;
import br.com.sus.sus.service.SexoService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SexoResource {
	
	@Autowired
	private SexoService service;
	
	@GetMapping("/sexo")
	public List<Sexo> getSexo(){
		return service.getSexo();
	}

}
