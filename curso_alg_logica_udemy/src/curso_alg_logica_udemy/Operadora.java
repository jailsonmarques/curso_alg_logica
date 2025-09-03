package curso_alg_logica_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double valorPagar;
		
		System.out.println("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		
		valorPagar = 50.0;
		
		if (minutos > 100) {
			valorPagar = valorPagar + (minutos -100) * 2;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
		

		sc.close();

	}

}
