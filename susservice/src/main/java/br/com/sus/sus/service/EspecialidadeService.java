package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Especialidade;
import br.com.sus.sus.repository.EspecialidadeRepository;

@Service
public class EspecialidadeService {
	
	private EspecialidadeRepository repository;
	
	public List<Especialidade> getEspecialidade(){
		return repository.findAll();
	}
	
	@Autowired
	public void setRepository(EspecialidadeRepository repository) {
		this.repository = repository;
	}

}
