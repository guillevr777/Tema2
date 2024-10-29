package partedebucles;

import java.util.Scanner;

public class Ejer7 {
	
	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable que guardara el numero
		int numero;
				
		//pedimos el numero que se quiere comprobar
		System.out.println("Dime un numero entre 0 y 20");
		numero = reader.nextInt();
		
		//creamos el for , uno funcionara como fila y otros dos como columnas
		for (int i = 1; i <= numero ; i++) {
            System.out.println();

            for (int x = 1 ; x <= i ; x++) {
            	System.out.print(x);
            } 
            
            for (int a = i -1 ; a >= 1 ; a--) {
            	System.out.print(a);
            }
        }
		
		//cerramos el escaner
		reader.close();
	}
}