package tema2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Declaramos las variables numero, para calcular el número de cifras que tiene
		int numero;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario un número
		System.out.println("Introduzca un número del 0 al 99999");
		// Leemos el número
		numero = sc.nextInt();
		// Mostramos el resultado, dependiendo de cada caso
		if (numero < 0 || numero > 99999) {
			System.out.println("Número no valido, debe estar comprendido entre 0 y 99999");
		} else if (numero >= 0 && numero <= 9) {
			System.out.println("El número " + numero + " tiene una cifra");
		} else if (numero >= 10 && numero <= 99) {
			System.out.println("El número " + numero + " tiene dos cifras");
		} else if (numero >= 100 && numero <= 999) {
			System.out.println("El número " + numero + " tiene tres cifras");
		} else if (numero >= 1000 && numero <= 9999) {
			System.out.println("El número " + numero + " tiene cuatro cifras");
		} else {
			System.out.println("El número " + numero + " tiene cinco cifras");

		}
		// Cerramos el Scanner
		sc.close();
	}
}
