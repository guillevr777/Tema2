package partedebucles;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable que archivara el numero
		int numero;
		int numerosPrimos;
		double restos;
		
		//pedimos el numero
		System.out.println("Dime un numero");
		numero = reader.nextInt();
		
		//hacemos el for
		for (int i = 2 ; i < numero ; i++) {
			
			restos = (double) numero/i ;
			
			if (restos != 0) {
				numerosPrimos = i;
				System.out.println(numerosPrimos + " " + numero);
			} else {
				System.out.println("Numero incorrecto");
			}
		}
		//cerramos el escaner
		reader.close();
	}
}
