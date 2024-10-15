package partecuatro;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[]args) {
		
		//creamops el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables que almacenaran los valores
		int num;
		int sumaUno = 0;
		int sumaDos = 0;
		int contadorDos = 0;
		int contadorTres = 0;
		int contador = 0;
		
		//pedimos codigo por consola
		System.out.println("Dime un numero");
		num = reader.nextInt();
		
		//resolvemos con wbile
		while (contador < 10) {
			
			contador++;
			
			//pedimos un numero por consola
			System.out.println("Dime otro numero");
			num = reader.nextInt();
					
			if (num < 0) {
			
			sumaDos += num;
			contadorDos++;
			
		} else if  (num == 0) {
	
			contadorTres++;
			
		} else if (num > 0) {
			
			sumaUno += num;
			
			}
		}
		
		 // Mostramos los resultados
		
		System.out.println("La suma de los números positivos es: " + sumaUno);
		
        System.out.println("Han salido " + contadorTres + " ceros.");

        if (contadorDos > 0) {
            System.out.println("La media de los números negativos es: " + sumaDos/contadorDos);
        } else {
            System.out.println("No se ingresaron números negativos");
        }

		
	//cerramos el escaner
	reader.close();
	}
}
