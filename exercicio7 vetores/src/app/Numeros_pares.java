package app;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdpar;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			
		}
		
	    System.out.println("\nNUMEROS PARES: ");
		qtdpar = 0;
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
	            qtdpar++;	
	      
			}
		}
							
		System.out.println("\n\nQUANTIDADE DE PARES = " + qtdpar);
	
				
		
	sc.close();	

	}

}
