package exercicio.DTO;


import exercicio.model.Conta;
import exercicio.model.Funcionario;

public class EmpresaDTO {
	
	private String nome;
	private Funcionario funcionario;
	private Conta conta;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
}
