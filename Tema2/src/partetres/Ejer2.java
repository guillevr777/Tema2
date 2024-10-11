package partetres;

import java.util.Scanner;

public class Ejer2 {
	 /*
    El valor absoluto de 2 tiene que ser 2
    El valor absoluto de -15 tiene que ser 15
    El valor absoluto de 0 tiene que ser 0
     */
	public static void main(String[] args) {
		// creamos el escaner
		Scanner reader = new Scanner(System.in);
		// creamos la variable para almacenar el numero
		int numero;
		int valorAbsoluto;
		//preguntamos por un numero
		System.out.println("Di un numero y te digo el valor absoluto");
		numero = reader.nextInt();
		//Hacemos la operacion con el ternario
		valorAbsoluto = numero < 0 ? -numero : numero;
		//le decimos el valor absoluto de su numero por consola
		System.out.println("El valor absoluto de " + numero + " es " + valorAbsoluto );
		// cerramos el escaner
		reader.close();
	}
}
