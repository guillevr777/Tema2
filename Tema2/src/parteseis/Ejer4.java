package parteseis;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		
		//creamos la variable donde se almacenara el numero de veces del for y el numero y suma del problema
		double suma = 0;
		
		//hacemos el for para que cuente hasta que llegue al 20 y vaya sumando 1 al contador cada vez
		for (int contador =  0 ; contador <= 20 ; contador++) {
						
		if ( contador%2 != 0) {
			suma += contador;
			}
		}
	
		//decimos la solucion
		System.out.println("La suma es de " + suma);
	}
}
