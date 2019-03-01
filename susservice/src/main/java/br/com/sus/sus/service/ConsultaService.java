package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Consulta;
import br.com.sus.sus.repository.ConsultaRepository;

@Service
public class ConsultaService {
	
	private ConsultaRepository repository;
	
	public List<Consulta> allConsultas(){
		return repository.findAll();
	}

	public ConsultaRepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(ConsultaRepository repository) {
		this.repository = repository;
	}
	
	

}
