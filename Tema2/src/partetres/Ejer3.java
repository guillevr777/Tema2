package partetres;

import java.util.Scanner;

public class Ejer3 {
	 /*    
	  La letra del dni 29519783 tendria que ser L
	  Si damos un dni con menos o mas de 8 cifras no dejara hacer la operacion
     */
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables
		int numero;
		int dni = 0;
		
		//le preguntamos por un numero de 8 cifras
		System.out.println("Dime un numero de ocho cifras.");
		numero = reader.nextInt();
		
		//Usamos if else para saber si el numero cumple los requisitos
		if (numero < 100000000 && numero > 9999999) {	
			dni = numero % 23;
			} else { System.out.println("Tu numero no cumple los requisitos para asignarle una letra.");
		}
			if (dni != -1) {
			switch (dni) {
			case 0 -> System.out.println("La letra de tu DNI sera : T");
			case 1 -> System.out.println("La letra de tu DNI sera : R");
			case 2 -> System.out.println("La letra de tu DNI sera : W");
			case 3 -> System.out.println("La letra de tu DNI sera : A");
			case 4 -> System.out.println("La letra de tu DNI sera : G");
			case 5 -> System.out.println("La letra de tu DNI sera : M");
			case 6 -> System.out.println("La letra de tu DNI sera : Y");
			case 7 -> System.out.println("La letra de tu DNI sera : F");
			case 8 -> System.out.println("La letra de tu DNI sera : P");
			case 9 -> System.out.println("La letra de tu DNI sera : D");
			case 10 -> System.out.println("La letra de tu DNI sera : X");
			case 11 -> System.out.println("La letra de tu DNI sera : B");
			case 12 -> System.out.println("La letra de tu DNI sera : M");
			case 13 -> System.out.println("La letra de tu DNI sera : J");
			case 14 -> System.out.println("La letra de tu DNI sera : Z");
			case 15 -> System.out.println("La letra de tu DNI sera : S");
			case 16 -> System.out.println("La letra de tu DNI sera : Q");
			case 17 -> System.out.println("La letra de tu DNI sera : V");
			case 18 -> System.out.println("La letra de tu DNI sera : H");
			case 19 -> System.out.println("La letra de tu DNI sera : L");
			case 20 -> System.out.println("La letra de tu DNI sera : C");
			case 21 -> System.out.println("La letra de tu DNI sera : K");
			case 22 -> System.out.println("La letra de tu DNI sera : E");
			}
		}
	//cerramos el escaner
	reader.close();
	}
}
