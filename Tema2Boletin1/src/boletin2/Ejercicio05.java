package boletin2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Declaramos la variables del carnet que le pediremos al usuario
		String carnet;
		// Declaramos la variables del vehículo que mostraremos
		String vehiculo;
		// Activamos el scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario el texto de su tipo de carné
		System.out.println("Introduzca su tipo de carné");
		// Leemos el texto
		carnet = sc.nextLine();
		// Establecemos la relación de las variables en función de cada caso de 'carnet'
		vehiculo = switch (carnet) {
		case "E", "e" -> "Remolques";
		case "D", "d" -> "Autobuses";
		case "C1", "C2", "C3", "C4", "C5", "c1", "c2", "c3", "c4", "c5" -> "Camiones";
		case "A", "a" -> "Motocicletas";
		case "B1", "B2", "b1", "b2" -> "Automóviles";
		default -> "'Categoría no contemplada'";
		};
		// Mostramos el resultado
		System.out.println("Su carnet es de tipo " + carnet + " y corresponde a: " + vehiculo);
		// Cerramos el scanner
		sc.close();
	}
}
