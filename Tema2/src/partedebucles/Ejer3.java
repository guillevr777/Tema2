package partedebucles;

import java.util.Scanner;

public class Ejer3 {
	
	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable que guardara el numero
		int numeroA;
		int numeroB;
		
		//creo una variable para almacenar el numero menor
		int numeroMenor;
		
		//creo un booleano para que cuando salga el MCD no siga buscando numeros divisibles entre ambos
		boolean continuar = true;
				
		//pedimos el numero que se quiere comprobar
		System.out.println("Dime un numero");
		numeroA = reader.nextInt();
		
		//pedimos el otro numero que se quiere sacar el MCD
		System.out.println("Dime otro numero");
		numeroB = reader.nextInt();
		
		if (numeroA < numeroB) {
		    numeroMenor = numeroA;
		} else {
		    numeroMenor = numeroB;
		}
						
		//creamos el for para que vaya contando hacia abajo desde el numero menor hasta encontrar un MCD y pare gracias al booleano
		for (int i = numeroMenor ; continuar ; i--) {
			
			if (numeroA%i == 0 && numeroB%i == 0){
				
					System.out.println("El MCD es " + i);
			continuar = false;
					}
				}		
		//cerramos el escaner
		reader.close();
	}
}
