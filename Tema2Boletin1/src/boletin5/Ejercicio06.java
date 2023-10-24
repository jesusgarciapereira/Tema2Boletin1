package boletin5;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int factorialDe;
		int resultadoFactorial = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Elije un número natural, para calcular su factorial");
		factorialDe = sc.nextInt();

		

			resultadoFactorial *= factorialDe;
		
		System.out.println("!" + factorialDe + " = " + resultadoFactorial);
		sc.close();
	}

}
