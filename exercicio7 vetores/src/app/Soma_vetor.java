package app;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int n;
    double soma, media;

    System.out.print("Quantos numeros voce vai digitar? ");
    n = sc.nextInt();
    
    // Cria um vetor de double com N posições
    double[] vetor = new double[n];

    //variavel i comeca com 0 vetores sc.nextDouble armazena o valor no vetor i e repete o laço ate N posições.
    for (int i=0; i<vetor.length; i++) {
    	System.out.print("Digite um numero: ");
        vetor[i] = sc.nextDouble();
    }

	soma = 0;
    for (int i=0; i<vetor.length; i++) {
        soma = soma + vetor[i];
    }

    media = soma / n;

	System.out.print("VALORES = ");

    for (int i=0; i<vetor.length; i++) {
    	System.out.printf("%.1f  ", vetor[i]);
    }

    System.out.printf("\nSOMA = %.2f\n", soma);
    System.out.printf("MEDIA = %.2f\n", media);

	sc.close();

	}
}
