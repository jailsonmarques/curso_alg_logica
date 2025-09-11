package curso_alg_logica_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salario da pessoa: ");
		double salario = sc.nextDouble();
		
		double novoSalario, aumento;
		int porcentagem;
		
		if (salario <= 1000.00) {
			porcentagem = 20;
		} else if (salario <= 3000.00) {
			porcentagem = 15;
		} else if (salario <= 8000.00) {
			porcentagem = 10;
		}else {
			porcentagem = 5;
		}
		
		aumento = salario * porcentagem / 100.0;
		novoSalario = salario + aumento;
		

		System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
		System.out.printf("Aumento = R$ %.2f%n", aumento);
		System.out.printf("Porcentagem = %d %%%n", porcentagem); // %% para imprimir o simbolo %
		sc .close();
	}

}
