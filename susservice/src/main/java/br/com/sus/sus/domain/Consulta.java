package br.com.sus.sus.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Consulta {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="seq_consulta")
	private Long id;
	private LocalDate horaConsulta = LocalDate.now();
	private String relatoMedico;
	private String relatoPaciente;

	@ManyToOne
	@JoinColumn(name="seq_paciente")
	private Paciente paciente;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(LocalDate horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public String getRelatoMedico() {
		return relatoMedico;
	}
	
	public void setRelatoMedico(String relatoMedico) {
		this.relatoMedico = relatoMedico;
	}
	
	public String getRelatoPaciente() {
		return relatoPaciente;
	}
	
	public void setRelatoPaciente(String relatoPaciente) {
		this.relatoPaciente = relatoPaciente;
	}

}
