package br.com.sus.sus.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.sus.sus.domain.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
	
	public List<Paciente> findByCpf(String cpf);
	
	@Query(value = "SELECT p FROM Paciente p WHERE p.emAtendimento = true")
	public List<Paciente> buscarPacienteEmAtendimento();

}
