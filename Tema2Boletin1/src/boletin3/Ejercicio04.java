package boletin3;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		while (numero != 0) {
			if (numero % 2 == 0) {
				System.out.println(numero + " es par");
			} else {
				System.out.println(numero + " es impar");
			}
			System.out.println("Introduzca otro número. Elija 0 para acabar");
			numero = sc.nextInt();
		}
		sc.close();
	}

}
