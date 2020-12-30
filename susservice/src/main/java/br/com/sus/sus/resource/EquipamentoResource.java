package br.com.sus.sus.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Equipamento;
import br.com.sus.sus.service.EquipamentoService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EquipamentoResource {
	
	@Autowired
	private EquipamentoService equipamentoService;
	
	@GetMapping("/equipamento")
	public List<Equipamento> getEquipamento(){
		return equipamentoService.getEquipamentos();
	}
	
	@GetMapping("/equipamento/{id}")
	public ResponseEntity<Optional<Equipamento>> getById(@PathVariable Long id){
		Optional<Equipamento> equipamentoId = equipamentoService.getById(id);
		return ResponseEntity.ok().body(equipamentoId);
	}
	
	@PostMapping("/equipamento")
	public ResponseEntity<Equipamento> Cadastrar(@RequestBody Equipamento equipamento) {
		equipamentoService.save(equipamento);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/equipamento/{id}")
	public ResponseEntity<Equipamento> alterar(@PathVariable(value = "id") Long id, @RequestBody Equipamento equipamento){
		Equipamento equipamentoServicealt = equipamentoService.alterarEquipamento(id, equipamento);
		return ResponseEntity.ok().body(equipamentoServicealt);
	}
	
	@DeleteMapping("/equipamento/{id}")
	public ResponseEntity<Equipamento> deletaEquipamento(@PathVariable Long id){
		equipamentoService.deletarEquipamento(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
