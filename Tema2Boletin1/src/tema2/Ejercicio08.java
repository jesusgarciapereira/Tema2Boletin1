package tema2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Declaramos las variables nota para asociarlo a una palabra
		double nota;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir en la consola decimales con punto
		sc.useLocale(Locale.US);
		// Le pedimos al usuario la nota
		System.out.println("Escriba el número de su nota");
		// Leemos el número
		nota = sc.nextDouble();
		// Mostramos la primera parte del resultado
		System.out.print("Con una nota de " + nota + " usted ha sacado un ");
		// La segunda parte del resultado dependerá de las siguientes condiciones
		if (nota >= 0 && nota < 5) {
			System.out.println("INSUFICIENTE");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("SUFICIENTE");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("BIEN");
		} else if (nota >= 7 && nota < 0) {
			System.out.println("NOTABLE");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("SOBRESALIENTE");
		} else {
			System.out.println("... muy gracioso, no vas a sacar más de un 10 en la vida");
		}
		// Cerramos el Scanner
		sc.close();
	}

}
