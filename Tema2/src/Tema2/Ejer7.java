package Tema2;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[]args) {
		//creamos la consola
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		int numero;
		System.out.println("Di un numero entre 0 y 99999");
		numero = reader.nextInt();
		if (numero<10 && numero>=0) {
			System.out.println("Tiene una cifra");
		}else if (numero>=10 && numero<100) {
				System.out.println("Tiene Dos cifras");
			} else if (numero<1000 && numero>=100) {
					System.out.println("Tiene tres cifras");
				} else if (numero<10000 && numero>=1000) {
						System.out.println("Tiene cuatro cifras");
					} else if (numero<100000 && numero>=10000) {
							System.out.println("Tiene cinco cifras");
		}
		//cerramos el escaner
		reader.close();
	}
}

