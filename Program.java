package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		Funcionario func = new Funcionario();
		System.out.print("Digite as informações ");
		System.out.println();
		System.out.println("Nome Completo: ");
		func.nome = sc.nextLine();
		System.out.println("Salário: ");
		func.salario = sc.nextDouble();
		System.out.println("Taxa: ");
		func.taxa = sc.nextDouble();
		System.out.println();
		System.out.print("Você gostaria de aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		func.aumentoSalario(porcentagem);
		
		
		System.out.println();
		System.out.println("atualização das informações " + func);
		
		sc.close();
	}

}
