package partecinco;

public class Ejer1 {

	public static void main(String[] args) {
		
		//declaramos la variable 
		int numero = 0;

		//Preguntamos por la 
		System.out.print ("Cantidad de terminos: ");
		
		do {	
			System.out.print (numero + ",");
			numero += 1;
		} while (numero<=20);	
	}
}
