package boletin2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Declaramos la variables de los números que le pediremos al usuario
		double num1, num2;
		// Declaramos la variable de la opción que le pediremos al usuario
		String opcion;
		// Declaramos la variable resultado que mostraremos
		double resultado;
		// Activamos el scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir en la consola decimales con punto
		sc.useLocale(Locale.US);
		// Le pedimos al usuario un número
		System.out.println("Escribe un número");
		// Leemos el número
		num1 = sc.nextDouble();
		// Le pedimos al usuario otro número
		System.out.println("Escribe otro número");
		// Leemos el número
		num2 = sc.nextDouble();
		// Presentamos las opciones y le pedimos una de ellas al usuario
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		System.out.println("De todas estas opciones elige una para aplicar (escribe 'a', 'b', 'c' o 'd')");
		// Leemos el texto con la opción
		opcion = sc.next();
		/*
		 * Establecemos la relación de la variable resultado en función del los valores
		 * de la opción y mostramos el resultado
		 */
		switch (opcion) {
		case "a", "A" -> {
			resultado = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + resultado);
		}
		case "b", "B" -> {
			resultado = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + resultado);
		}
		case "c", "C" -> {
			resultado = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + resultado);
		}
		case "d", "D" -> {
			if (num2 != 0) {
				resultado = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + resultado);
			} else { // Si el segundo número es 0 y la opción es dividir, mostraremos este resultado
				System.out.println("No se puede dividir entre 0");
			}
		}

		default -> System.out.println("Opción incorrecta");
		}
		// Cerramos el scanner
		sc.close();
	}

}
