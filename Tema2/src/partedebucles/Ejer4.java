package partedebucles;

import java.util.Scanner;

public class Ejer4 {
	
	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable que guardaran los numeros
		int numeroA;
		int numeroB;
		
		//creo una variable para almacenar el numero mayor
		int numeroMayor;
		
		//
		boolean continuar = true;
				
		//pedimos el numero que se quiere comprobar
		System.out.println("Dime un numero");
		numeroA = reader.nextInt();
		
		//pedimos el otro numero que se quiere sacar el MCM
		System.out.println("Dime otro numero");
		numeroB = reader.nextInt();
		
		if (numeroA > numeroB) {
		    numeroMayor = numeroA;
		} else {
		    numeroMayor = numeroB;
		}
		
		for (int i = numeroMayor; continuar ; i++) {
            if (i % numeroA == 0 && i % numeroB == 0) {
            	
                // Mostramos el resultado
                System.out.println("El Minimo Comun Multiplo de " + numeroA + " y " + numeroB + " es " + i);
                continuar = false;
            }
        }
		
		//cerramos el escaner
		reader.close();
	}
}
