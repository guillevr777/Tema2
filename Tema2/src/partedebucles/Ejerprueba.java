package partedebucles;

import java.util.Scanner;

public class Ejerprueba {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		int numero = reader.nextInt();
		
		//fila
		for (int i = 1 ; i <= numero ; i++) {
			//ascendiente
			for ( int b = numero ; b > i ; b--) {
				System.out.print(" ");
			}
			//descendiente
			for ( int c = 1 ; c <= i ; c++) {
			System.out.print("*");
			}
		System.out.println();
		}
		//cerró
		reader.close();
	}

}
