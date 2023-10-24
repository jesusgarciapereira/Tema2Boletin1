package boletin4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Declaramos la variable que la máquina pensará para tratar de adivinar el
		 * número que piensa el usuario
		 */
		int numPensado;
		// Declaramos la variable para guardar la respuesta del usuario
		String acierto;
		/*
		 * Declaramos las variables para el valor mínimo y el máximo del intervalo que
		 * delimitará nuestro número pensado
		 */
		int min = 1;
		int max = 101;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Explicamos el juego
		System.out.println("Piensa un número del 1 al 100 y trataré de adivinarlo");
		// Le pedimos al usuario que pulse INTRO
		System.out.println("Pulsa INTRO para comenzar");
		// La consola recogerá la tecla INTRO
		sc.nextLine();
		// Creamos un objeto de tipo Random
		Random r = new Random();

		do {
			/*
			 * Asignamos al numPensado un número aleatorio con nuestro mínimo y nuestro
			 * máximo asignados
			 */
			numPensado = r.nextInt(min, max);
			
			do {
				// Mostramos el número aleatorio que se ha generado
				System.out.println("¿Es el " + numPensado + "? escribe 'mayor', menor' o 'igual'");
				// Le pedimos al usuario su respuesta
				acierto = sc.nextLine();
			} while (!(acierto.equalsIgnoreCase("mayor") || acierto.equalsIgnoreCase("menor") || acierto
					.equalsIgnoreCase("igual"))); /*
													 * Si la respuesta no es "mayor", "menor" o "igual"; repetiremos de
													 * nuevo las instrucciones de dentro de este do
													 */
			// Si la respuesta es "mayor", asignaremos al mínimo el numPensado más 1
			if (acierto.equalsIgnoreCase("mayor"))
				min = numPensado + 1;
			else 
				max = numPensado;
		} while (!acierto.equalsIgnoreCase("igual") && min != max);
		System.out.print("¡Qué bien!");
		if (min == max)
			System.out.println("... has intentado engañarme... o bueno, puedes haberte equivocado tú");
		sc.close();
	}
}
