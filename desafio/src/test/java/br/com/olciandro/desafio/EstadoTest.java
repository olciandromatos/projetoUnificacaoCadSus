package br.com.olciandro.desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.olciandro.desafio.domain.Estado;
import br.com.olciandro.desafio.services.EstadoService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EstadoTest {
	
	@Autowired
	private EstadoService estadoService;
	
	@Test
	public void cadastrar() {
		
		List<Estado> estados = new ArrayList<>();
		
		Estado estado1 = new Estado(null, "Acre");
		Estado estado2 = new Estado(null, "Alagoas");
		Estado estado3 = new Estado(null, "Amapá");
		Estado estado4 = new Estado(null, "Amazonas");
		Estado estado5 = new Estado(null, "Bahia");
		Estado estado6 = new Estado(null, "Ceará");
		Estado estado7 = new Estado(null, "Distrito Federal");
		Estado estado8 = new Estado(null, "Espírito Santo");
		Estado estado9 = new Estado(null, "Goiás");
		Estado estado10 = new Estado(null, "Maranhão");
		Estado estado11 = new Estado(null, "Mato Grosso");
		Estado estado12 = new Estado(null, "Mato Grosso do Sul");
		Estado estado13 = new Estado(null, "Minas Gerais");
		Estado estado14 = new Estado(null, "Pará");
		Estado estado15 = new Estado(null, "Paraíba");
		Estado estado16 = new Estado(null, "Paraná");
		Estado estado17 = new Estado(null, "Pernambuco");
		Estado estado18 = new Estado(null, "Piauí");
		Estado estado19 = new Estado(null, "Rio de Janeiro");
		Estado estado20 = new Estado(null, "Rio Grande do Norte");
		Estado estado21 = new Estado(null, "Rio Grande do Sul");
		Estado estado22 = new Estado(null, "Rondônia");
		Estado estado23 = new Estado(null, "Roraima");
		Estado estado24 = new Estado(null, "Santa Catarina");
		Estado estado25 = new Estado(null, "São Paulo");
		Estado estado26 = new Estado(null, "Sergipe");
		Estado estado27 = new Estado(null, "Tocantins");
		
       
        estados.addAll(Arrays.asList(estado1, estado2, estado3, estado4, estado5, estado6, estado7, estado8, estado9, estado10,
        		estado11, estado12, estado13, estado14, estado15, estado16, estado17, estado18, estado19, estado20, estado21,
        		estado22, estado23, estado24, estado25, estado26, estado27));

        estadoService.salvarTodos(estados);
	}

}
