package br.com.sus.sus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sus.sus.domain.Atendimento;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Long>{

}
