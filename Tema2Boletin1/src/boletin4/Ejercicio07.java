package boletin4;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int num1, num2;
		int suma, resta, multiplicacion, division;
		String opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Escribe un número");
			num1 = sc.nextInt();
			System.out.println("Escribe otro número");
			num2 = sc.nextInt();
			System.out.println();
			System.out.println("A. SUMAR LOS NÚMEROS");
			System.out.println("B. RESTAR LOS NÚMEROS");
			System.out.println("C. MULTIPLICAR LOS NÚMEROS");
			System.out.println("D. DIVIDIR LOS NÚMEROS");
			System.out.println("E. SALIR");
			System.out.println("De todas estas opciones elige una para aplicar (escribe 'a', 'b', 'c', 'd' o 'e')");
			opcion = sc.next();
			switch (opcion) {
			case "a", "A" -> {
				suma = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + suma);
			}
			case "b", "B" -> {
				resta = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + resta);
			}
			case "c", "C" -> {
				multiplicacion = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
			}
			case "d", "D" -> {
				if (num2 == 0) {
					System.out.println("No se puede dividir entre 0");
				} else {
					division = num1 / num2;
					System.out.println(num1 + " / " + num2 + " = " + division);
				}
			}
			case "e", "E" -> {
				System.out.println("Saliendo del programa");
			}
			default -> {
				System.out.println("Opción incorrecta");
			}
			}
		} while (!opcion.equalsIgnoreCase("e"));
		sc.close();
	}
}
