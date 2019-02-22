package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Medico;
import br.com.sus.sus.repository.MedicoRepository;

@Service
public class MedicoService {
	
	private MedicoRepository repository;
	
	public List<Medico> findAllMedico(){
		return repository.findAll();
	}

	public MedicoRepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(MedicoRepository repository) {
		this.repository = repository;
	}
	
	

}
