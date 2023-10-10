package boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Declaramos las variables de tres números enteros
		int num1, num2, num3;
		// Activamos el scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario un número entero
		System.out.println("Escribe un número entero");
		// Leemos el número
		num1 = sc.nextInt();
		// Le pedimos al usuario otro número entero
		System.out.println("Escribe otro");
		// Leemos el número
		num2 = sc.nextInt();
		// Le pedimos al usuario otro número entero
		System.out.println("Escribe otro");
		// Leemos el número
		num3 = sc.nextInt();
		// Mostramos el resultado en función de las siguientes condiciones
		if (num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1) {
			System.out.print("La suma de dos de los números nos da el restante: "); /* Se muestra esta afirmación si se
																					 cumple que la suma de dos de
																					ellos nos da el restante */
			// Dentro ponemos otra condicion para que muestre el caso correspondiente
			if (num1 + num2 == num3) {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); /* Que la suma de los dos primeros sea
																					// igual al tercero */
			} else if (num1 + num3 == num2) {
				System.out.println(num1 + " + " + num3 + " = " + (num1 + num3));/* Que la suma del primero y el tercero
																				 sea igual al segundo */
			} else if (num2 + num3 == num1) {
				System.out.println(num2 + " + " + num3 + " = " + (num2 + num3)); /* Que la suma de los dos últimos sea
																					 igual al primero */
			}
		} else {
			System.out.println("No hay ninguna relación entre estos números"); /* Se muestra esta afirmación si no se
																				 cumple ninguna de las condiciones
																				 anteriores */
		}
		// Cerramos el scanner
		sc.close();
	}

}
