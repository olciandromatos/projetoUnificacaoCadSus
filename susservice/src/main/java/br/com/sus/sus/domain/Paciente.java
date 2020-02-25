package br.com.sus.sus.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private String acompanhante;
	private boolean emAtendimento;
	private LocalDateTime log  = LocalDateTime.now();
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "seq_endereco", referencedColumnName = "seq_endereco")
	private Endereco endereco;
	
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
	
	public String getAcompanhante() {
		return acompanhante;
	}
	
	public void setAcompanhante(String acompanhante) {
		this.acompanhante = acompanhante;
	}
	
	public boolean isEmAtendimento() {
		return emAtendimento;
	}

	public void setEmAtendimento(boolean emAtendimento) {
		this.emAtendimento = emAtendimento;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public LocalDateTime getLog() {
		return log;
	}
	
	public void setLog(LocalDateTime log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", telefone=" + telefone
				+ ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + "]";
	}
	
	

}
