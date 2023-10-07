package boletin2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int nota;
		String calificacion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su nota");
		nota = sc.nextInt();
		calificacion = switch (nota) {
		case 0, 1, 2, 3, 4 -> {
			yield "Insuficiente";
		}
		case 5 -> {
			yield "Suficiente";
		}
		case 6 -> {
			yield "Bien";
		}
		case 7, 8 -> {
			yield "Notable";
		}
		case 9, 10 -> {
			yield "Sobresaliente";
		}
		default -> {
			System.out.println("Nota incorrecta");
			yield "";
		}
		};
		System.out.println("Su nota es de: " + calificacion);
		sc.close();
	}

}
