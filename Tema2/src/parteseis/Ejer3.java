package parteseis;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable
		int numero;
		int suma = 0;
		double media;
		
		//hacemos el for
		for (int contador =  1; contador <= 10 ; contador++ ) {
			
			//preguntamos por el valor de la variable
			System.out.println("Dime un numero");
			numero = reader.nextInt();
			
			suma += numero;
		}
		
		media = suma/10;
		
		System.out.println("La media es de " + media);
		
	//cerramos el escaner
	reader.close();
	}
}
