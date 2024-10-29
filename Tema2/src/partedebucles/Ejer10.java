package partedebucles;

import java.util.Scanner;

public class Ejer10 {
	
	public static void main(String[]args) {
		
		Scanner reader = new Scanner(System.in);

        boolean continuar = true;
        String S;

        //se repetira el do todas las veces que la persona diga si al boolean
        do {
        	
        	 int numero;
             int digito;
             int reverso = 0;
             
            System.out.println("dime el numero");
            numero = reader.nextInt();
            int copiaNumero = numero;
        	
        	while (numero > 0) {
            digito = numero % 10;
            
            reverso = reverso*10+digito;
            
            numero/=10;
        	}
          
        	//si se lee el numero igual por delante que por detras es capicua
            if (copiaNumero == reverso) {
            	System.out.println("Tu numero es capicua");
            	System.out.println(copiaNumero);
            	continuar = false;
            	
            } else { 
            	System.out.println("El numero no es capicua");
            	continuar = false;
            }
            
            //se le pregunta al usuario si quiere volver a probar un numero
            System.out.println("Deseas volver a intentar ? S/N");
        	S = reader.next();
        	continuar = S.equalsIgnoreCase("S");
            
        } while (continuar);
        	
        //cerramos el escaner
        reader.close();
	}
}
