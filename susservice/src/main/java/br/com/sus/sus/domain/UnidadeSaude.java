package br.com.sus.sus.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnidadeSaude {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String nomeUnidade;
//	private List<Medico> medicoPlantao;
	private Boolean statusPlantao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUnidade() {
		return nomeUnidade;
	}

	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}

//	public List<Medico> getMedicoPlantao() {
//		return medicoPlantao;
//	}
//
//	public void setMedicoPlantao(List<Medico> medicoPlantao) {
//		this.medicoPlantao = medicoPlantao;
//	}

	public Boolean getStatusPlantao() {
		return statusPlantao;
	}

	public void setStatusPlantao(Boolean statusPlantao) {
		this.statusPlantao = statusPlantao;
	}

}
