package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Sexo;
import br.com.sus.sus.repository.SexoRepository;

@Service
public class SexoService {
	
	private SexoRepository repository;
	
	public List<Sexo> getSexo(){
		return repository.findAll();
	}
	
	@Autowired
	public void setRepository(SexoRepository repository) {
		this.repository = repository;
	}

}
