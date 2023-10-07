package boletin1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * Declaramos las variables a, b y c; serán los coeficientes de una ecuación de
		 * segundo grado
		 */
		double a, b, c;
		/*
		 * Declaramos la variable x1 y x2; serán las dos posibles soluciones de nuestra
		 * ecuación. Creo también x0 que es para casos en los que no sea una ecuación de
		 * segundo grado
		 */
		double x1, x2, x0;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir en la consola decimales con punto
		sc.useLocale(Locale.US);
		// Presentamos el programa
		System.out.println("Vamos a crear una ecuación de segundo grado tal que así: ax^2 + bx + c = 0");
		// Le pedimos al usuario que elija un valor para a
		System.out.println("Elije un valor para 'a'");
		// Leemos la variable a
		a = sc.nextDouble();
		// Le pedimos al usuario que elija un valor para b
		System.out.println("Elije un valor para 'b'");
		// Leemos la variable b
		b = sc.nextDouble();
		// Le pedimos al usuario que elija un valor para c
		System.out.println("Elije un valor para 'c'");
		// Leemos la variable c
		c = sc.nextDouble();
		// Mostramos cómo quedaría la ecuación con las variables que hemos pedido
		System.out.println("Así queda la ecuación: " + a + "x^2 + " + b + "x + " + c + " = 0");
		// Mostramos la primera parte del resultado
		System.out.print("La solución es: ");
		// Mostramos el resultado de la ecuación, en caso de que x no sea un número real
		if ((Math.pow(b, 2) - 4 * a * c) < 0) {
			System.out.println("En este caso x no es un número real");
		}
		// En caso de que no sea una ecuación de segundo grado
		else if (a == 0) {
			x0 = -c / b;
			System.out.println("x = " + x0);
		}
		// En los demás casos, ecuación de segundo grado con dos incógnitas
		else {
			x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
			x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
			System.out.println("x = " + x1 + ", x = " + x2);
		}
		// Cerramos el Scanner
		sc.close();
	}
}
