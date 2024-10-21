package partecinco;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[]args) {
		
		//creamos la consola
		Scanner reader = new Scanner(System.in);

		//creamos las variables para almacenar las elecciones de los dos jugadores y la opcion de continuar la partida
		String jugador1;
		String jugador2;
		String continuar;
		
		//creamos do while donde le preguntaremos por sus elecciones y se decidira con if else si es uno o otro ganador o ninguno o continuar
		do {
		System.out.println("jugador 1 , elige entre piedra papel o tijeras");
		jugador1 = reader.next().toLowerCase();
		System.out.println("jugador 2 , elige entre piedra papel o tijeras");
		jugador2 = reader.next().toLowerCase();
		
		 if (jugador1.equals(jugador2)) {
             System.out.println("Es empate");
         } else if (jugador1.equals("piedra") && jugador2.equals("tijeras") ||
                    jugador1.equals("papel") && jugador2.equals("piedra") ||
                    jugador1.equals("tijeras") && jugador2.equals("papel")) {
             System.out.println("Jugador 1 gana");
         } else if (jugador2.equals("piedra") && jugador1.equals("tijeras") ||
                 jugador2.equals("papel") && jugador1.equals("piedra") ||
                 jugador2.equals("tijeras") && jugador1.equals("papel")) {
             System.out.println("Jugador 2 gana");
         } else {
             System.out.println("Opcion no valida");
         }
			System.out.println("Quieres jugar otra vez?S/N");
			continuar = reader.next().toUpperCase();
			
		} while (continuar.equals("S"));
		
		//cerramos el escaner
		reader.close();
	}
}
