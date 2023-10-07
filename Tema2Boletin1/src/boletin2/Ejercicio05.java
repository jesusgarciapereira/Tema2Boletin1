package boletin2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		String carnet, vehiculo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su tipo de carné");
		carnet = sc.nextLine();
		vehiculo = switch (carnet) {
		case "E", "e" -> {

			yield "Remolques";
		}
		case "D", "d" -> {

			yield "Autobuses";
		}
		case "C1", "C2", "C3", "C4", "C5", "c1", "c2", "c3", "c4", "c5" -> {

			yield "Camiones";
		}
		case "A", "a" -> {

			yield "Motocicletas";
		}
		case "B1", "B2", "b1", "b2" -> {

			yield "Automóviles";
		}
		default -> {
			yield "Categoría no contemplada";
		}
		};
		System.out.println("Su carnet es de tipo " + carnet + " y corresponde a: " + vehiculo);
		sc.close();
	}
}
