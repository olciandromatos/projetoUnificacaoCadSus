package br.com.sus.sus.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Paciente;
import br.com.sus.sus.service.PacienteService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PacienteResource {
	
	@Autowired
	private PacienteService pacienteService;
	
	
	@GetMapping
	public String teste() {
		return "testando...";
	}
	
	@GetMapping("/paciente")
	public List<Paciente> listar(){
		return pacienteService.listarTodos();
	}
	
	@GetMapping("{cpf}")
	public List<Paciente> buscarPorCPF(@PathVariable("cpf") String cpf) {
		return pacienteService.porCPF(cpf); 
	}
	
	@PostMapping("/paciente")
	public ResponseEntity<Paciente> Cadastrar(@RequestBody Paciente paciente) {
		pacienteService.cadastrar(paciente);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/paciente/emAtendimento")
	public List<Paciente> todosEmAtendimento(){
		return pacienteService.pacientesEmAtendimento();
	}

}
