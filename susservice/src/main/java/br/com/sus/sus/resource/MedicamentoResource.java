package br.com.sus.sus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sus.sus.domain.Medicamento;
import br.com.sus.sus.service.MedicamentoService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MedicamentoResource {
	
	@Autowired
	private MedicamentoService service;
	
	@GetMapping("/medicamento")
	public List<Medicamento> medicamentos(){
		return service.allMedicamentos();
	}

}
