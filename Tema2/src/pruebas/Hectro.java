package pruebas;

import java.util.Scanner;

public class Hectro {
	public static void main(String[] args) {
	Scanner reader = new Scanner (System.in);
	
	boolean si = true;
	int numero;
	
	while (si) {
		
		System.out.println("Dime un numero");
		numero = reader.nextInt();
		
	if (numero > 0) {
		
		for (int i = 1 ; i <= 10 ; i++) {
		
		System.out.println(numero + " x " + i + " = " + numero*i);
		
		}
		
		si = false;
		
	} else {
		
		System.out.println("Dime un numero real");
		
			}
		}	
	 //cerramos el escaner
	 reader.close();
	}
}
