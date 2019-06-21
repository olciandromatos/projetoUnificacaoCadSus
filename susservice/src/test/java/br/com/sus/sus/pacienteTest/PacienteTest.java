package br.com.sus.sus.pacienteTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.sus.sus.domain.Paciente;
import br.com.sus.sus.service.PacienteService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PacienteTest {
	
	@Autowired
	private PacienteService service;
	
	@Test
	public void listar() {
		for (Paciente paciente : service.listarTodos()) {
			System.out.println("Nome da pessoa: "+paciente.getPrimeiroNome());
		}
		;
	}

}
