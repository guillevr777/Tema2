package pruebas;

import java.util.Scanner;

public class Problema2EjercicioExamen {
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
		
		int resto = 0;
		int numeroPar = 0;
		int numeroImpar = 0;
		
		System.out.println("Dime un numero : ");
		int numero = reader.nextInt();
		
		if (numero <= 0) {
			
			System.out.println("Prueba otro numero");
			
		} else {
		
		do {
			
			resto = numero%10;
			numero /= 10;
			
			if (resto%2 == 0) {
				
				numeroPar++;
				
			} else {
				
				numeroImpar++;
				
			}	
		} while (numero > 0);
		
		System.out.println("total numeros pares : " + numeroPar);
		System.out.println("total numeros pares : " + numeroImpar);
		}
	}
}
