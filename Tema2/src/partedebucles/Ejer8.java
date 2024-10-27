package partedebucles;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable que guardara el numero
		int numero;
		
		//variable que guarda el nuevo numero que se haya introducido en el while
		int numerosSiguientes;
		
		//contador de fallos del else
		int fallos = 0;
		
		//cantidad de numeros que se introdujeron
		int cantidadNumeros = 1;
		
		//creamos un String para guardar la resppuesta 
		boolean salir = true;
		String respuesta;
		
		//pedimos el numero que se quiere comprobar
		System.out.print("Dime un numero inical :");
		numero = reader.nextInt();
		
		//creamos el while para que se repita hasta que el usuario introduzca 0
		while (salir) {
			
			System.out.print("Dime otro numero :");
			numerosSiguientes = reader.nextInt();
			cantidadNumeros++;
			
			if (numero > numerosSiguientes) {
				System.out.println("El numero introducido no es mayor que el anterior");
				fallos++;
				
				System.out.println("Quiere parar el programa? Si: 0 / No: cualquier otra tecla");
				respuesta = reader.next();
				if (respuesta.equals("0")) {
					salir = false;
				}
			}
		}
		
		System.out.println("Numero de fallos : " + fallos);
		System.out.println("Numero de numeros introducidos : " + cantidadNumeros);
		
		//cerramos el escaner
		reader.close();
	}
}
