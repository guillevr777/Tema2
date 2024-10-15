package partecuatro;

import java.util.Scanner;

public class Ejer2 {
		public static void main(String[]args) {
			
			//creamops el escaner
			Scanner reader = new Scanner(System.in);
			
			//creamos las variables que almacenaran los valores
			int num;
			int suma = 0;
			
			//pedimos codigo por consola
			System.out.println("Dime un numero");
			num = reader.nextInt();
			
			//resolvemos con wbile
			while (num >= 0) {
				
				suma++;
				
				//pedimos codigo por consola
				System.out.println("Dime otro numero");
				num = reader.nextInt();
			}
			//respondemos las preguntas
			System.out.println("has dado " + suma + " numeros");
		//cerramos el escaner
		reader.close();
	}
}