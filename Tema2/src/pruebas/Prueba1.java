package pruebas;

import java.util.Scanner;

public class Prueba1 {
	public static void main(String[]args) {
	
	//creamos las consola
	Scanner reader = new Scanner(System.in);
	//creamos las variables
	int numero;
	int numeroMultiplo;
	int resultado;
	//preguntamos al usuario por un numero
	System.out.println("Dime un numero");
	numero = reader.nextInt();
	//hacemos los calculos
	numeroMultiplo = 7%numero;
	resultado = numeroMultiplo + numero;
	System.out.println(resultado);
	
	
	}
}
