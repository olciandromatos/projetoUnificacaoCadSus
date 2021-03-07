package br.com.sus.sus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Equipamento;
import br.com.sus.sus.domain.Medico;
import br.com.sus.sus.repository.MedicoRepository;

@Service
public class MedicoService {
	
	private MedicoRepository repository;
	
	public List<Medico> findAllMedico(){
		return repository.findAll();
	}
	
	public Medico save(Medico medico) {
		return repository.save(medico);
	}

	public MedicoRepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(MedicoRepository repository) {
		this.repository = repository;
	}
	
	public Medico buscarMedico(Long med) {
		Optional<Medico> medico = repository.findById(med);
		return medico.orElse(null);
	}

	public Medico atualizaMedico(Medico med) {
		Optional<Medico> medicoNew = repository.findById(med.getId());
		return repository.save(medicoNew);
	}

	public void deletarEquipamento(Long id) {
		repository.deleteById(id);
	}
	
	

}
