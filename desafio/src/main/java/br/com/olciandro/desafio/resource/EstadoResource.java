package br.com.olciandro.desafio.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.olciandro.desafio.domain.Estado;
import br.com.olciandro.desafio.services.EstadoService;

@RestController
@RequestMapping(value="/api")
public class EstadoResource {
	
	@Autowired
	private EstadoService estadoService;
	
	@CrossOrigin
	@RequestMapping(value="/estado", method = RequestMethod.GET)
	public List<Estado> listar(){
		return estadoService.listarTodos();
	}
	
	@RequestMapping(value="/estado/{id}", method = RequestMethod.GET)
	public Optional<Estado> BuscarPorId(@PathVariable Long id){
		return estadoService.buscarPorId(id);
	}

}
