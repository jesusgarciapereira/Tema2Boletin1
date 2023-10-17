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
		while (numElegido != -1 && numElegido != numAleatorio) {
			if (numElegido >= 1 && numElegido <= 100) {
				if (numAleatorio < numElegido) {
					System.out.println("Menos");
				} else {
					System.out.println("Más");
				}
			} else {
				System.out.println("Recuerda: un número del 1 al 100 o ríndete eligiendo -1");
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
