package br.com.olciandro.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.olciandro.desafio.domain.Estado;
import br.com.olciandro.desafio.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	private EstadoRepository estadoRepository;
	
	public Estado salvar(Estado estado) {
		return estadoRepository.save(estado);
	}
	
	public List<Estado> salvarTodos(List<Estado> estados) {
		return estadoRepository.saveAll(estados);
	}
	
	public List<Estado> listarTodos(){
		return estadoRepository.findAll();
	}
	
	public Optional<Estado> buscarPorId(Long id) {
		Optional<Estado> objeto = estadoRepository.findById(id);
		return objeto;
	}
	
	public EstadoRepository getEstadoRepository() {
		return estadoRepository;
	}
	
	@Autowired
	public void setEstadoRepository(EstadoRepository estadoRepository) {
		this.estadoRepository = estadoRepository;
	}

}
