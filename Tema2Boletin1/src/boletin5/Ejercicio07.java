package boletin5;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int factorialDe;
		int resultadoFactorial = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Elije un número entero a partir del 0, para calcular su factorial");
			factorialDe = sc.nextInt();
		} while (factorialDe < 0);
			for (int i = 1; i <= factorialDe; i++) {
				resultadoFactorial *= i;
			}
		System.out.println("!" + factorialDe + " = " + resultadoFactorial);
		sc.close();
	}

}
