package englishexercise;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//variablesç
		int altura;
		int alturaMayor = 0;
		int alturaMenor = 0;
		
		//preguntamos por edades
		System.out.println("Tell me the length of a mate of your class and if u dont want to say anymore write -1 at the console ");
		altura = reader.nextInt();
		
		if (altura == -1) {
			System.out.println("Has introducido 0");
		}	
			
		//creamos un while if else
		while (altura != 0) {
			
			//preguntamos por edades
			System.out.println("Tell me another one or close the program with 0");
			altura = reader.nextInt();
			
			if (altura > alturaMayor) {
				alturaMayor = altura;
				
			} else if (altura < alturaMenor) {
				 alturaMenor = altura;
			}
		}
		System.out.println("The heisthest person is " + alturaMayor + " and the shortest one is "+ alturaMenor);
		//cerramos el escaner
		reader.close();
	}
}
