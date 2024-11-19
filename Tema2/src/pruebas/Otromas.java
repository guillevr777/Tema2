package pruebas;

import java.util.Random;
import java.util.Scanner;

public class Otromas {
	
	 // Función que recibe una tabla de dos dimensiones y devuelve un array con el mínimo en la posición 0 y el máximo en la posición 1
    public static int[] obtenerMinimoMaximo(int[][] tabla) {
        int min = Integer.MAX_VALUE;  // Inicializamos el mínimo con el valor más grande posible
        int max = Integer.MIN_VALUE;  // Inicializamos el máximo con el valor más pequeño posible

        // Recorremos la tabla para encontrar el mínimo y máximo
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] < min) {
                    min = tabla[i][j];
                }
                if (tabla[i][j] > max) {
                    max = tabla[i][j];
                }
            }
        }

        // Devolvemos el array con el mínimo y máximo
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        // Crear un array bidimensional de 6 filas por 10 columnas
        int[][] tabla = new int[6][10];

        // Llenamos la tabla con números aleatorios entre 0 y 1000
        Random rand = new Random();
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = rand.nextInt(1001);  // Genera un número entre 0 y 1000
            }
        }

        // Llamamos a la función obtenerMinimoMaximo
        int[] resultado = obtenerMinimoMaximo(tabla);

        // Mostramos el resultado
        System.out.println("Mínimo: " + resultado[0]);
        System.out.println("Máximo: " + resultado[1]);
  }
}