package partecuatro;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner (System.in);
		
		//creamos las variables
		int edad;
		int mayorEdad = 0;
		int sumaEdad = 0;
		int menorEdad = 0;
		int mediaAlumnos = 0;
		
		//pedimos que digan las edades
		System.out.println("Dime una edad : ");
		edad = reader.nextInt();
		
		//creamos el while usando if else 
		while (edad > 0) {
			
			System.out.println("Dime una edad : ");
			edad = reader.nextInt();
			
			mediaAlumnos++;
			
			sumaEdad += edad;
			
			if (edad >= 18) {
				mayorEdad++;
			} else { 
				menorEdad++;			
			}
		}
		
		System.out.println("La suma de todas las edades sera de " + sumaEdad + ".La media sera de " + sumaEdad/mediaAlumnos + " con " + mediaAlumnos + " de los cuales " + mayorEdad + " son mayores de edad");
		
	//cerramos el escaner
	reader.close();
	}
}
