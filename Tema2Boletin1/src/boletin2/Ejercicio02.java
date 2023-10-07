package boletin2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int numero;
		String diaSemana;
		Scanner sc = new Scanner(System.in);
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
