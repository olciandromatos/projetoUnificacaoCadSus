package br.com.sus.sus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sus.sus.domain.Municipio;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long>{

}
