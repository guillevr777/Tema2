package parteseis;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable
		int numero;
		
		//preguntamos por el valor de la variable
		System.out.println("Dime un numero");
		numero = reader.nextInt();
		
		//hacemos el for
		for (int numeroDos = 0 ; numeroDos<=numero ; numeroDos++ ) {
			System.out.print(numeroDos + " ; ");
		}
	//cerramos el escaner
	reader.close();
	}
}
