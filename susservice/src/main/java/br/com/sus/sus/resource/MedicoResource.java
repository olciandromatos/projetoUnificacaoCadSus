package br.com.sus.sus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Medico;
import br.com.sus.sus.service.MedicoService;

@RestController
@RequestMapping("/api")
public class MedicoResource {
	
	@Autowired
	private MedicoService service;
	
	@GetMapping("/medico")
	public List<Medico> allMedicos(){
		return service.findAllMedico();
	}

}
