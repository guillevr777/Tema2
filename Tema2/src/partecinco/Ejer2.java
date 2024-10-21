package partecinco;

public class Ejer2 {

	public static void main(String[] args) {
		
		//declaramos la variable que almacenara el numero
		int numero = 0;

		//Preguntamos por la cantidad de terminos
		System.out.print ("Cantidad de terminos: ");
		
		//realizamos el do while para que muestre los numeros pares en bucle de forma ascendete hasta llegar a 200
		do {	
			System.out.print (numero + ",");
			numero += 2;
		} while (numero<=200);	
	}
}
