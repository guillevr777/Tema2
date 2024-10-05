package Tema2;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		int numeroUno;
		int numeroDos;
		//le preguntamos por los numeros
		System.out.println("Di el primer numero.");
		numeroUno = reader.nextInt();
		System.out.println("Di el segundo numero.");
		numeroDos = reader.nextInt();
		//hacemos la operacion
		if (numeroUno<numeroDos) {
			System.out.println(numeroUno + " es menor que " + numeroDos);
		} else { System.out.println(numeroDos + " es menor que " + numeroUno);
		}
	}
}
