package pruebas;

import java.util.Scanner;

public class Problema3EjercicioExamen {
	
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Dime el lado");
		int numero = reader.nextInt();
		
		for (int i = 0 ; i < numero ; i++) {
			for (int a = 0 ; a < i ; a++) {
				System.out.print(" ");
			}
			for (int b = 0 ; b < numero ; b++) {
				if (b == 0 || b == numero - i - 1 || i == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                	}
				}
			System.out.println();
		}
	}
}
