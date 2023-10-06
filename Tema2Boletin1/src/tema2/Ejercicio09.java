package tema2;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		//Declaramos las constantes
		final String PIEDRA ="PIEDRA";
		final String PAPEL ="PAPEL";
		final String TIJERAS ="TIJERAS";
		// Declaramos las variables de tipo String jugador1 y jugador2 a las que asociaremos a la constante
		String jugador1, jugador2;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Presentamos el juego
		System.out.println("Vamos a jugar a PIEDRA, PAPEL, TIJERA");
		// Le pedimos al jugador 1 que escriba una opción
		System.out.println("Jugador 1, elige una opción (en mayúsculas)");
		jugador1 = sc.nextLine();
		System.out.println("Jugador 2, elige una opción (en mayúsculas)");
		jugador2 = sc.nextLine();
		System.out.println("El jugador 1 ha elegido: " + jugador1 + "\nEl jugador 2 ha elegido: " + jugador2);
		if (jugador1.equals(PIEDRA) && jugador2.equals(PIEDRA)
				|| jugador1.equals(PAPEL) && jugador2.equals(PAPEL)
				|| jugador1.equals(TIJERAS) && jugador2.equals(TIJERAS)) {
			System.out.println("Empate");
		} else if (jugador1.equals(PIEDRA) && jugador2.equals(TIJERAS)
				|| jugador1.equals(PAPEL) && jugador2.equals(PIEDRA)
				|| jugador1.equals(TIJERAS) && jugador2.equals(PAPEL)) {
			System.out.println("Gana el jugador 1");
		} else if (jugador1.equals(PIEDRA) && jugador2.equals(PAPEL)
				|| jugador1.equals(PAPEL) && jugador2.equals(TIJERAS)
				|| jugador1.equals(TIJERAS) && jugador2.equals(PIEDRA)) {
			System.out.println("Gana el jugador 2");
		} else {
			System.out.println("Opcion incorrecta");
		}
		sc.close();
	}

}
