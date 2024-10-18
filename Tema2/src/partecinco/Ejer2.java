package partecinco;

public class Ejer2 {

	public static void main(String[] args) {
			
			//declaramos la variable 
			int numero = 0;

			//Preguntamos por la 
			System.out.print ("Cantidad de terminos: ");
			
			do {	
				System.out.print (numero + ",");
				numero += 2;
			} while (numero<=200);	
	}
}
