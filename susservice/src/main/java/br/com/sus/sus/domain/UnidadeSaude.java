package br.com.sus.sus.domain;

import java.util.List;

public class UnidadeSaude {

	private Long id;
	private String nomeUnidade;
	private List<Medico> medicoPlantao;
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

	public List<Medico> getMedicoPlantao() {
		return medicoPlantao;
	}

	public void setMedicoPlantao(List<Medico> medicoPlantao) {
		this.medicoPlantao = medicoPlantao;
	}

	public Boolean getStatusPlantao() {
		return statusPlantao;
	}

	public void setStatusPlantao(Boolean statusPlantao) {
		this.statusPlantao = statusPlantao;
	}

}
