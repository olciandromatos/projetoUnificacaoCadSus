package br.com.sus.sus.resource;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/paciente/{cpf}")
	public Optional<Paciente> buscarPorCPF(@PathParam("cpf") String cpf) {
//		String cpf = paciente.getCpf();
		return pacienteService.porCPF(cpf); 
	}

}
