package br.com.olciandro.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.olciandro.desafio.domain.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
