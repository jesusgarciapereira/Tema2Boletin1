package boletin4;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		String jugador1;
		String jugador2;
		String repetir;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Vamos a jugar a PIEDRA, PAPEL o TIJERA");
			do {
				System.out.println("Jugador 1 elige una de las tres opciones");
				jugador1 = sc.nextLine();
			} while (!(jugador1.equalsIgnoreCase("PIEDRA") || jugador1.equalsIgnoreCase("PAPEL")
					|| jugador1.equalsIgnoreCase("TIJERA")));
			do {
				System.out.println("Jugador 2 elige una de las tres opciones");
				jugador2 = sc.nextLine();
			} while (!((jugador2.equalsIgnoreCase("PIEDRA")) || (jugador2.equalsIgnoreCase("PAPEL"))
					|| (jugador2.equalsIgnoreCase("TIJERA"))));
			System.out.println("El jugador 1 ha elegido " + "'" + jugador1 + "'" + " y el jugador 2 ha elegido " + "'"
					+ jugador2 + "'");
			if (jugador1.equalsIgnoreCase(jugador2)) {
				System.out.println("La partida ha quedado en empate");
			} else if (jugador1.equalsIgnoreCase("PIEDRA") && jugador2.equalsIgnoreCase("TIJERA")
					|| jugador1.equalsIgnoreCase("PAPEL") && jugador2.equalsIgnoreCase("PIEDRA")
					|| jugador1.equalsIgnoreCase("TIJERA") && jugador2.equalsIgnoreCase("PAPEL")) {
				System.out.println("Ha ganado el jugador 1");
			} else {
				System.out.println("Ha ganado el jugador 2");
			}
			System.out.println("Pulsa 'S' para iniciar una nueva partida");
			repetir = sc.nextLine();
		} while (repetir.equalsIgnoreCase("s"));
		sc.close();
	}
}
