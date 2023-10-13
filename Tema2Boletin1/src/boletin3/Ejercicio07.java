package boletin3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int numElegido, numAleatorio;
		Random r = new Random();
		numAleatorio = r.nextInt(1, 101);
		Scanner sc = new Scanner(System.in);
		System.out.println("He pensado un número del 1 al 100, adivínalo");
		System.out.println("Si quieres rendirte, elige -1");
		numElegido = sc.nextInt();
		while (numElegido != numAleatorio && numElegido >= 0) {
			if (numAleatorio < numElegido) {
				System.out.println("Menos");
			} else {
				System.out.println("Más");
			}
			numElegido = sc.nextInt();
		}
		if (numElegido == -1) {
			System.out.println("Qué pena... había pensado en el " + numAleatorio);
		} else if (numElegido == numAleatorio) {
			System.out.println("¡Correcto! ¿Jugamos otra vez?");
		}
		sc.close();
	}
}
