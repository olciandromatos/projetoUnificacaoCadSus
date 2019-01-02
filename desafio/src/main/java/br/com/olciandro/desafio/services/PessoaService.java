package br.com.olciandro.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.olciandro.desafio.domain.Pessoa;
import br.com.olciandro.desafio.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	private PessoaRepository pessoaRepository;
	
	public PessoaRepository getPessoaRepository() {
		return pessoaRepository;
	}
	
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public List<Pessoa> salvarTodos(List<Pessoa> pessoas) {
		return pessoaRepository.saveAll(pessoas);
	}
	
	public List<Pessoa> listarTodos(){
		return pessoaRepository.findAll();
	}
	
	public Optional<Pessoa> buscarPorId(Long id) {
		Optional<Pessoa> objeto = pessoaRepository.findById(id);
		return objeto;
	}
	
	@Autowired
	public void setPessoaRepository(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

}
