package boletin4;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int numInicial = 1;
		int suma = 0;
		int numIntroducido;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número, sumaré todos los números desde el 1 hasta el que tú quieras");
		numIntroducido = sc.nextInt();
		do {
			suma += numInicial;
			numInicial++;
		} while (numInicial <= numIntroducido);
		System.out.println(suma);
		sc.close();
	}
}
