package partecinco;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		
				// creamos el escaner
				Scanner reader = new Scanner(System.in);
				
				// creamos las variables para almacenar los numeros
				int numeroUno;
				int numeroDos;
				
				//creamos la variable para almacenar la letra que elegiran
				String letra;
				
				// preguntamos por dos numeros
				System.out.println("Dime dos numeros uno despues del otro");
				numeroUno = reader.nextInt();
				numeroDos = reader.nextInt();
			
				//Utilizamos el do while para darle a elegir las opciones y usamos switch case para resolverlo hasta que se cumpla la condicionde while
			do {
				System.out.println("A. Sumar los numeros");
				System.out.println("B. Restar los numeros");
				System.out.println("C. Multiplicar los numeros");
				System.out.println("D. Dividir los numeros");
				System.out.println("E. Salir");
				letra = reader.next().toUpperCase();
				
				// resolvemos el problema
				switch (letra) {
				case "A" -> System.out.println(numeroUno + numeroDos);
				case "B" -> System.out.println(numeroUno - numeroDos);
				case "C" -> System.out.println(numeroUno * numeroDos);
				case "D" -> {
					if (numeroDos != 0) {
						System.out.println(numeroUno / numeroDos);
					} else {
						System.out.println("No se puede dividir entre 0");
					}
				}
				case "E" -> System.out.println("El programa ha sido cerrado...");
				default -> System.out.println("Vuelve a intentarlo");
				}
			} while (!letra.equals("E"));
			
	// cerramos el escaner
	reader.close();	
	}
}
