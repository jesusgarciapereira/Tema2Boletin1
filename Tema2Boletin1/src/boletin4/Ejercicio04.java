package boletin4;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int tablaDel;
		int numFactor = 1;
		int multiplicacion;

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número y te mostraré su tabla de multiplicar");
		tablaDel = sc.nextInt();
		if (tablaDel <= 0)
			System.out.println("Número incorrecto");
		else {
			do {
				multiplicacion = tablaDel * numFactor;
				System.out.println(tablaDel + " x " + numFactor + " = " + multiplicacion);
				numFactor++;
			} while (numFactor <= 10);
		}
		sc.close();

	}

}
