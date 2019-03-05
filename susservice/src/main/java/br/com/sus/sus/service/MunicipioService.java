package br.com.sus.sus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Municipio;
import br.com.sus.sus.repository.MunicipioRepository;

@Service
public class MunicipioService {

	private MunicipioRepository municipioRepository;
	
	public Optional<Municipio> findMunicipioById(Long id){
		Optional<Municipio> objeto = municipioRepository.findById(id);
		return objeto;
	}
	
	public List<Municipio> findAllMunicipio(){
		return municipioRepository.findAll();
	}

	public MunicipioRepository getMunicipioRepository() {
		return municipioRepository;
	}

	@Autowired
	public void setMunicipioRepository(MunicipioRepository municipioRepository) {
		this.municipioRepository = municipioRepository;
	}

}
