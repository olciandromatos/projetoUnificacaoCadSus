package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Medicamento;
import br.com.sus.sus.repository.MedicamentoRepository;

@Service
public class MedicamentoService {

	private MedicamentoRepository repository;
	
	public List<Medicamento> allMedicamentos(){
		return repository.findAll();
	}

	public MedicamentoRepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(MedicamentoRepository repository) {
		this.repository = repository;
	}

}
