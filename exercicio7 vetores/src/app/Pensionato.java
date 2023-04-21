package app;

import java.util.Locale;
import java.util.Scanner;

import entites.Rent;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
			
		for(int i = 1; i<n; i++) {
			System.out.printf("\nRent # %d:",  i);
			System.out.print("\nName: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			//instanciando objeto e atribuindo a refencia ao roomNumber que usuario informou
			vect[roomNumber] = new Rent(name, email);
		}
		System.out.println();		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			
		}
		
		sc.close();
		
	}

}
