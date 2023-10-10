package boletin2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Declaramos la variable numero
		int numero;
		// Declaramos la variable de tipo String diaSemana
		String diaSemana;
		// Activamos el scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que escriba un número
		System.out.println("Escriba un número");
		numero = sc.nextInt();
		diaSemana = switch (numero) {
		case 1 -> {
			yield "Lunes";
		}
		case 2 -> {
			yield "Martes";
		}
		case 3 -> {
			yield "Miércoles";
		}
		case 4 -> {
			yield "Jueves";
		}
		case 5 -> {
			yield "Viernes";
		}
		case 6 -> {
			yield "Sábado";
		}
		case 7 -> {
			yield "Domingo";
		}
		default -> {
			yield "'Número incorrecto'";
		}
		};
		System.out.println("El número " + numero + " corresponde al " + diaSemana);
		sc.close();
	}
}
