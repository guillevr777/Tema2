package partecinco;

import java.util.Scanner;

public class Ejer3 {

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
			if (contador == numero) {
				
				System.out.print(contador + ".");
			} else {
				System.out.print(contador + "+");
			}
		} while (numero > contador);
			
	//cerramos el escaner
	reader.close();
	}
}
