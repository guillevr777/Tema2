package pruebas;

import java.util.Scanner;

public class Problema4EjerciciosExamen2Intento {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce el tamaño del escaque: ");
	        int tamañoEscaque = scanner.nextInt();
	        
	        // Tamaño total del tablero (8x8)
	        int tamañoTablero = 8;

	        // Dibuja el tablero de ajedrez
	        for (int fila = 0; fila < tamañoTablero; fila++) {
	            for (int i = 0; i < tamañoEscaque; i++) { // Dibuja cada escaque verticalmente
	                for (int columna = 0; columna < tamañoTablero; columna++) {
	                    if ((fila + columna) % 2 == 0) {
	                        // Escaque claro (espacio)
	                        for (int j = 0; j < tamañoEscaque; j++) {
	                            System.out.print(" ");
	                        }
	                    } else {
	                        // Escaque oscuro (##)
	                        for (int j = 0; j < tamañoEscaque; j++) {
	                            System.out.print("#");
	                        }
	                    }
	                }
	                System.out.println(); // Nueva línea después de cada fila de escaques
	            }
	        }

	        scanner.close();
	    }
	}