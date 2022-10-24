package exercicio.model;

public class Computador {
	private String marca;
	private Integer gabinete;
	private PlacaMae placaMae;
	private PCAcessorios pcAcessorios;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getGabinete() {
		return gabinete;
	}
	public void setGabinete(Integer gabinete) {
		this.gabinete = gabinete;
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
