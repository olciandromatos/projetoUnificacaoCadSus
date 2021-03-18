package br.com.sus.sus.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sus.sus.domain.Equipamento;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long>{
	
	List<Equipamento> findByOrderByIdAsc();

	Equipamento save(Optional<Equipamento> equipeNew);

}
