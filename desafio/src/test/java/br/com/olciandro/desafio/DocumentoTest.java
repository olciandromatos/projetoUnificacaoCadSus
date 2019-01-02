package br.com.olciandro.desafio;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.olciandro.desafio.domain.Documento;
import br.com.olciandro.desafio.domain.Estado;
import br.com.olciandro.desafio.domain.Pessoa;
import br.com.olciandro.desafio.services.DocumentoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DocumentoTest {
	
	@Autowired
	private DocumentoService documentoService;
	
	@Test
	public void salvar() {
		
		List<Documento> documentos = new ArrayList<>();
		
		Documento documento = new Documento();
		documento.setTipo("Identidade");
		documento.setNumero("2.525.488");
		
		documentos.add(documento);
		
		Estado estado = new Estado();
		estado.setId(9L);
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Olciando Matos");
		pessoa.setEstado(estado);
		pessoa.setDocumentos(documentos);
		
		documentoService.salvar(documento);
		
	}

}
