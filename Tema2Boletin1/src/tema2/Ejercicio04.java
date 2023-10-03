package tema2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Declaramos las variables num1 y num2, para ordenarlos de mayor a menor
		double num1, num2;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir en la consola decimales con punto
		sc.useLocale(Locale.US);
		// Le pedimos al usuario un número
		System.out.println("Introduzca un número");
		// Leemos el número
		num1 = sc.nextDouble();
		// Le pedimos al usuario un número
		System.out.println("Introduzca otro número");
		// Leemos el número
		num2 = sc.nextDouble();
		// Si el primer número es mayor que el segundo, me los mostrará en el mismo orden
		if (num1 > num2) {
			System.out.println("Ambos números ordenados de mayor a menor serían " + num1 + " y " + num2);
			// Si ambos números son iguales, me los mostrará tal cual
		} else if (num1 == num2) {
			System.out.println("En este caso, ambos números son iguales\n" + num1 + " = " + num2);
		}
		// Si el primer número es menor que el segundo, me los mostrará en orden inverso
		else {
			System.out.println("Ambos números ordenados de mayor a menor serían " + num2 + " y " + num1);
		}
		// Cerramos el Scanner
		sc.close();

	}

}
