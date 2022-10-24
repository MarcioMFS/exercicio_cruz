package exercicio.DTO;

import java.util.List;

import exercicio.model.Aplicativo;

public class LojaAppsCelular {
	private String nomeLoja;
	List<Aplicativo> aplicativo;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
