package br.com.sus.sus.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.sus.sus.domain.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
	
	@Query("SELECT p FROM Paciente p WHERE p.cpf = :cpf")
	public Optional<Paciente> findByCPF(@Param("cpf") String cpf);

}
