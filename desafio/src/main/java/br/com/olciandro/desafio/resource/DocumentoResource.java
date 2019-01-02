package br.com.olciandro.desafio.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.olciandro.desafio.domain.Documento;
import br.com.olciandro.desafio.services.DocumentoService;

@RestController
@RequestMapping(value = "/api")
public class DocumentoResource {
	
	@Autowired
	private DocumentoService documentoService;
	
	@RequestMapping(value = "/documento", method = RequestMethod.POST)
	public Documento salvar(Documento documento) {
		return documentoService.salvar(documento);
	}
	
	@RequestMapping(value="/documento", method = RequestMethod.GET)
	public List<Documento> listar(){
		return documentoService.listarTodos();
	}

}
