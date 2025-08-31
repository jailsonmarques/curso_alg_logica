package curso_alg_logica_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, r1, r2;
		
		System.out.println("Coeficiente a: ");
		a = sc.nextDouble();
		System.out.println("Coeficiente b: ");
		b = sc.nextDouble();
		System.out.println("Coeficiente c: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		if (delta < 0) {
			System.out.println("Esta equação não possui raízes reais");
		} else {
			r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.4f%n", r1);
			System.out.printf("R2 = %.4f%n", r2);
		}

		sc.close();
	}

}
