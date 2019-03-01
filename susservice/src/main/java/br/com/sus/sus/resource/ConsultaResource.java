package br.com.sus.sus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

}
