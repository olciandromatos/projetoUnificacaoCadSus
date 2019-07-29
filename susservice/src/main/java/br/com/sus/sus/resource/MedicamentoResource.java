package br.com.sus.sus.resource;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Medicamento;
import br.com.sus.sus.service.MedicamentoService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MedicamentoResource {
	
	@Autowired
	private MedicamentoService service;
	
	@GetMapping("/medicamento")
	public List<Medicamento> medicamentos(){
		return service.allMedicamentos();
	}
	
	@PostMapping("/medicamento")	
	public ResponseEntity<Medicamento> cadastrar(@Valid @RequestBody Medicamento medicamento) {
		if(medicamento.getId() == null) {
			System.out.println("Id do objeto nulo '"+ medicamento.getId()+"'");
			medicamento.setDataMedicacao(LocalDate.now());
			service.salvar(medicamento);
			System.out.println("Medicamento criado com sucesso");
		}else {
			System.out.println("O Objeto nulo");
		}
		
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	

}
