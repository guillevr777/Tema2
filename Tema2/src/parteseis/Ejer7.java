package parteseis;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		//creamos la consola
				Scanner reader = new Scanner(System.in);
				
				//Declaramos las variables nummero para almacenar el valor y contador para el numero de veces que entre en el if
				int numero;
				int contador = 0;
				
				//preguntamos por un numero entero positivo
				System.out.println("Dime un numero entero positivo");
				numero = reader.nextInt();
				
				//comprobamos que el numero no sea 1 o menor
				if (numero <= 1) {
		            System.out.println("El número " + numero + " no es primo.");
		        } else {
		        	
				//hacemos el for para averiguar si el numero es divisible solo por 1 y el mismo
				for ( int i = 2 ; i < numero ; i++) {
					
					//si es divisible por i , incrementamos el contador 
					if (numero%i == 0) {
						contador++;	
						}
					}
		        }
				//si no se encuentran divisores el numero es primo
				if (contador == 0) {
				System.out.println("El numero " + numero + " es primo");
				} else { 
				System.out.println("El numero no es primo.");
		}
	//cerramos el escaner
	reader.close();
	}
}