package partedos;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		// creamos el escaner
		Scanner reader = new Scanner(System.in);
		// creamos las variables para almacenar los numeros
		String letra;
		//le preguntamos por la letra
		System.out.println("Dime una letra entre (E , D , C1 , C5 , B1 , B2)y te digo a que permiso de conduccion pertenece");
		letra = reader.next();
		// resolvemos el problema
		switch (letra) {
		case "E" -> System.out.println("Remolques");
		case "D" -> System.out.println("Autobuses");
		case "C1 ,C5" -> System.out.println("Camiones");
		case "A" -> System.out.println("Motocicletas");
		case "B1 ,B2" -> System.out.println("Automoviles");
		case "x" -> {
			if (letra != "E,D,C1,C5,A,B1,B2") {
				System.out.println("Introduzca otra letra");
				}
			}
		}
		// cerramos el escaner
		reader.close();
	}
}
