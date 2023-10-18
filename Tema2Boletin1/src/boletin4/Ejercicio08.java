package boletin4;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		final int UNO = 1;
		final int DOS = 2;
		final int TRES = 3;
		final int CUATRO = 4;
		final int CINCO = 5;
		final int SEIS = 6;
		String tirada1, tirada2;
		int num1, num2, suma;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Escribe (con letras) cuánto has sacado en la primera tirada");
			tirada1 = sc.nextLine();
			num1 = switch (tirada1) {
			case "uno", "UNO" -> UNO;
			case "dos", "DOS" -> DOS;
			case "tres", "TRES" -> TRES;
			case "cuatro", "CUATRO" -> CUATRO;
			case "cinco", "CINCO" -> CINCO;
			case "seis", "SEIS" -> SEIS;
			default -> {
				System.out.println("Número incorrecto");
				yield -1;
			}
			};
		} while (num1 == -1);
		do {
			System.out.println("Escribe (con letras) cuánto has sacado en la segunda tirada");
			tirada2 = sc.nextLine();
			num2 = switch (tirada2) {
			case "uno", "UNO" -> UNO;
			case "dos", "DOS" -> DOS;
			case "tres", "TRES" -> TRES;
			case "cuatro", "CUATRO" -> CUATRO;
			case "cinco", "CINCO" -> CINCO;
			case "seis", "SEIS" -> SEIS;
			default -> {
				System.out.println("Número incorrecto");
				yield -1;
			}
			};
		} while (num2 == -1);
		suma = num1 + num2;
		System.out.println("La tirada ha sido de " + num1 + " + " + num2 + " = " + suma);
		sc.close();
	}
}
