package br.com.sus.sus.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.sus.sus.domain.Equipamento;
import br.com.sus.sus.domain.Medico;
import br.com.sus.sus.service.MedicoService;

@CrossOrigin
@RestController
@RequestMapping("/api/medico")
public class MedicoResource {
	
	@Autowired
	private MedicoService service;
	
	@GetMapping("")
	public List<Medico> allMedicos(){
		return service.findAllMedico();
	}
	
//	@PostMapping("/medico")
//	public ResponseEntity<Medico> cadastrar(@RequestBody Medico medico){
//		service.save(medico);
//		return new ResponseEntity<>(HttpStatus.CREATED);
//	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> saveMedico (@RequestBody Medico medico){
		Medico newMedico = service.save(medico);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(medico.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Medico> buscaPorId(@PathVariable Long id) {
		Medico medico = service.buscarMedico(id);
		return ResponseEntity.ok().body(medico);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Medico> alterarMedico(@RequestBody Medico medico) {
		Medico newMedico = service.atualizaMedico(medico);
		return ResponseEntity.ok().body(newMedico);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Medico> deletaMedico(@PathVariable Long id) {
		service.deletarEquipamento(id);
		return ResponseEntity.noContent().build();
	}

}
