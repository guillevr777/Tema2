package partedebucles;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable que guardara el numero
		int numero;
		
		//variable que guarda el nuevo numero que se haya introducido en el while
		int contador = 0;
		
		//pedimos el numero que se quiere comprobar
		System.out.println("Dime un numero");
		numero = reader.nextInt();
		
		//creamos el while para que se repita todas las veces que se pueda dividir por 10 y se suma 1 al contador 
		while (numero > 0) {
		
			numero /= 10;
			
			contador++;
			
		}
		
		System.out.println("Tiene " + contador + " digitos");
		
		//cerramos el escaner
		reader.close();
	}
}
