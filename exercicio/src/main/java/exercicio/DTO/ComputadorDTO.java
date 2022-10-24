package exercicio.DTO;

import exercicio.model.PCAcessorios;
import exercicio.model.PlacaMae;

public class ComputadorDTO {
	private String marca;
	private PlacaMae placaMae;
	private PCAcessorios pcAcessorios;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public PlacaMae getPlacaMae() {
		return placaMae;
	}
	public void setPlacaMae(PlacaMae placaMae) {
		this.placaMae = placaMae;
	}
	public PCAcessorios getPcAcessorios() {
		return pcAcessorios;
	}
	public void setPcAcessorios(PCAcessorios pcAcessorios) {
		this.pcAcessorios = pcAcessorios;
	}
}
