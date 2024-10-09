package partedos;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		int numero;
		//preguntamos por un numero
		System.out.println("Dime cuanto sacaste");
		numero = reader.nextInt();
		//resolvemos el problema
		switch (numero) {
		case -1 -> System.out.println("Ereh un makina");
		case 0,1,2,3,4 -> System.out.println("Insuficiente");
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7,8 -> System.out.println("Notable");
		case 9,10 -> System.out.println("Sobresaliente");
		}
	//cerramos el escaner
	reader.close();
	}
}
