package tema2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Declaramos las variables num1, num2 y num3, para ordenarlos de mayor a menor
		double num1, num2, num3;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir en la consola decimales con punto
		sc.useLocale(Locale.US);
		// Le pedimos al usuario un número
		System.out.println("Introduzca un número");
		// Leemos el número
		num1 = sc.nextDouble();
		// Le pedimos al usuario otro número
		System.out.println("Introduzca otro número");
		// Leemos el número
		num2 = sc.nextDouble();
		// Le pedimos al usuario otro número
		System.out.println("Introduzca otro número");
		// Leemos el número
		num3 = sc.nextDouble();
		// Mostramos la primera parte del resultado
				System.out.print("Los números ordenados de mayor a menor serían: ");
				// La segunda parte del resultado dependerá de las siguientes condiciones
		if (num1 >= num2 && num2 >= num3) {
			System.out.println(num1 + ", " + num2 + " y " + num3);
		} else if (num1 >= num3 && num3 > num2) {
			System.out.println(num1 + ", " + num3 + " y " + num2);
		} else if (num2 > num1 && num1 >= num3) {
			System.out.println(num2 + ", " + num1 + " y " + num3);
		} else if (num2 >= num3 && num3 > num1) {
			System.out.println(num2 + ", " + num3 + " y " + num1);
		} else if (num3 > num1 && num1 >= num2) {
			System.out.println(num3 + ", " + num1 + " y " + num2);
		} else {
			System.out.println(num3 + ", " + num2 + " y " + num1);
		}
		// Cerramos el Scanner
		sc.close();
	}
	

}
