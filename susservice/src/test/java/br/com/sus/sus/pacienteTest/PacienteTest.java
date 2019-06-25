package br.com.sus.sus.pacienteTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Ignore;
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
	@Ignore
	public void listar() {
		for (Paciente paciente : service.listarTodos()) {
			System.out.println("Nome da pessoa: "+paciente.getNome());
		}
		
	}
	
	@Test
	public void salvar() {
		Paciente paciente = new Paciente();
		paciente.setNome("Julio Mendoça da Silva");
		paciente.setTelefone("61 92285575");
		String dataNascimento = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(dataNascimento);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		String formattedString = date.format(formatter);
		paciente.setDataNascimento(dataNascimento);
		paciente.setEmail("mendoca@hotmail.com");
		
		service.cadastrar(paciente);
	}

}
