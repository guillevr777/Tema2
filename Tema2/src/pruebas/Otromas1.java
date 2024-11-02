package pruebas;

import java.util.Scanner;

public class Otromas1 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int numero;
		double altura = 0;
		double mediaAltura = 0;
		int contadorAltura = 0;
		double peso = 0;
		double mediaPeso = 0;
		int contadorPeso = 0;
		String genero;
		int contadorGenero = 0;
		int contadorGeneroFemenino = 0;
		int contadorGeneroMasculino = 0;
		
			System.out.println("Dime la cantidad de personas :");
			numero = reader.nextInt();
			
			if (numero > 0) {
				
				for (int i = 1 ; i <= numero ; i++) {
					
					System.out.println("Dime la altura :");
							
					altura = reader.nextDouble();
					
				if (altura > 0) {
					
						mediaAltura += altura;
						contadorAltura++;
						
					} else {
						 System.out.println("numero introducido incorrecto");
						}
				
					System.out.println("Dime el peso :");
				
					peso = reader.nextDouble();
				
					if (peso > 0) {
						mediaPeso += peso;
						contadorPeso++;
					} else {
						 System.out.println("numero introducido incorrecto");
						}		
					
					System.out.println("Dime el genero : H es hombre y M es mujer");
					
					genero = reader.next();
				
					if (genero.equalsIgnoreCase("M")) {
						contadorGeneroFemenino++;
						contadorGenero++;
						} else if (genero.equalsIgnoreCase("H")) {
							contadorGeneroMasculino++;
							contadorGenero++;
							} else {
								System.out.println("numero introducido incorrecto");
								}
				}
			} else {
			System.out.println("Numero incorrecto");
		}
			System.out.println("La media de peso de " + contadorPeso + " personas es de " + mediaPeso/contadorPeso);
			System.out.println("La media de altura de " + contadorPeso + " personas es de " + mediaAltura/contadorAltura);
			System.out.println("La media de hombres y mujeres es de " + contadorGeneroFemenino + " mujeres y " + contadorGeneroMasculino + " hombres");
	}
}
