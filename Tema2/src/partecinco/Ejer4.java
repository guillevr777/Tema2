package partecinco;

import java.util.Scanner;

public class Ejer4 {
	
	public static void main(String[] args) {
		//ceamos el escaner
		Scanner reader = new Scanner(System.in);
			
		//creamos la variable que contendra los valores 
		int numero;
		int contador = 1;
				
		//pedimos el numero por consola
		System.out.println("Dime el numero");
		numero = reader.nextInt();
				
		//hacemos do while para mostras la tabla de multiplicar hasta que llegue a 10 bucles
		do { System.out.println(numero + " x " + contador + " = " + (numero*contador));
			contador++;
		} while (contador <= 10);
					
	//cerramos el escaner
	reader.close();
	}

}
