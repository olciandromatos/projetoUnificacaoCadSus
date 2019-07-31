package br.com.sus.sus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Paciente;
import br.com.sus.sus.repository.PacienteRepository;

@Service
public class PacienteService {
	
	private PacienteRepository pacienteRepository;
	
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
	
	public Optional<Paciente> porCPF(String cpf){
		Optional<Paciente> objetoPorCPF = pacienteRepository.findByCPF(cpf);
		return objetoPorCPF;
	}
	
	public Paciente save(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	public PacienteRepository getPacienteRepository() {
		return pacienteRepository;
	}
	
	@Autowired
	public void setPacienteRepository(PacienteRepository pacienteRepository) {
		this.pacienteRepository = pacienteRepository;
	}
	
}
