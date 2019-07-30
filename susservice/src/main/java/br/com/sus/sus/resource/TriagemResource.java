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

import br.com.sus.sus.domain.Triagem;
import br.com.sus.sus.service.TriagemService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TriagemResource {

	@Autowired
	private TriagemService service;
	
	@GetMapping("/triagem")
	public List<Triagem> getTriagem(){
		return service.findAllTriagem();
	}
	
	@PostMapping("/triagem")
	public ResponseEntity<Triagem> cadastrar(@RequestBody Triagem triagem) {
		service.save(triagem);
		System.out.println("Triagem criado com sucesso");
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
