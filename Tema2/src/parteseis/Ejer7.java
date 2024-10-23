package parteseis;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		//creamos la consola
				Scanner reader = new Scanner(System.in);
				
				//hacemos el for para que cuente hasta que llegue al 20 y vaya sumando 1 al contador cada vez
				for ( int contador = 1 , numero ; 1 >= contador ; contador++) {
					
					//preguntamos a la profe por un numero que se convertira en factorial
					System.out.println("Dime un numero y te digo si es divisible por 1 o por si mismo");
					numero = reader.nextInt();
					
					if (numero%1 == 0 && numero%numero == 0) {
					
					System.out.println("El numero " + numero + " es primo");
					
			}
		}
	//cerramos el escaner
	reader.close();
	}
}