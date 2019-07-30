package br.com.sus.sus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Columns;

@Entity
public class Triagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seq_triagem", unique=true, nullable=false)
	private Long id;
	private String peso;
	private String altura;
	private String pressao;
	private String descricao;
	
	@OneToOne
	private StatusSaude status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getPressao() {
		return pressao;
	}

	public void setPressao(String pressao) {
		this.pressao = pressao;
	}
	
	public StatusSaude getStatus() {
		return status;
	}
	
	public void setStatus(StatusSaude status) {
		this.status = status;
	}
	
	public String getDescrcao() {
		return descricao;
	}
	
	public void setDescrcao(String descrcao) {
		this.descricao = descrcao;
	}

	@Override
	public String toString() {
		return "Triagem [id=" + id + ", peso=" + peso + ", altura=" + altura + ", pressao=" + pressao + ", descrcao="
				+ descricao + ", status=" + status + "]";
	}

	

}
