package pruebas;

import java.util.Scanner;

public class Problema4EjerciciosExamen {
	    public static void main(String[] args) {
	    	Scanner reader = new Scanner(System.in);

	        System.out.println("Dime un número entero positivo (lado del hexágono):");
	        int lado = reader.nextInt();

	        // Parte superior del hexágono
	        for (int i = 0; i < lado*2-1; i++) {
	        	for (int a = 0 ; a < lado*2+1 ; a++) {
	        		if (a==0 && i==0 || a==1 && i==0 || a==0 && i==1 || i==0 && a==lado+2 || i==0 && a==lado+3 || i==1 && a==lado+3 || i==3 && a==0  || i==4 && a==0  || i==4 && a==1 || i==3 && a==lado+3 || i==4 && a==lado+3 || i==4 && a==lado+2) {
	        		System.out.print(" ");
	        		} else {
	        			System.out.print("*");
	        		}
	        	}
	        	System.out.println();
	        }
	         
	      reader.close();
	    }
	}