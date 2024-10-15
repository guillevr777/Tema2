package partecuatro;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[]args) {
		
		//creamops el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables que almacenaran los valores
		int num;
		int sumaUno = 0;
		int sumaDos = 0;
		int media;
		int contadorUno = 0;
		int contadorDos = 0;
		int contadorTres = 0;
		
		//pedimos codigo por consola
		System.out.println("Dime un numero");
		num = reader.nextInt();
		
		//resolvemos con wbile
		while (num > 0) {
			
			sumaUno += num;
			
			//pedimos codigo por consola
			System.out.println("Dime otro numero");
			num = reader.nextInt();
		
			if (num < 0) {
			
			sumaUno += num;
			contadorDos++;
			
			//pedimos codigo por consola
			System.out.println("Dime otro numero");
			num = reader.nextInt();
		} else if  (num == 0) {
	
			contadorTres++;
	
			//pedimos codigo por consola
			System.out.println("Dime otro numero");
			num = reader.nextInt();
			}
		}
		//respondemos las preguntas
		System.out.println("Han salido " +contadorTres + " ceros , la media de numeros negativos dio " +  sumaUno/contadorDos + " y la suma de los numeros positivos da " + suma);
	//cerramos el escaner
	reader.close();
	}
}
