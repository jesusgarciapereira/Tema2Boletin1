package boletin2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		final int UNO = 1;
		final int DOS = 2;
		final int TRES = 3;
		final int CUATRO = 4;
		final int CINCO = 5;
		final int SEIS = 6;
		String tirada1, tirada2;
		int numero1, numero2;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuánto has sacado en la primera tirada? (escribe el número con letras)");
		tirada1 = sc.nextLine();
		System.out.println("¿Y en la segunda?");
		tirada2 = sc.nextLine();
		numero1 = switch (tirada1) {
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
			yield -1;
		}
		};
		
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
			yield -1;
		}
		};
		System.out.println("Tu tirada ha sido: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		sc.close();
	}
}
