package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.StatusSaude;
import br.com.sus.sus.repository.StatusSaudeRepository;

@Service
public class StatusSaudeService {

	private StatusSaudeRepository repository;
	
	public List<StatusSaude> findAllStatusSaude(){
		return repository.findAll();
	}

	public StatusSaudeRepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(StatusSaudeRepository repository) {
		this.repository = repository;
	}
	
}
