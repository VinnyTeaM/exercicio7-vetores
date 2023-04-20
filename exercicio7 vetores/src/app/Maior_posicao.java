package app;

import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posmaior;
		double maior;
		
		
		
		System.out.print("Quantos numero voce vai digitar? ");
		n = sc.nextInt();
		double[] vetor = new double[n];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			
		}
		
		maior = vetor[0];
		posmaior = 0;
		for(int i=1; i<vetor.length; i++) {
			 if (vetor[i] > maior) {
		            maior = vetor[i];
		            posmaior = i;
			 }
		}
		
		System.out.println("\nMAIOR VALOR = " + maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posmaior);

			sc.close();
		}
	}