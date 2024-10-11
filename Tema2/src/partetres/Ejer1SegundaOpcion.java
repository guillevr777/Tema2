package partetres;

import java.util.Scanner;

public class Ejer1SegundaOpcion {
    /*
    El numero 99 es capicua
    El numero 4321 no es capicua
    Numeros por debajo de 0 y encima de 9999 no se aceptan
     */
    public static void main(String[]args) {
        //Creamos el escaner
        Scanner reader = new Scanner(System.in);
        //creamos las variables
        int numero;
        int digito1;
        int digito2;
        int digito3;
        int digito4;
        // Pedimos que introduzca un numero entre 0 y 9999
        System.out.print("Introduce un numero entre 0 y 9999: ");
        numero = reader.nextInt();
        //Si el numero esta por debajo de 0 o por encima de 9999 no funcionara
        if (numero < 0 || numero > 9999) {
            System.out.println("El numero no esta entre 0 y 9999.");
        } else {
        	//Si el numero es de 1 digito
        	if (numero < 10) {
        		System.out.println("El numero " + numero + " es capicua.");
        //Si el numero es de 2 digitos
        } else if (numero >= 10 && numero < 100) {
        	digito1 = numero / 10;
            digito2 = numero % 10;
                if (digito1 == digito2) {
                    System.out.println("El numero " + numero + " es capicua.");
                } else {
                    System.out.println("El numero " + numero + " no es capicua.");
                }
            //Si el numero es de 3 digitos
        } else if (numero >= 100 && numero < 1000) {
            digito1 = numero / 100;
            digito2 = numero % 10;
                if (digito1 == digito2) {
                    System.out.println("El numero " + numero + " es capicua.");
                } else {
                    System.out.println("El numero " + numero + " no es capicua.");
                }
            //Si el número es de 4 dígitos
        } else if (numero >= 1000 && numero < 10000) {
        	digito1 = numero / 1000;
            digito2 = (numero / 100) % 10;  
            digito3 = (numero / 10) % 10;   
            digito4 = numero % 10;      
                if (digito1 == digito4 && digito2 == digito3) {
                    System.out.println("El numero " + numero + " es capicua.");
                } else {
                    System.out.println("El numero " + numero + " no es capicua.");
                }
        	}
        // Cerrar el Scanner
        reader.close();
    	}
	}
}
