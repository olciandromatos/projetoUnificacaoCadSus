package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Estado;
import br.com.sus.sus.repository.EstadoRepository;

@Service
public class EstadoService {

	private EstadoRepository estadoRepository;
	
	public List<Estado> findAllEstado(){
		return estadoRepository.findAll();
	}
	
	public EstadoRepository getEstadoRepository() {
		return estadoRepository;
	}

	@Autowired
	public void setEstadoRepository(EstadoRepository estadoRepository) {
		this.estadoRepository = estadoRepository;
	}

}
