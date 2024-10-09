package partedos;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		int dia;
		//preguntamos por un numero
		System.out.println("Dime un numero del 1 al 6 y te digo el dia al que estas");
		dia = reader.nextInt();
		//resolvemos el problema
		switch (dia) {
		case 1 -> System.out.println("Lunes");
		case 2 -> System.out.println("Martes");
		case 3 -> System.out.println("Miercoles");
		case 4 -> System.out.println("Jueves");
		case 5 -> System.out.println("Viernes");
		case 6 -> System.out.println("Sabado");
		case 7 -> System.out.println("Domingo");
		}
	//cerramos el escaner
	reader.close();
	}
}
