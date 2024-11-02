package pruebas;

import java.util.Scanner;

public class NumerosPrimos {
	public static void main(String[] args) {
        // Creamos el escáner para leer la entrada del usuario
        Scanner reader = new Scanner(System.in);
        
        // Declaramos la variable para el número
        int numero;
        int contador = 0;

        // Pedimos al usuario que ingrese un número entero positivo
        System.out.println("Dime un número entero positivo:");
        numero = reader.nextInt();
        
        // Comprobamos si el número es mayor que 1
        if (numero <= 1) {
            System.out.println("El número " + numero + " no es primo.");
        } else {            
            // Comprobamos si el número es primo
            for (int i = 2; i < numero; i++) {
                // Si el número es divisible por i, incrementamos el contador
                if (numero % i == 0) {
                    contador++;
                }
            }
            // Si no se encontraron divisores, el número es primo
            if (contador == 0) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        }
        
        // Cerramos el escáner
        reader.close();
    }
}
