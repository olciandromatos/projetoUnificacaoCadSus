package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Endereco;
import br.com.sus.sus.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	private EnderecoRepository repository;
	
	public List<Endereco> getEnderecos(){
		return repository.findAll();
	}
	
	public Endereco save(Endereco endereco) {
		return repository.save(endereco);
	}
	
	@Autowired
	public void setRepository(EnderecoRepository repository) {
		this.repository = repository;
	}

}
