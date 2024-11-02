package pruebas;

import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int numero;
		double resultado = 0;
		boolean si = true;
			
			while (si) {
				
				System.out.println("Dime un numero");
				numero = reader.nextInt();
			
			if(numero > 0) {
				
			for (int i = 1 ; i <= numero ; i++) {
				
				resultado += (double)1/i;
				
				} 
				System.out.println("El resultado es " + resultado);
				si = false;
			} else {
				System.out.println("El numero no es correcto");
				}
			}
		 //cerramos el escaner
		 reader.close();
		}
	}