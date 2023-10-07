package boletin1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Declaramos la variable numero para saber si es casi-cero
		double numero;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir en la consola decimales con punto
		sc.useLocale(Locale.US);
		// Le pedimos al usuario un número
		System.out.println("Introduzca un número con decimales");
		// Leemos el número
		numero = sc.nextDouble();
		// Si el número es mayor que - 1, menor que 1 y distinto de 0 mostrará que es casi-cero
		if (numero > -1 && numero < 1 && numero != 0) {
			System.out.println("El número " + numero + " es casi-cero");
		}
		// Si el número es 0 mostrará que es cero
		else if (numero == 0) {
			System.out.println("El número " + (int)numero + " es cero");
		}
		//Si no se cumplen ninguna de las condiciones anteriores, mostrará que no es casi-cero
		else {
			System.out.println("El número " + numero + " no es casi-cero");
		}
		// Cerramos el Scanner
		sc.close();
	}

}
