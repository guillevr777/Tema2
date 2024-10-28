package partedebucles;

import java.util.Scanner;

public class Ejer10 {
	
	public static void main(String[]args) {
		
		Scanner reader = new Scanner(System.in);
		
        int numero;
        int digito;
        int primerD;
        int segundoD;
        int tercerD;
        int cuartoD;
        int quintoD;
        int sextoD;
        
        System.out.println("dime el numero");
        numero = reader.nextInt();

        while (numero > 0) {
        	
            digito = numero % 10;
          
            if (digito < 10) {
            	primerD = digito;
            } 
            if (digito < 100 && digito >= 10) {
            	segundoD = digito;
            }
            if (digito < 1000 && digito >= 100) {
            	tercerD = digito;
            }
            if (digito < 10000 && digito >= 1000) {
            	cuartoD = digito;
            }
            if (digito < 100000 && digito >= 10000) {
            	quintoD = digito;
            }
            if (digito < 1000000 && digito >= 100000) {
            	sextoD = digito;
            }
        } 
        //cerramos el escaner
        reader.close();
	}
}
