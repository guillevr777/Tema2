package Tema2;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		double numero;
		//le preguntamos por un numero decimal comprendido entre 0 y 2
		System.out.println("Di un numero aleatorio");
		numero = reader.nextDouble();
		//hacemos el if else
		if ( numero>0 && numero<1 || numero<-1 && numero>0 ) {
			System.out.println("Es un numero casi entero");
		} else { System.out.println("Su numero no es casi cero");
		}
	}
}
