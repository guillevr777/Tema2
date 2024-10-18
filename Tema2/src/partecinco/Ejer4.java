package partecinco;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		//ceamos el escaner
		Scanner reader = new Scanner(System.in);
			
		//creamos la variable 
		int numero;
		int contador = 0;
				
		//tell me the number pls
		System.out.println("Dime el numero");
		numero = reader.nextInt();
				
		//hacemos do while
		do { contador++;
			System.out.print(numero + " x 1 = " + numero*contador);
		} while (numero > numero*contador);
					
	//cerramos el escaner
	reader.close();
	}

}
