package boletin2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Declaramos las constantes de cada uno de los números del 1 al 6
		final int UNO = 1;
		final int DOS = 2;
		final int TRES = 3;
		final int CUATRO = 4;
		final int CINCO = 5;
		final int SEIS = 6;
		// Declaramos las variables de las tiradas que le pediremos al usuario
		String tirada1, tirada2;
		// Declaramos las variables de los números que mostraremos
		int numero1, numero2;
		// Activamos el scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario el texto de su primera tirada
		System.out.println("¿Cuánto has sacado en la primera tirada? (escribe el número con letras)");
		// Leemos el texto
		tirada1 = sc.nextLine();
		/*
		 * Establecemos la relación de la variable del primer número en función de los
		 * valores de la primera tirada
		 */
		numero1 = switch (tirada1) {
		case "UNO", "uno" -> UNO;
		case "DOS", "dos" -> DOS;
		case "TRES", "tres" -> TRES;
		case "CUATRO", "cuatro" -> CUATRO;
		case "CINCO", "cinco" -> CINCO;
		case "SEIS", "seis" -> SEIS;
		default -> {
			System.out.println("Número incorrecto");
			yield 0;
		}
		};
		/*
		 * No se aplicaran las siguientes instrucciones si el número anterior es
		 * incorrecto (asignado como 0)
		 */
		if (numero1 != 0) {
			// Le pedimos al usuario el texto de su primera tirada
			System.out.println("¿Y en la segunda?");
			// Leemos el texto
			tirada2 = sc.nextLine();
			/*
			 * Establecemos la relación de la variable del segundo número en función de los
			 * valores de la segunda tirada
			 */
			numero2 = switch (tirada2) {
			case "UNO", "uno" -> {
				yield UNO;
			}
			case "DOS", "dos" -> {
				yield DOS;
			}
			case "TRES", "tres" -> {
				yield TRES;
			}
			case "CUATRO", "cuatro" -> {
				yield CUATRO;
			}
			case "CINCO", "cinco" -> {
				yield CINCO;
			}
			case "SEIS", "seis" -> {
				yield SEIS;
			}
			default -> {
				System.out.println("Número incorrecto");
				yield 0;
			}
			};
			/*
			 * Mostraremos el resultado si el número anterior no es incorrecto (asignado
			 * como 0)
			 */
			if (numero2 != 0) {
				System.out.println("Tu tirada ha sido: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			}
		}
		// Cerramos el scanner
		sc.close();
	}
}
