package englishexercise;

import java.util.Random;
import java.util.Scanner;

public class Lastone {
	public static void main(String[]args) {
		
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		
		//creamos las variables
		int number;
		Random rand = new Random();
		
		//preguntamos por un numeroç
		System.out.println("say me a number whithout 1 and 100");
		number = reader.nextInt();
		
		//creamos el .ramdom
		number = rand.nextInt(1,101);
		
	}
}
