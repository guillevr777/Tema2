package partetres;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[]args) {
		//creamos la consola
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		String numero;
		int numeroDos;
		int numeroUno;
		//preguntamos por el valor de los numeros
		System.out.println("Dime la primera cifra de tu numero , si solo tene una cifra escribe 0 y despues tu numero ( Ejemplo: 7 = 07 )");
		numeroUno = reader.nextInt();
		System.out.println("Dime la segunda cifra de tu numero");
		numeroDos = reader.nextInt();
		// preguntamos por una opcion
		System.out.println("A. Tu numero solo tiene una cifra.");
		System.out.println("B. Tu numero tiene dos cifras o mas");
		numero = reader.next();
		// resolvemos el problema
		switch (numero) {
		case "A" -> System.out.println("Tu numero es capicua");
		case "B" -> {
			if (numeroUno==numeroDos) {
			System.out.println("El numero es capicua");
			} else { System.out.println("Tu numero no es capicua");
				}
			}
		}
		//cerramos el escaner
		reader.close();
	}
}
