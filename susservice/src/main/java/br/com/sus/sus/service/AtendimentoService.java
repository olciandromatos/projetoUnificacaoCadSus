package br.com.sus.sus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sus.sus.domain.Atendimento;
import br.com.sus.sus.repository.AtendimentoRepository;

@Service
public class AtendimentoService {
	
	private AtendimentoRepository atendimentoRepository;
	
	public List<Atendimento> findAllAtendimento(){
		return  atendimentoRepository.findAll();
	}
	

	public AtendimentoRepository getAtendimentoRepository() {
		return atendimentoRepository;
	}

	@Autowired
	public void setAtendimentoRepository(AtendimentoRepository atendimentoRepository) {
		this.atendimentoRepository = atendimentoRepository;
	}
	
	

}
