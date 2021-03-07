package br.com.sus.sus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Equipamento;
import br.com.sus.sus.repository.EquipamentoRepository;

@Service
public class EquipamentoService {

	private EquipamentoRepository repository;

	public List<Equipamento> getEquipamentos() {
		return repository.findAll();
	}

	@Autowired
	public void setRepository(EquipamentoRepository repository) {
		this.repository = repository;
	}

	public Equipamento buscarEquipamento(Long equipe) {
		Optional<Equipamento> equipamento = repository.findById(equipe);
		return equipamento.orElse(null);
	}

	public Equipamento atualizaEquipamento(Equipamento equipe) {
		Optional<Equipamento> equipeNew = repository.findById(equipe.getId());
		return repository.save(equipe);
	}

	public void deletarEquipamento(Long id) {
		repository.deleteById(id);
	}
	
	public Equipamento salvarEquipamento(Equipamento equipe) {
		return repository.save(equipe);
	}
	
	
}
