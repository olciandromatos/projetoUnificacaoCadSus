package br.com.sus.sus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.StatusSaude;
import br.com.sus.sus.service.StatusSaudeService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StatusSaudeResource {

	@Autowired
	private StatusSaudeService service;
	
	@GetMapping("/statusSaude")
	public List<StatusSaude> getStatusSaude(){
		return service.findAllStatusSaude();
	}
}
