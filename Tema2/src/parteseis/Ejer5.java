package parteseis;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		//creamos la consola
		Scanner reader = new Scanner(System.in);
		
		//creo variables
		long factorial = 1;
		int numero;
		
		//preguntamos a la profe por un numero que se convertira en factorial
		System.out.println("Dime un numero y lo hago factorial");
		numero = reader.nextInt();
		
		//hacemos el for para que cuente hasta que llegue al 20 y vaya sumando 1 al contador cada vez
		for (int i = numero ; i >= 2 ; i--) {
			System.out.print(i + " x ");
			factorial *= i;
		}
		
		//decimos la solucion
		System.out.println("1 = " + factorial);
		
	//cerramos el escaner
	reader.close();
	}	
}
