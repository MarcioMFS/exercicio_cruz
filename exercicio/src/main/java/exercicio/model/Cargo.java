package exercicio.model;

public class Cargo {
	private String nome;
	private double salario;
	private Integer horasMensais;
	private double horasTrabalhadas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Integer getHorasMensais() {
		return horasMensais;
	}

	public void setHorasMensais(Integer horasMensais) {
		this.horasMensais = horasMensais;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

}
