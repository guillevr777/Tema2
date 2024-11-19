package partedebucles;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable que guardara el numero
		int numero = 0;
		
		try {
			
		//pedimos el numero que se quiere comprobar
		System.out.println("Dime un numero entre 0 y 20");
		numero = reader.nextInt();
		
		assert numero > 0 && numero < 20 : "Error : The number need to be between 0 and 20.";
		
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Error : Poner numero mayor o igual que cero");
		}
		
		//creamos el for , uno funcionara como fila y otro como columnas
		for (int i = 1; i <= numero ; i++) {
						
            for (int x = 1 ; x <= i ; x++) {
            	System.out.print(i);
            }
            System.out.println();
        }
		
		//cerramos el escaner
		reader.close();
	}
}
