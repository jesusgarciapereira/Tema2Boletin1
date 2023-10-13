package boletin2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		double num1, num2;
		double resultado;
		String opcion;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Escribe un número");
		num1 = sc.nextDouble();
		System.out.println("Escribe otro número");
		num2 = sc.nextDouble();
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		System.out.println("De todas estas opciones elige una para aplicar (escribe 'a', 'b', 'c' o 'd')");
		opcion = sc.next();
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
			} else {
				System.out.println("No se puede dividir entre 0");
			}
		}

		default -> System.out.println("Opción incorrecta");
		}
		sc.close();
	}

}
