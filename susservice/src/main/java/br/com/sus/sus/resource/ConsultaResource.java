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

import br.com.sus.sus.domain.Consulta;
import br.com.sus.sus.service.ConsultaService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ConsultaResource {
	
	@Autowired
	private ConsultaService service;
	
	@GetMapping("/consulta")
	public List<Consulta> consultas(){
		return service.allConsultas();
	}
	
	@PostMapping("/consulta")
	public ResponseEntity<Consulta> salvar(@RequestBody Consulta consulta) {
		service.cadastrar(consulta);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
