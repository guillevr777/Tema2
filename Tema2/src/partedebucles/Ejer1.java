package partedebucles;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//declaramos la variable que almacenara el numero de segundos que queramos incrementar el reloj
		int masTiempo;
		//otra para almacenar las horas
		int horas;
		//otra para los minutos
		int minutos;
		//otra para los segundos 
		int segundos;
		
		//pedimos la hora
		System.out.println("Dime la hora");
		horas = reader.nextInt();
		
		//pedimos los minutos
		System.out.println("Dime los minutos");
		minutos = reader.nextInt();

		//pedimos los segundos
		System.out.println("Dime los segundos");
		segundos = reader.nextInt();

		//pedimos al usuario por escaner que diga el numero de segundos que quiere sumar a la hora
		System.out.println("Dime los segundos que quieres sumarle");
		masTiempo = reader.nextInt();
	
		for (int i = 0 ; masTiempo > i ; i++) {
		
			segundos ++;
						
				if	(segundos == 60) {
					segundos = 0;
					minutos++;
					
				}if (minutos == 60) {
					minutos = 0;
					horas++;
					
				}if (horas == 24) {
					horas = 0;
			}
		}
		
		System.out.println("La hora sera : " + horas + " : " + minutos + " : " + segundos);
		
	//cerramos el escaner
	reader.close();
	}
}
