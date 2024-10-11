package partetres;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[]args) {
		
	//creamos el escaner
	Scanner reader = new Scanner(System.in);
		
	//creamos las variables para almacenar los valores
	int km;
	int dias;
	final double precio = 2.5;
	double ahorro;
	double precioBillete;
	
	//le pedimos por consola que diga los kilometros y dias que viajo
	System.out.println("Cuantos kilometros hiciste?");
	km = reader.nextInt();
	System.out.println("cuantos dias viajaste?");
	dias = reader.nextInt();
	
	//Usamos if else para hacer el calculo
	if (km > 800 && dias > 7) {
		ahorro = (precio * km)*0.3;
		precioBillete = (precio * km) - ahorro;
			System.out.println("Tu billete saldra por " + precioBillete + " euros y ahorraste " + ahorro + " euros");
		} else { precioBillete = precio * km;
			System.out.println("Tu billete saldra por " + precioBillete);
		}
	//cerramos el escaner
	reader.close();
	}
}
