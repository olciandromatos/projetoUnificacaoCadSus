package br.com.sus.sus.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Pais;
import br.com.sus.sus.repository.PaisRepository;

@Service
public class PaisService {

	private final PaisRepository paisRepository;
	
	public PaisService(PaisRepository paisRepository) {
		this.paisRepository = paisRepository;
	}
	
	public List<Pais> findAllPais(){
		return paisRepository.findAll();
	}

}
