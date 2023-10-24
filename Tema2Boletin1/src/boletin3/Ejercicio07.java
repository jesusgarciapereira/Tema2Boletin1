package boletin3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		/*
		 * Declaramos la variable numElegido para el número que escribira el usuario y
		 * la variable numAleatorio para el número aleatorio que elegirá el programa
		 */
		int numElegido, numAleatorio;
		// Creamos un objeto de la clase Random
		Random r = new Random();
		/*
		 * Asignamos a la variable numAleatorio un nuevo número entre 1 y 100 generado
		 * aleatoriamente
		 */
		numAleatorio = r.nextInt(1, 101);
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Explicamos el juego
		System.out.println("He pensado un número del 1 al 100, adivínalo");
		System.out.println("Si quieres rendirte, elige -1");
		// Le pedimos un número al usuario
		numElegido = sc.nextInt();
		// Seguirá preguntando números mientras no acierte y no se rinda
		while (numElegido != -1 && numElegido != numAleatorio) {
			
			if (numElegido >= 1 && numElegido <= 100) {
				// Si el número aleatorio es menor que mi número elegido 
				if (numAleatorio < numElegido) {
					System.out.println("Menos, introduzca otro número");
				} else {
					System.out.println("Más, introduzca otro número");
				}
			} else {
				System.out.println("Recuerda: un número del 1 al 100 o ríndete eligiendo -1");
				System.out.println("Vuelve a introducir un número");
			}
			numElegido = sc.nextInt();
		}
		if (numElegido == -1) {
			System.out.println("Qué pena... había pensado en el " + numAleatorio);
		} else {
			System.out.println("¡Correcto! pensé " + numAleatorio + " ¿Jugamos otra vez?");
		}
		sc.close();
	}
}
