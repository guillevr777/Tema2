package partecuatro;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner (System.in);
		
		//creamos las variables
		int altura;
		int alturaSuperior = 0;
		
		//pedimos que digan las edades
		System.out.println("Introduce los centimetros que mide el arbol : ");
		altura = reader.nextInt();
		
		//creamos el while usando if else 
		while (altura != -1) {
			if (altura > alturaSuperior) {
				alturaSuperior = altura;
				
			System.out.println("Introduce los centimetros que mide el arbol : ");
			altura = reader.nextInt();
			}
		}
			
			System.out.println("El arbol mas alto mide : " + alturaSuperior);
			
	//cerramos el escaner
	reader.close();
	}
}
