package br.com.sus.sus.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Municipio;
import br.com.sus.sus.service.MunicipioService;

@RestController
@RequestMapping("/api")
public class MunicipioResource {

	@Autowired
	private MunicipioService service;
	
	@GetMapping("/municipio/{id}")
	public Optional<Municipio> municipioById(@PathVariable Long id){
		Optional<Municipio> objeto = service.findMunicipioById(id);
		return objeto;
	}
	
	@GetMapping("/municipio")
	public List<Municipio> getMunicipio(){
		return service.findAllMunicipio();
	}
}
