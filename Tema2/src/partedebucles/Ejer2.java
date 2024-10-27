package partedebucles;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos la variable que guardara el numero
		int numero;
		
		//creamos otra para los numeros primos
		int numerosPrimos = 0;
		
		//pedimos el numero que se quiere comprobar
		System.out.println("Dime un numero");
		numero = reader.nextInt();
		
		//hacemos el for
		for (int i = 2 ; i <= numero ; i++) {
			
				int numeroDos = 0;
				
			for (int j = 1; j <= i; j++) {
				
                if (i % j == 0) {
                	
                    numeroDos++;
                }
            } if (numeroDos == 2){
            	numerosPrimos++;
            	
            	//aqui pongo el syso para que diga cada numero primo
            	System.out.println(i);
            }
		}
		
		//aqui digo el total de numeros primos que hay
        System.out.println("Hay " + numerosPrimos + " números primos entre 1 y " + numero);

		//cerramos el escaner
		reader.close();
	}
}
