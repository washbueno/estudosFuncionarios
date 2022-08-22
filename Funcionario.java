package entities;

public class Funcionario {

	public String nome;
	public double salario;
	public double taxa;
	
	
	public double salarioLiquido() {
		return salario - taxa;
	}
	
	public void aumentoSalario(double porcentagem) {
		salario += salario * porcentagem / 100.00;
	}
	
	
	
	public String toString() {
		return "O funcionário de nome " + nome + " recebe o salário " + salarioLiquido();
	}
	
}
