package br.com.sus.sus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Medico;
import br.com.sus.sus.service.MedicoService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MedicoResource {
	
	@Autowired
	private MedicoService service;
	
	@GetMapping("/medico")
	public List<Medico> allMedicos(){
		return service.findAllMedico();
	}
	
	@PostMapping("/medico")
	public ResponseEntity<Medico> cadastrar(@RequestBody Medico medico){
		service.save(medico);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
