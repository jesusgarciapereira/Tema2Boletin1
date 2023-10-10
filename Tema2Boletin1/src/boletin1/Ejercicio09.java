package boletin1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Declaramos las constantes para PIEDRA PAPEL TIJERAS
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";
		// Declaramos las variables de tipo String jugador1 y jugador2 a las que
		// asociaremos a las constantes
		String jugador1, jugador2;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el juego
		System.out.println("Vamos a jugar a PIEDRA, PAPEL, TIJERA");
		// Le pedimos al jugador 1 que escriba su opción
		System.out.println("Jugador 1, elige una opción (en mayúsculas)");
		// Leemos el texto
		jugador1 = sc.nextLine();
		// Le pedimos al jugador 2 que escriba su opción
		System.out.println("Jugador 2, elige una opción (en mayúsculas)");
		// Leemos el texto
		jugador2 = sc.nextLine();
		// Mostramos la primera parte del resultado, es decir, las opciones elegidas por
		// ambos jugadores
		System.out.println("El jugador 1 ha elegido: " + jugador1 + "\nEl jugador 2 ha elegido: " + jugador2);
		// La segunda parte de la solución se mostrará según las siguientes condiciones
		if (jugador1.equals(PIEDRA) && jugador2.equals(PIEDRA) || jugador1.equals(PAPEL) && jugador2.equals(PAPEL)
				|| jugador1.equals(TIJERAS) && jugador2.equals(TIJERAS)) {
			System.out.println("Empate"); // Si ambos jugadores elijen lo mismo, mostrará empate
		} else if (jugador1.equals(PIEDRA) && jugador2.equals(TIJERAS)
				|| jugador1.equals(PAPEL) && jugador2.equals(PIEDRA)
				|| jugador1.equals(TIJERAS) && jugador2.equals(PAPEL)) {
			System.out.println("Gana el jugador 1"); /* Si los jugadores elijen estas opciones, mostrará que gana el
														 jugador 1 */
		} else if (jugador1.equals(PIEDRA) && jugador2.equals(PAPEL)
				|| jugador1.equals(PAPEL) && jugador2.equals(TIJERAS)
				|| jugador1.equals(TIJERAS) && jugador2.equals(PIEDRA)) {
			System.out.println("Gana el jugador 2"); /* Si los jugadores elijen estas opciones, mostrará que gana el
														 jugador 2 */
		} else {
			System.out.println("Opcion incorrecta"); /* Si no se cumplen ninguna de las condiciones anteriores, no
														 mostrará a ningún ganador */
		}
		// Cerramos el scanner
		sc.close();
	}

}
