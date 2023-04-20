package app;

import java.util.Locale;
import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int v, maioridade, posicaomaior;
		System.out.print("Quantas pessoas voce vai digitar? ");
		v = sc.nextInt();
		String[] nomes = new String[v];
		int[] idades = new int[v];
		
		for(int i=0; i<nomes.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
	    	System.out.print("Nome: ");
	        nomes[i] = sc.next();
	        System.out.print("Idade: ");
	        idades[i] = sc.nextInt();
		}
		
	    maioridade = idades[0];
	    posicaomaior = 0;

	    for (int i=1; i<v; i++) {
	        if (idades[i] > maioridade) {
	            maioridade = idades[i];
	            posicaomaior = i;
	        }
	    }

	    System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaomaior]);
		sc.close();

	}

}
