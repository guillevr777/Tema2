package pruebas;

import java.util.Scanner;

public class TablaMultiplicaaaaaaar {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		boolean continuar = true;
		int numero;
		String almacena;
		
		for (int i = 1 ; continuar ; i++) {
			System.out.println("Dime un numero");
			numero = reader.nextInt();
			for (int b = 1 ; b <= 10 ; b++) {
				System.out.println(numero + " * " + b + " = " + b*numero);
			}
			System.out.println("Quieres continuar : S/N");
			almacena = reader.next();
			continuar = almacena.equalsIgnoreCase("S");
		}
	}

}
