package boletin5;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int numA, numB;
		Scanner sc = new Scanner(System.in);
		System.out.println("Números enteros entre dos elegidos");
		System.out.println("Introduzca un número");
		numA = sc.nextInt();
		System.out.println("Introduzca otro número");
		numB = sc.nextInt();
		if (numB > numA) {
			for (int i = numA; i <= numB; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = numA; i >= numB; i--) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
