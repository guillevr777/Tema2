package partecinco;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		//creamos el escaner
		 Scanner reader = new Scanner(System.in);
		 
		 //creamos las variables
	      String respuestaUno;
	      String respuestaDos;
	    
	      //creamos el do while
	      do {
	    	//preguntamos 
		      System.out.println("Jugador 1 tiene que elegir piedra papel o tijera");
		      respuestaUno = reader.next();
		      System.out.println("Jugador 1 tiene que elegir piedra papel o tijera");
		      respuestaDos = reader.next();
	            if (respuestaUno.equals(respuestaDos)) {
	                System.out.println("Es empate");
	            } else if (ganaJugadorUno(respuestaUno, respuestaDos)) {
	                System.out.println("Gana jugador 1");
	            } else {
	                System.out.println("Gana jugador 2");
	            }
	        } while (!respuestaUno.equals(respuestaDos));
	        
	  // Cerrar el escaner
	   reader.close();
		}
		private static boolean ganaJugadorUno(String jugadorUno, String jugadorDos) {
		return (jugadorUno.equals("piedra") && jugadorDos.equals("tijeras")) ||
	           (jugadorUno.equals("papel") && jugadorDos.equals("piedra")) ||
	           (jugadorUno.equals("tijeras") && jugadorDos.equals("papel"));	
	}
}
