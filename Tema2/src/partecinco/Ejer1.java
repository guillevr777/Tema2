package partecinco;

public class Ejer1 {

	public static void main(String[] args) {
		
		//Declaramos la variable que guardara el valor del numero
		int numero = 0;

		//Preguntamos por la cantidad de terminos
		System.out.print ("Cantidad de terminos: ");
		
		//usamos el do while para que hasta que no llevemos 20 numeros o mas no para el bucle de poner numero con ,
		do {	
			System.out.print (numero + ",");
			numero += 1;
		} while (numero<=20);	
	}
}
