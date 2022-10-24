package exercicio.model;

import java.util.List;

public class Celular {

	private LojaAppsCelular loja;
	private List<ContatoCelular> contato;
	private CalendarioCelular calendario;
	private String imei;
	private int capacidade;
	private String processador;

	public LojaAppsCelular getLoja() {
		return loja;
	}

	public void setLoja(LojaAppsCelular loja) {
		this.loja = loja;
	}

	public List<ContatoCelular> getContato() {
		return contato;
	}

	public void setContato(List<ContatoCelular> contato) {
		this.contato = contato;
	}

	public CalendarioCelular getCalendario() {
		return calendario;
	}

	public void setCalendario(CalendarioCelular calendario) {
		this.calendario = calendario;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

}
