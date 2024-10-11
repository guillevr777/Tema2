package partetres;

import java.util.Scanner;

public class Ejer6 {
	/*    
	  Si dices que son las 10 : 03 : 55 y te dice que son las 10 : 03 : 56 esta bien hecha la operacion
	  Si dices que son las 10 : 03 : 22 y te dice que son las 10 : 03 : 22 esta bien hecha la operacion
 */
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables para almacenar la hora
		int hora;
		int minuto;
		int segundo;
		int tiempoHora;
		int tiempoMinuto;
		int tiempoSegundo;
		
		//le preguntamos por un numero de 8 cifras
		System.out.println("Dime la hora que es : ");
		hora = reader.nextInt();
		System.out.println("Dime el minuto que es : ");
		minuto = reader.nextInt();
		System.out.println("Dime el segundo que es : ");
		segundo = reader.nextInt();
		
		//declaramos mas variables para no modificar los valores originales
		tiempoHora = hora;
		tiempoMinuto = minuto;
		tiempoSegundo = segundo;
		
		//Usamos if else para saber si el numero cumple los requisitos
		if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
			System.out.println("La hora introducida no es real");
			} else { tiempoSegundo++;
				if	(tiempoSegundo == 60) {
					tiempoSegundo = 0;
					tiempoMinuto++;
				}if (tiempoMinuto == 60) {
					tiempoMinuto = 0;
					tiempoHora++;
				}if (tiempoHora == 24) {
					tiempoHora = 0;
				}
		//decimos el resultado
		System.out.println("Tu hora despues de sumarle 1 segundo sera : " + tiempoHora + ":" + tiempoMinuto + ":" + tiempoSegundo);
		}
	//cerramos el escaner
	reader.close();
	}
}
