package Tema2;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[]args) {
	//creamos la consola
	Scanner reader = new Scanner(System.in);
	//creamos las variables
	int a;
	int b;
	int c;
	//creamos variables para las soluciones
	double x1;
	double x2;
	double discriminante;
	System.out.println("introduzca un coeficiente de  grado");
	a=reader.nextInt();
	b=reader.nextInt();
	c=reader.nextInt();
	
	//si la  a==0
	if (a==0) {
		x1 = -c/b;
			System.out.println("Solo tiene un resultado");
	} else {
		discriminante = b*b-4*a*c;
		if (discriminante < 0) {
			System.out.println("No tiene resultado");
		} else {
				x1 = (-b + Math.sqrt(discriminante)) / (2*a);
				x2 = (-b - Math.sqrt(discriminante)) / (2*a);
				System.out.println(x1);
				System.out.println(x2);
			}	
		}
	//cerramos el escaner
	reader.close();
	}
}
