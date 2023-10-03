package tema2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Declaramos las variable num1 y num2
		int num1, num2;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario un número
		System.out.println("Escribe un número");
		// Leemos el número
		num1 = sc.nextInt();
		// Le pedimos al usuario otro número
		System.out.println("Escribe otro número");
		// Leemos el número
		num2 = sc.nextInt();
		// Mostramos la primera parte del resultado
		System.out.print("Los numeros " + num1 + " y " + num2 + " ");
		// La segunda parte del resultado dependerá de las siguientes condiciones

		// Si los valores de num1 y num2 son iguales, mostrará que son iguales
		if (num1 == num2) {
			System.out.println("son iguales");
		}
		// Si no se cumple lo anterior, mostrará que son diferentes
		else {
			System.out.println("son diferentes");
		}
		// Cerramos el Scanner
		sc.close();

	}

}
