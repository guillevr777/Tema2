package Tema2;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[]args) {
		//creamos la consola
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		double numero;
		System.out.println("Dime tu nota y te digo como clasificaste");
		numero = reader.nextDouble();
		if (numero<5 && numero>=0) {
			System.out.println("Insuficiente");
		}else if (numero<6 && numero>=5) {
				System.out.println("Suficiente");
			} else if (numero<7 && numero>=6) {
					System.out.println("Bien");
				} else if (numero<9 && numero>=7) {
						System.out.println("Notable");
					} else if (numero<=10 && numero>=9) {
							System.out.println("Sobresaliente");
		}
		//cerramos el escaner
		reader.close();
	}
}

