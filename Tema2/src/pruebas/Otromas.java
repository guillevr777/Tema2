package pruebas;

import java.util.Scanner;

public class Otromas {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		boolean continuar = true;
		int numero;
		double resultado = 1;
		
		do {
			
			System.out.println("Dime un numero :");
			numero = reader.nextInt();
			
			if (numero > 0) {
				
				for (int i = 1 ; i <= numero ; i++) {
					
					if (i%2 == 0) {
					resultado /= (double)1/i;
					} else {
						resultado *= (double)1/i;
					}
				}
				
				System.out.println(resultado);
				continuar = false;
				
			} else {
				System.out.println("El numero es 0 o menor");
				continuar = true;
			}
		} while (continuar == true);
	}

}
