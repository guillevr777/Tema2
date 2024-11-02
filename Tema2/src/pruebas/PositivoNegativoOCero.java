package pruebas;	
	import java.util.Scanner;
		
	public class PositivoNegativoOCero {
		public static void main(String[] args) {
			
			Scanner reader = new Scanner(System.in);
			
			int contadorPositivo = 0;
			int contadorNegativo = 0;
			int contadorCeros = 0;
			int numero;
			int numeros;
				
				System.out.println("Dime un numero :");
				numero = reader.nextInt();
				
				if (numero > 0) {
					
					for (int i = 1 ; i <= numero ; i++) {
						
						System.out.println("Dime numeros :");
						numeros = reader.nextInt();
						
					if (numeros > 0) {
							contadorPositivo++;
						} else if (numeros < 0) {
								contadorNegativo++;
							} else {
									contadorCeros++;
								}
					}
				} else {
					System.out.println("Numero incorrecto");
		}
				System.out.print("Numeros positivos : " + contadorPositivo + " ");
				System.out.print("Numeros negativos : " + contadorNegativo + " ");
				System.out.print("Numeros ceros : " + contadorCeros);
	}
}