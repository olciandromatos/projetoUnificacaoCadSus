package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Equipamento;
import br.com.sus.sus.repository.EquipamentoRepository;

@Service
public class EquipamentoService {
	
	private EquipamentoRepository repository;
	
	public List<Equipamento> getEquipamentos(){
		return repository.findAll();
	}
	
	@Autowired
	public void setRepository(EquipamentoRepository repository) {
		this.repository = repository;
	}

}
