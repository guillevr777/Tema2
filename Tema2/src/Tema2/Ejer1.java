package Tema2;
import java.util.Scanner;
public class Ejer1 {
	
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		int numero;
		//preguntamos por un numero
		System.out.println("Di un numero y te digo si es par o impar");
		numero = reader.nextInt();
		//creamos el if else
		if (numero%2==0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		//cerramos el escaner
		reader.close();
	}
}
