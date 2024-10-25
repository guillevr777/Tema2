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

		int segundos1 = segundos;
		int minutos1 = minutos;
		int horas1 = horas;
	
		for (int i = 1 ; masTiempo <= i ; i++) {
		
			segundos1 += i;
			
		if (horas1 < 0 || horas1 > 23 || minutos1 < 0 || minutos1 > 59 || segundos1 < 0 || segundos1 > 59) {
			System.out.println("La hora introducida no es real");
			} else { segundos1++;
				if	(segundos1 == 60) {
					segundos1 = 0;
					minutos1++;
				}if (minutos1 == 60) {
					minutos1 = 0;
					horas1++;
				}if (horas1 == 24) {
					horas1 = 0;
				}
			}
		}
	//cerramos el escaner
	reader.close();
	}

}
