package partedos;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		String tirada1;
		String tirada2;
		int numeroUno;
		int numeroDos;
		int resultado;
				
		do {
			System.out.println("Dime que numero te ha tocado en el dado con letra");
			tirada1 = reader.next().toUpperCase();
			//preguntamos por el segundo numero que le ha salido
			System.out.println("Dime el segundo numero que te haya tocado con letras");
			tirada2 = reader.next().toUpperCase();
			
		numeroUno = switch (tirada1)	{
				case "UNO" -> {
					yield 1;
				}
				case "DOS" -> {
					yield 2;
				}
				case "TRES" -> {
					yield 3;
				}
				case "CUATRO" -> {
					yield 4;
				}
				case "CINCO" -> {
					yield 5;
				}
				case "SEIS" -> {
					yield 6;
				}
				default -> {
					System.out.println("Error el numero no coincide");
					yield -1;
				}
			};
			
			numeroDos = switch (tirada2)	{
			case "UNO" -> {
				yield 1;
			}
			case "DOS" -> {
				yield 2;
			}
			case "TRES" -> {
				yield 3;
			}
			case "CUATRO" -> {
				yield 4;
			}
			case "CINCO" -> {
				yield 5;
			}
			case "SEIS" -> {
				yield 6;
			}
			default -> {
				System.out.println("Error el numero no coincide");
				yield -1;
			}
		};
		} while (numeroUno == -1 || numeroDos == -1);
		
		resultado = numeroUno + numeroDos;
		System.out.println("Tus numeros sumados dan : " + resultado);
	//cerramos el escaner
	reader.close();
	}
}
