package partedebucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable que guardara el numero
		int numero = 0;
		
		//variable que guarda el nuevo numero que se haya introducido en el while
		int numerosSiguientes = 0;
		
		//contador de fallos del else
		int fallos = 0;
		
		//cantidad de numeros que se introdujeron
		int cantidadNumeros = 1;
		
		//creamos un String para guardar la resppuesta 
		boolean salir = true;
		String respuesta;
		
		//creamos el while para que se repita hasta que el usuario introduzca 0
		while (salir) {
			try {
			//pedimos el numero que se quiere comprobar
			System.out.println("Dime un numero :");
			numero = reader.nextInt();
			assert numero >= 0 : "Error : Numero inferior a 0";
			} catch (ArithmeticException e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println(e.getMessage());
			}
				finally {
				reader.nextLine();
			}
			reader.nextLine();

			cantidadNumeros++;
		 	
			if (numero < numerosSiguientes) {
				System.out.println("El numero introducido no es mayor que el anterior");
				fallos++;
				
				System.out.println("Quiere parar el programa? Si: 0 / No: cualquier otra tecla");
				respuesta = reader.next();
				if (respuesta.equals("0")) {
					salir = false;
				}
			}
			numerosSiguientes = numero;
			
		}
		
		System.out.println("Numero de fallos : " + fallos);
		System.out.println("Numero de numeros introducidos : " + cantidadNumeros);
		
		//cerramos el escaner
		reader.close();
	}
}
