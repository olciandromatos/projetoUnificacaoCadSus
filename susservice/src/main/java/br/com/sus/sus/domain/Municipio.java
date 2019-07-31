package br.com.sus.sus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Municipio {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="seq_municipio", unique=true, nullable=false)
	private Long id;
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="seq_estado")
	private Estado estado;

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

}
