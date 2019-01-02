package br.com.olciandro.desafio.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.olciandro.desafio.domain.Pessoa;
import br.com.olciandro.desafio.services.PessoaService;

@RestController
@RequestMapping(value="/api")
public class PessoaResource {
	
	@Autowired
	private PessoaService pessoaService;
	
	@CrossOrigin
	@RequestMapping(value="/pessoa", method = RequestMethod.GET)
	public List<Pessoa> listar(){
		return pessoaService.listarTodos();
	}
	
	@RequestMapping(value="/pessoa/{id}", method = RequestMethod.GET)
	public Optional<Pessoa> BuscarPorId(@PathVariable Long id){
		return pessoaService.buscarPorId(id);
	}
	
	@CrossOrigin
	@RequestMapping(value="/pessoa", method=RequestMethod.POST)
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaService.salvar(pessoa);
	}
	
	@RequestMapping(value="/pessoas", method=RequestMethod.POST)
	public List<Pessoa> salvarTodos(List<Pessoa> pessoas){
		return pessoaService.salvarTodos(pessoas);
	}

}
