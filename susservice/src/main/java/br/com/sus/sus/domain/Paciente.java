package br.com.sus.sus.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Paciente implements Serializable{

	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="seq_paciente", unique=true, nullable=false)
	private Long id;
	
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String dataNascimento;
	
	@OneToOne
	private Sexo sexo;

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

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento2) {
		this.dataNascimento = dataNascimento2;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public Sexo getSexo() {
		return sexo;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", telefone=" + telefone
				+ ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + "]";
	}
	
	

}
