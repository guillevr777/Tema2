package pruebas;

import java.util.Scanner;

public class Problema4EjerciciosExamen2Intento {
	    public static void main(String[] args) {
	    	 Scanner reader = new Scanner(System.in);

	         System.out.println("Dime un número entero positivo (lado del hexágono):");
	         int lado = reader.nextInt();

	         // Parte superior del hexágono
	         for (int i = 0; i < lado; i++) {
	             // Espacios a la izquierda
	             for (int j = 0; j < lado - i - 1; j++) {
	                 System.out.print(" ");
	             }
	             // Asteriscos
	             System.out.print("*");
	             for (int j = 0; j < (i * 2); j++) {
	                 System.out.print(" ");
	             }
	             if (i > 0) {
	                 System.out.print("*");
	             }
	             System.out.println();
	         }

	         // Parte media del hexágono (lado plano)
	         for (int i = 0; i < lado * 2; i++) {
	             System.out.print("*");
	         }
	         System.out.println();

	         // Parte inferior del hexágono
	         for (int i = lado - 1; i >= 0; i--) {
	             // Espacios a la izquierda
	             for (int j = 0; j < lado - i - 1; j++) {
	                 System.out.print(" ");
	             }
	             // Asteriscos
	             System.out.print("*");
	             for (int j = 0; j < (i * 2); j++) {
	                 System.out.print(" ");
	             }
	             if (i > 0) {
	                 System.out.print("*");
	             }
	             System.out.println();
	         }

	         reader.close();
	     }
	 }
