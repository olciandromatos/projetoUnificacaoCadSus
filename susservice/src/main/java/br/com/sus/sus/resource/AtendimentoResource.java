package br.com.sus.sus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Atendimento;
import br.com.sus.sus.service.AtendimentoService;

@RestController
@RequestMapping("/api")
public class AtendimentoResource {
	
	@Autowired
	private AtendimentoService service;
	
	@GetMapping("atendimento")
	public List<Atendimento> atendimentos(){
		return service.findAllAtendimento();
	}

}
