package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.sus.sus.domain.Endereco;
import br.com.sus.sus.repository.EnderecoRepository;

public class EnderecoService {
	
	private EnderecoRepository repository;
	
	public List<Endereco> getEnderecos(){
		return repository.findAll();
	}
	
	@Autowired
	public void setRepository(EnderecoRepository repository) {
		this.repository = repository;
	}

}
