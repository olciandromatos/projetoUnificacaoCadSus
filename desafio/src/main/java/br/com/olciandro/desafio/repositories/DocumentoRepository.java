package br.com.olciandro.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.olciandro.desafio.domain.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long>{

}
