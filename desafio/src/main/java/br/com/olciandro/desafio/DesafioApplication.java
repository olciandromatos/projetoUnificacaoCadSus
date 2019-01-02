package br.com.olciandro.desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.olciandro.desafio.domain.Documento;
import br.com.olciandro.desafio.domain.Estado;
import br.com.olciandro.desafio.domain.Pessoa;
import br.com.olciandro.desafio.services.DocumentoService;
import br.com.olciandro.desafio.services.EstadoService;
import br.com.olciandro.desafio.services.PessoaService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner{
	
	@Autowired
	private EstadoService estadoService;
	
	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	DocumentoService documentoService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Estado> estados = new ArrayList<>();
		
		Estado acre = new Estado(null, "Acre");
		Estado alagoas = new Estado(null, "Alagoas");
		Estado amapa = new Estado(null, "Amapá");
		Estado amazonas = new Estado(null, "Amazonas");
		Estado bahia = new Estado(null, "Bahia");
		Estado ceara = new Estado(null, "Ceará");
		Estado df = new Estado(null, "Distrito Federal");
		Estado espirito_santo = new Estado(null, "Espírito Santo");
		Estado goias = new Estado(null, "Goiás");
		Estado maranhao = new Estado(null, "Maranhão");
		Estado mato_grosso = new Estado(null, "Mato Grosso");
		Estado moto_grosso_sul = new Estado(null, "Mato Grosso do Sul");
		Estado minas_gerais = new Estado(null, "Minas Gerais");
		Estado para = new Estado(null, "Pará");
		Estado paraiba = new Estado(null, "Paraíba");
		Estado parana = new Estado(null, "Paraná");
		Estado pernambuco = new Estado(null, "Pernambuco");
		Estado piaui = new Estado(null, "Piauí");
		Estado rio_janeiro = new Estado(null, "Rio de Janeiro");
		Estado rio_grande_norte = new Estado(null, "Rio Grande do Norte");
		Estado rio_grande_sul = new Estado(null, "Rio Grande do Sul");
		Estado rondonia = new Estado(null, "Rondônia");
		Estado roraima = new Estado(null, "Roraima");
		Estado santa_catarina = new Estado(null, "Santa Catarina");
		Estado sao_paulo = new Estado(null, "São Paulo");
		Estado sergipe = new Estado(null, "Sergipe");
		Estado tocantins = new Estado(null, "Tocantins");
		
		estados.addAll(Arrays.asList(acre, alagoas, amapa, amazonas, bahia, ceara, df, espirito_santo, goias, maranhao,
				mato_grosso, moto_grosso_sul, minas_gerais, para, paraiba, parana, pernambuco, piaui, rio_janeiro, rio_grande_norte, rio_grande_sul,
				rondonia, roraima, santa_catarina, sao_paulo, sergipe, tocantins));
		
		estadoService.salvarTodos(estados);
		
		Pessoa pessoa = new Pessoa();
		
		Documento documento = new Documento();
		documento.setTipo("CPF");
		documento.setNumero("222.222.222-22");
		documento.setPessoa(pessoa);
		
		Documento documento2 = new Documento();
		documento2.setTipo("RG");
		documento2.setNumero("222.585.55");
		documento2.setPessoa(pessoa);
		
		List<Documento> documentos = new ArrayList<>();
		documentos.addAll(Arrays.asList(documento, documento2));
		
		pessoa.setDocumentos(documentos);
		pessoa.setNome("Olciandro Matos Magalhães");
		pessoa.setEstado(goias);
		
		pessoaService.salvar(pessoa);
	
	}

}

