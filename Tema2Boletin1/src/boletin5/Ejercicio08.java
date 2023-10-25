package boletin5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		double calificacion;
		boolean suspenso = false;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		for (int i = 0; i < 5; i++) {
			do {
				System.out.println("Introduzca cinco calificaciones de alumnos (llevamos " + i + ")");
				calificacion = sc.nextDouble();
			} while (calificacion < 0);
			if (calificacion < 5) {
				suspenso = true;
				//break;
			}
		}
		if (suspenso == true)
			System.out.println("Hay algún suspenso");
		else
			System.out.println("No hay ningún suspenso");
		sc.close();
	}

}
