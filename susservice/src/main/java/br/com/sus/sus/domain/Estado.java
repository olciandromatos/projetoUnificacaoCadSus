package br.com.sus.sus.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estado {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="seq_estado", unique=true, nullable=false)
	private Long id;
	private String nome;
	private String sigla;
	
	@OneToMany
	private List<Municipio> municipios;
	
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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
//	public void setMunicipio(List<Municipio> municipios) {
//		this.municipios = municipios;
//	}
//	
//	public List<Municipio> getMunicipio() {
//		return municipios;
//	}

}
