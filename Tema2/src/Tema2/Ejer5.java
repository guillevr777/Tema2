package Tema2;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las variables a las que asignaremos los numeros que el usuario escriba por consola
		int numeroUno;
		int numeroDos;
		int numeroTres;
		//le preguntamos por los 3 numeros que quiere elegir y hacemos que las variables numeroUno numeroDos y numeroTres las recojan mediante el escaner
		System.out.println("Di el primer numero.");
		numeroUno = reader.nextInt();
		System.out.println("Di el segundo numero.");
		numeroDos = reader.nextInt();
		System.out.println("Di el tercer numero.");
		numeroTres = reader.nextInt();
		//Usamos los if else para mostrar los numeros ordenados de mayor a menor
		if (numeroUno<=numeroDos && numeroDos<=numeroTres) {
			System.out.println(numeroUno + " < " + numeroDos + " < " + numeroTres);
		} else {
			if (numeroUno>=numeroDos && numeroDos>=numeroTres) {
				System.out.println(numeroTres + " < " + numeroDos + " < " + numeroUno);
			} else {
				if (numeroUno>=numeroDos && numeroUno<=numeroTres) {
					System.out.println(numeroDos + " < " + numeroUno + " < " + numeroTres);
				} else {
					if (numeroTres<=numeroUno && numeroDos<=numeroTres) {
						System.out.println(numeroDos + " < " + numeroTres + " < " + numeroUno);
					} else {
						if (numeroUno>=numeroTres && numeroUno<=numeroDos) {
							System.out.println(numeroTres + " < " + numeroUno + " < " + numeroDos);
						} else {
							if (numeroUno<=numeroTres && numeroDos>=numeroTres) {
								System.out.println(numeroUno + " < " + numeroTres + " < " + numeroDos);
							}
						}
					}
				}
			}
		}
		//cerramos la consola
		reader.close();
	}
}