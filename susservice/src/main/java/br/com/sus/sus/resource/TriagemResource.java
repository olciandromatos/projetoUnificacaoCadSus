package br.com.sus.sus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Triagem;
import br.com.sus.sus.service.TriagemService;

@RestController
@RequestMapping("/api")
public class TriagemResource {

	@Autowired
	private TriagemService service;
	
	@GetMapping("/triagem")
	public List<Triagem> getTriagem(){
		return service.findAllTriagem();
	}
}
