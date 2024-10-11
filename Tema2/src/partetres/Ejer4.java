package partetres;

import java.util.Scanner;

public class Ejer4 {
	 /*    
	  Si ponemos 55 tendria que decirnos cincuenta y cinco
	  Si ponemos 37 no deberia decirnos noventa y uno
   */
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables
		int numero;
		
		//le preguntamos por un numero de 8 cifras
		System.out.println("Dime un numero entre 0 y 99.");
		numero = reader.nextInt();
		
		//Usamos if else para saber si el numero cumple los requisitos
		if () {	
			
			} else if (numero < 0 && numero > 99) { 
				System.out.println("Tu numero no cumple los requisitos para asignarle una letra.");
		}
	//cerramos el escaner
	reader.close();
	}
}
