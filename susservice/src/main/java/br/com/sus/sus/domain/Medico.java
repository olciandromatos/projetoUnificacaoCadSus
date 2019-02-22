package br.com.sus.sus.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medico {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String nome;
	private String crm;
	private String relatoPaciente;
	private String relatoMedico;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getRelatoPaciente() {
		return relatoPaciente;
	}

	public void setRelatoPaciente(String relatoPaciente) {
		this.relatoPaciente = relatoPaciente;
	}

	public String getRelatoMedico() {
		return relatoMedico;
	}

	public void setRelatoMedico(String relatoMedico) {
		this.relatoMedico = relatoMedico;
	}

}
