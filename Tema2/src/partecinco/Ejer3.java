package partecinco;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		//ceamos el escaner
		Scanner reader = new Scanner(System.in);
	
		//creamos la variable numero para almacenar el numnero recogido por escaner y contador que almacenara el numero de veces que se ha repetido el bucle
		int numero;
		int contador = 0;
		
		//Pedimos el numero por escaner para almacenarlo en numero
		System.out.println("Dime el numero");
		numero = reader.nextInt();
		
		//hacemos do while que ira sumando 1 al contador y elegira segun sea contador == numero o else
		do { contador++;
			if (contador == numero) {
				
				System.out.print(contador + ".");
			} else {
				System.out.print(contador + "+");
			}
		} while (numero > contador);
			
	//cerramos el escaner
	reader.close();
	}
}
