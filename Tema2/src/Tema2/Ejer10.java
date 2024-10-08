package Tema2;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[]args) {
		//creamos la consola
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		int numeroUno;
		int numeroDos;
		int numeroTres;
		System.out.println("Dime el primer numero");
		numeroUno = reader.nextInt();
		System.out.println("Dime el segundo numero");
		numeroDos = reader.nextInt();
		System.out.println("Dime el tercer numero");
		numeroTres = reader.nextInt();
		//creamos el if else para resolver el problema
		if (numeroUno+numeroDos==numeroTres) {
			System.out.println("Numero tres es igual a numero uno mas numero dos");
		}else if (numeroDos+numeroTres==numeroUno) {
				System.out.println("Numero uno es igual a numero tres mas numero dos");
			} else if (numeroUno+numeroTres==numeroDos) {
					System.out.println("Numero dos equivale a numero uno mas numero tres");
				} else {
						System.out.println("Ningun par de numeros sumados equivale al restante");
		}
		//cerramos el escaner
		reader.close();
	}
}

