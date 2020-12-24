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

import br.com.sus.sus.domain.Equipamento;
import br.com.sus.sus.domain.Paciente;
import br.com.sus.sus.service.EquipamentoService;

@RestController
@RequestMapping("/api")
public class EquipamentoResource {
	
	@Autowired
	private EquipamentoService service;
	
	@GetMapping("/equipamento")
	public List<Equipamento> getEquipamento(){
		return service.getEquipamentos();
	}
	
	@PostMapping("/equipamento")
	@CrossOrigin
	public ResponseEntity<Equipamento> Cadastrar(@RequestBody Equipamento equipamento) {
		service.save(equipamento);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
}
