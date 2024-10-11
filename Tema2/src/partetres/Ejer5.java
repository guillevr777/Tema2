package partetres;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
	 /*    
	  La letra del dni 29519783 tendria que ser L
	  Si damos un dni con menos o mas de 8 cifras no dejara hacer la operacion
   */
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos el comando random
		Random rand = new Random();
		
		//creamos las variables usando random para asignarles un valor aleatorio entre 0 y 99
		int numeroUno = rand.nextInt(1, 100);
		int numeroDos = rand.nextInt(1, 100);
		int resultado;
		
		//le preguntamos por un numero de 8 cifras
		System.out.println("Dime cuanto da si sumas los siguientes numeros: " + numeroUno + " + " + numeroDos);
		resultado = reader.nextInt();
		
		//Usamos if else para saber si el numero cumple los requisitos
		if (resultado == numeroUno + numeroDos) {
			System.out.println("La suma es correcta");
			} else { System.out.println("La suma es incorrecta");
		}
	//cerramos el escaner
	reader.close();
	}
}
