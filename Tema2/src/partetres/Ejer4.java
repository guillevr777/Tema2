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
		int unidades;
		int decenas;
		
		//cadena guardar resultado
		String resul = "";
		
		//le preguntamos por un numero de 8 cifras
		System.out.println("Dime un numero entre 0 y 99.");
		numero = reader.nextInt();
		
		//Usamos if else para saber si el numero cumple los requisitos
		switch (numero) {
		case 10 -> resul = "diez");
		case 11 -> resul = "once");
		case 12 -> resul = "doce");
		case 13 -> resul = "trece");
		case 14 -> resul = "catorce");
		case 15 -> resul = "quince");
			default -> {
				
				switch (unidades) {
				case 1 -> resul = "uno";
				case 2 -> resul = "dos";
				case 3 -> resul = "tres";
				case 4 -> resul = "cuatro";
				case 5 -> resul = "cinco";
				case 6 -> resul = "seis";
				case 7 -> resul = "siete";
				case 8 -> resul = "ocho";
				case 9 -> resul = "nueve";
				}
				
				switch (decenas) {
				case 1: resul = "dieci" + resul;
				case 1: resul = "veinti" + resul;
				case 1: resul = "treinta y " + resul;
				case 1: resul = "cuarenta y " + resul;
				case 1: resul = "cincuenta y " + resul;
				case 1: resul = "sesenta y " + resul;
				case 1: resul = "setenta y " + resul;
				case 1: resul = "ochenta y " + resul;
				case 1: resul = "noventa y " + resul;
				}
			}

		}
	//cerramos el escaner
	reader.close();
	}
}
