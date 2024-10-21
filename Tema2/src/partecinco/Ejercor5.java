package partecinco;

import java.util.Random;
import java.util.Scanner;

public class Ejercor5 {

	public static void main(String[] args) {
		
			//creamos el escaner
			 Scanner reader = new Scanner(System.in);
			 
			 //creamos las variables
			  Random random = new Random();		
			  int numero;
			  int mayor = 100;
			  int menor = 1;
		      String respuesta;
		      
		      //preguntamos 
		      System.out.println("Voy a decirte un numero y me tienes que decir si es mayor menor o igual que el tuyo");

		      //creamos el do while
		      do {
		    	  numero = random.nextInt(1,101);
		    	  System.out.println("Es " + numero + "?");
		          respuesta = reader.nextLine();

		          // Usamos el if else para adivinarlo
		          if (respuesta.equals("mayor")) {
		        	  
		          } else if (respuesta.equals("menor")) {
		              numero = mayor -1;
		          }
		      } while (!respuesta.equals("igual"));
		      System.out.println("El numero era " + numero);
		        
		      // Cerrar el escaner
		      reader.close();
	}
}
