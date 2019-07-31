package br.com.sus.sus.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Atendimento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="seq_atendimento", unique=true, nullable=false)
	private Long id;
	
	private String nomeAtendente;
	private LocalDateTime horaAtendimento = LocalDateTime.now();
	private String prontuario;
	
	@ManyToOne
	@JoinColumn(name="seq_paciente")
	private Paciente paciente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAtendente() {
		return nomeAtendente;
	}

	public void setNomeAtendente(String nomeAtendente) {
		this.nomeAtendente = nomeAtendente;
	}

	public LocalDateTime getHoraAtendimento() {
		return horaAtendimento;
	}

	public void setHoraAtendimento(LocalDateTime horaAtendimento) {
		this.horaAtendimento = horaAtendimento;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
