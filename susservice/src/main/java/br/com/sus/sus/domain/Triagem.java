package br.com.sus.sus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

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
	
//	@ManyToMany
//	@JoinColumn(foreignKey = @ForeignKey(name = "seq_paciente"))
//	private Paciente seq_paciente;

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
	
	public void setDescrcao(String descricao) {
		this.descricao = descricao;
	}
	
//	public Paciente getSeq_paciente() {
//		return seq_paciente;
//	}
//	
//	public void setSeq_paciente(Paciente seq_paciente) {
//		this.seq_paciente = seq_paciente;
//	}

	@Override
	public String toString() {
		return "Triagem [id=" + id + ", peso=" + peso + ", altura=" + altura + ", pressao=" + pressao + ", descrcao="
				+ descricao + ", status=" + status + "]";
	}

	

}
