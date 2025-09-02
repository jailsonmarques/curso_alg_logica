package curso_alg_logica_udemy;

import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, menor;
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		c = sc.nextInt();
		
		if (a < b && a < c) {
			menor = a;
		}else if (b < c) {
			menor = b;
		}else {
			menor = c;
		}
		System.out.printf("MENOR = %d\n", menor);
		
		sc.close();
	}

}
