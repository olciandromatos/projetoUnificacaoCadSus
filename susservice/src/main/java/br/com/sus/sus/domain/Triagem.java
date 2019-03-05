package br.com.sus.sus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Triagem {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "seq_triagem")
	private Long id;
	private Double peso;
	private Double altura;
	private Double pressao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPressao() {
		return pressao;
	}

	public void setPressao(Double pressao) {
		this.pressao = pressao;
	}

}
