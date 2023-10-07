package boletin2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		double num1, num2;
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
		case "a", "A" -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		case "b", "B" -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		case "c", "C" -> System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		case "d", "D" -> System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		default -> System.out.println("Opción incorrecta");
		}
		sc.close();
	}

}
