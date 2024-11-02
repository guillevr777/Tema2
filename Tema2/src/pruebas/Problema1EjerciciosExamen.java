package pruebas;

import java.util.Scanner;

public class Problema1EjerciciosExamen {
	
	public static void main(String[]args) {
	
    Scanner reader = new Scanner(System.in);
    
    System.out.println("Dime el tamaño del lado del cuadrado:");
    int lado = reader.nextInt();
    
    if (lado < 1) {
        System.out.println("El tamaño del lado debe ser al menos 1.");
    }

    for (int i = 1; i <= lado; i++) {
        for (int j = 1; j <= lado; j++) {
            if (i == 1 || i == lado || j == 1 || j == lado) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    	}
	}
}
