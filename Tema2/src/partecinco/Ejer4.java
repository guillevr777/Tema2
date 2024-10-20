package partecinco;

import java.util.Scanner;

public class Ejer4 {
	
	public static void main(String[] args) {
		//ceamos el escaner
		Scanner reader = new Scanner(System.in);
			
		//creamos la variable 
		int numero;
		int contador = 1;
				
		//tell me the number pls
		System.out.println("Dime el numero");
		numero = reader.nextInt();
				
		//hacemos do while
		do { System.out.println(numero + " x " + contador + " = " + (numero*contador));
			contador++;
		} while (contador <= 10);
					
	//cerramos el escaner
	reader.close();
	}

}
