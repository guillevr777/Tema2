package englishexercise;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables par impar
		int numero;
		int par = 0;
		int impar = 0;
		
		//preguntamos al usuario por un numero
		System.out.println("Dime un numero : ");
		numero = reader.nextInt();
		
		//resolvemos el problema 
		while (numero >= 0) {
			
			//preguntamos al usuario por un numero
			System.out.println("Dime un numero : ");
			numero = reader.nextInt();
			
			if (numero % 2 == 0) {
				par++;
				} else {
					impar++;
				}
		}
		
		System.out.println("Has dicho " + par + " numeros pares");
		System.out.println("Has dicho " + impar + " numeros impares");

		//cerramos el escaner
		reader.close();
	}
}
