package Tema2;

import java.util.Scanner;

public class Ejer2 {
		public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las varibles
		int numeroPrimero;
		int numeroSegundo;
		//Le preguntamos por los numeros
		System.out.println("Di un numero entero");
		numeroPrimero = reader.nextInt();
		System.out.println("Di un numero entero");
		numeroSegundo = reader.nextInt();
		//hacemos el if else
		if (numeroPrimero == numeroSegundo) {
			System.out.println("Tus numeros son iguales");
		} else { System.out.println("Tus numeros no son iguales");
		//cerramos el escaner
		reader.close();
		}
	}
}
