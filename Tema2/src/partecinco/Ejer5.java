package partecinco;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[]args) {
		
		//creamos el escaner
		 Scanner reader = new Scanner(System.in);
		 
		 //creamos las variables
	      int min = 1;
	      int max = 100;
	      int numero;
	      String respuesta;
	      
	      //preguntamos 
	      System.out.println("Voy a decirte un numero y me tienes que decir si es mayor menor o igual que el tuyo");

	      //creamos el do while
	      do {
	          numero = (min + max) / 2;
	          System.out.println("Es " + numero + "?");
	          respuesta = reader.nextLine();

	          // Usamos el if else para adivinarlo
	          if (respuesta.equals("mayor")) {
	              min = numero + 1;
	          } else if (respuesta.equals("menor")) {
	              max = numero - 1;
	          }
	      } while (!respuesta.equals("igual"));
	      System.out.println("El numero era " + numero);
	        
	      // Cerrar el escaner
	      reader.close();
	}
}
