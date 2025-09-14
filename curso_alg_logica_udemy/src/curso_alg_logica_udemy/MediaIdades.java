package curso_alg_logica_udemy;

import java.util.Scanner;

public class MediaIdades {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as idades: ");
		int idade = sc.nextInt();
		
		//condição para idade negativa
		if (idade < 0) {
			System.out.println("Impossivel Calcular");
		}else {
			double somaIdades = idade; //inicializa soma com a primeira idade
			int contador = 1; //inicializa contador com 1
			
			//lê as idades enquanto não for negativa
			while (idade >=0) {
				idade = sc.nextInt(); 
				if (idade >= 0) {
					somaIdades += idade; //acumula a soma das idades
					contador ++; 		//incrementa o contador
				}
			}
			double media = somaIdades / contador;  //calcula a média
			System.out.printf("MEDIA = %.2f%n", media);
		}
		
		sc.close();
	}
}
