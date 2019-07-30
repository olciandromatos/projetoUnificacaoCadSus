package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Triagem;
import br.com.sus.sus.repository.TriagemRepository;

@Service
public class TriagemService {

	private TriagemRepository repository;
	
	public List<Triagem> findAllTriagem(){
		return repository.findAll();
	}
	
	public Triagem save(Triagem triagem) {
		return repository.save(triagem);
	}

	public TriagemRepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(TriagemRepository repository) {
		this.repository = repository;
	}
	
	
}
