package exercicio.model;

import java.util.List;

public class LojaAppsCelular {
	private String nomeLoja;
	List<Aplicativo> aplicativo;
	private String dataCriacaoLoja;
	private int id;
	
	public String getNomeLoja() {
		return nomeLoja;
	}
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	public List<Aplicativo> getAplicativo() {
		return aplicativo;
	}
	public void setAplicativo(List<Aplicativo> aplicativo) {
		this.aplicativo = aplicativo;
	}
	public String getDataCriacaoLoja() {
		return dataCriacaoLoja;
	}
	public void setDataCriacaoLoja(String dataCriacaoLoja) {
		this.dataCriacaoLoja = dataCriacaoLoja;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
