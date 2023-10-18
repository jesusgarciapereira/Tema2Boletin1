package boletin4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int numPensado;
		String acierto;
		int min = 1; 
		int max = 101;
		Scanner sc = new Scanner(System.in);
		System.out.println("Piensa un número del 1 al 100 y trataré de adivinarlo");
		System.out.println("Luego me indicas si tu número es 'mayor', 'menor' o 'igual'");
		System.out.println("Pulsa INTRO para comenzar");
		sc.nextLine();
		Random r = new Random();
		
		do {
			numPensado = r.nextInt(min, max);
			System.out.println("¿Es el " + numPensado + "?");
			acierto = sc.nextLine();
				if (acierto.equalsIgnoreCase("mayor")) {
					min = numPensado + 1;
				} else if (acierto.equalsIgnoreCase("menor")) {
					max = numPensado;
				} else if (!acierto.equalsIgnoreCase("igual"))
				System.out.println("Recuerda, escribe 'mayor', 'menor' o 'igual'");
		} while (!acierto.equalsIgnoreCase("igual"));
		System.out.println("¡Qué bien!");
		sc.close();
	}
}
