package curso_alg_logica_udemy;

import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Hora inicial: ");
		int horaInicial = sc.nextInt();
		
		System.out.println("Hora final: ");
		int horaFinal = sc.nextInt();
		
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = (24 - horaInicial) + horaFinal;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		
		sc.close();
	}

}
