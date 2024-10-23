package parteseis;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		//creamos la consola
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable donde se almacenara el numero de veces del for y el numero y suma del problema
		int nota;
		int contadorDos = 0;
		//hacemos el for para que cuente hasta que llegue al 20 y vaya sumando 1 al contador cada vez
		for ( int contador = 1 ; 5 >= contador ; contador++) {
			
			//preguntamos a la profe por un numero que se convertira en factorial
			System.out.println("Dime la nota");
			nota = reader.nextInt();
			if (nota < 5) {
			contadorDos++;
			System.out.println("La nota numero " + contador + " esta suspensa");
			}
		}
		
		//decimos la solucion
		System.out.println("En total han suspendido " + contadorDos + " alumno/s.");
	}	
}