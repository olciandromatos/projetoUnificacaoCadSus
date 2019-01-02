package br.com.olciandro.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.olciandro.desafio.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
