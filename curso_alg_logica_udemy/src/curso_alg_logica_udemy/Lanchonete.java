package curso_alg_logica_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		int codigo = sc.nextInt();
		
		System.out.println("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		
		double valorPagar;
		
		if (codigo == 1) {
			valorPagar = 5.00 * quantidade;
		} else if (codigo == 2) {
			valorPagar = 3.5 * quantidade;
		}else if(codigo == 3) {
			valorPagar = 4.8 * quantidade;
		}else if(codigo == 4) {
			valorPagar = 8.9 * quantidade;
		}else {
			valorPagar = 7.32 * quantidade;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);

		sc.close();
	}

}
