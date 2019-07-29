package br.com.sus.sus.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Medicamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="id_sequence", initialValue=1, allocationSize=12)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq-gen")
	@Column(name="seq_medicamento", unique=true, nullable=false)
	private Long id;
	
	private String nome;
	private Long quantidade;
	private String descricao;
	private LocalDate dataMedicacao;

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

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataMedicacao() {
		return dataMedicacao;
	}

	public void setDataMedicacao(LocalDate dataMedicacao) {
		this.dataMedicacao = dataMedicacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
