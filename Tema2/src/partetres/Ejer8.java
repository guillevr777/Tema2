package partetres;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
			
		//creamos las variables para almacenar los valores
		int mes;
		int año;
		int dias;
		boolean bisiesto;
		
		//le pedimos por consola que diga los kilometros y dias que viajo
		System.out.println("Dime el mes");
		mes = reader.nextInt();
		System.out.println("Dime el año");
		año = reader.nextInt();
		
		//Usamos switch para hacer el calculo de mes a dia
		dias = switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			yield 31;
		}case 2 -> {
			yield 28;
		}case 4, 6, 9, 11 -> {
			yield 30;
		}default -> {
			System.out.println("Hay un error : El mes no corresponde a ninguno.");
			yield -1;
			}
		};
		
		//usamos
		 bisiesto = (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0));
	        
	        // Mostrar el resultado
	        if (bisiesto) {
	            System.out.println( año + " es un año bisiesto y el mes tiene " + dias + " dias.");
	        } else {
	            System.out.println( año + " no es un año bisiesto y el mes tiene " + dias + " dias.");
	        }
		
		//cerramos el escaner
		reader.close();
	}
}
