package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.UnidadeSaude;
import br.com.sus.sus.repository.UnidadeSaudeRepository;

@Service
public class UnidadeSaudeService {
	
	private UnidadeSaudeRepository repository;
	
	public List<UnidadeSaude> getUnidadesSaude(){
		return repository.findAll();
	}
	
	@Autowired
	public void setRepository(UnidadeSaudeRepository repository) {
		this.repository = repository;
	}

}
