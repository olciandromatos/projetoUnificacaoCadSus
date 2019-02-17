package br.com.sus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.domain.Paciente;
import br.com.sus.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	public PacienteService(PacienteRepository pacienteRepository) {
		this.pacienteRepository = pacienteRepository;
	}
	
	public Paciente cadastrar(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	public Optional<Paciente> buscarPorId(Long id) {
		Optional<Paciente> objeto = pacienteRepository.findById(id);
		return objeto;
	}
	
	public List<Paciente> listarTodos(){
		return pacienteRepository.findAll();
	}

}
