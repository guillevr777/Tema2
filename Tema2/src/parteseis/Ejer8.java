package parteseis;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		//creamos la consola
				Scanner reader = new Scanner(System.in);
				
				//Declaramos las variables
				int numeroA = 0;
				int numeroB = 0;
				
				//preguntamos por un numero entero positivo
				System.out.println("Dime un numero");
				numeroA = reader.nextInt();
				System.out.println("Dime otro numero");
				numeroB = reader.nextInt();
				
				//hacemos el for para que cuente hasta que llegue al 20 y vaya sumando 1 al contador cada vez
				if (numeroA < numeroB) {
					
				for (; numeroA <= numeroB ; numeroA++)
					System.out.print(numeroA + "  ");
				
				} else {
					
				for (; numeroB <= numeroA ; numeroB++)
					System.out.print(numeroB + "  ");
				}
				
	//cerramos el escaner
	reader.close();
	}
}

