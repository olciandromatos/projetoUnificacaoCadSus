package br.com.sus.sus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Especialidade;
import br.com.sus.sus.service.EspecialidadeService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class EspecialidadeResource {
	
	@Autowired
	private EspecialidadeService service;
	
	@GetMapping("/especialidade")
	public List<Especialidade> getEspecialidade(){
		return service.getEspecialidade();
	}

}
