package br.com.sus.sus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sus.sus.domain.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{

}
