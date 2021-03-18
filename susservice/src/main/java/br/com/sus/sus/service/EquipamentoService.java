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
	
	public List<Equipamento> getEquipamentos(){
		return repository.findByOrderByIdAsc();
	}

	@Autowired
	public void setRepository(EquipamentoRepository repository) {
		this.repository = repository;
	}
	
	public Equipamento save(Equipamento equi) {
		return repository.save(equi);
	}
	
	public List<Equipamento> listarTodos(){
		return repository.findAll();
	}
	
	public void deletarEquipamento(Long id) {
		repository.deleteById(id);
	}
	
	public Optional<Equipamento> getById(Long id) {
		return repository.findById(id);
	}

	public Equipamento alterarEquipamento(Long id, Equipamento equipamentoNovo) {
		
		Optional<Equipamento> p = repository.findById(id);
		Equipamento equi = p.get();
		equi.setId(id);
		equi.setDataRetirada(equipamentoNovo.getDataRetirada());
		equi.setDestino(equipamentoNovo.getDestino());
		equi.setTipoEquipamento(equipamentoNovo.getTipoEquipamento());
		equi.setTempoUso(equipamentoNovo.getTempoUso());
		equi.setQuantidade(equipamentoNovo.getQuantidade());
		return repository.save(equi);
	}
	
	public Equipamento buscarEquipamento(Long equipe) {
		Optional<Equipamento> equipamento = repository.findById(equipe);
		return equipamento.orElse(null);
	}

	public Equipamento atualizaEquipamento(Equipamento equipe) {
		Optional<Equipamento> equipeNew = repository.findById(equipe.getId());
		return repository.save(equipeNew);
	}
	
	public Equipamento salvarEquipamento(Equipamento equipe) {
		return repository.save(equipe);
	}
	
	
}
