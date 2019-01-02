package br.com.olciandro.desafio.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Estado {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String nome;
	
	public Estado() {
	}
	
	public Estado(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	@OneToOne(mappedBy="estado")
	private Pessoa pessoa;

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
