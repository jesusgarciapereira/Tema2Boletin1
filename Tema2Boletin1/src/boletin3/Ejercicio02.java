package boletin3;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int numero;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		while (numero >= 0) {
			System.out.println("Introduzca otro número. Negativo para acabar");
			numero = sc.nextInt();
			i++;
		}
		System.out.println("En total hay " + i + " números");
		sc.close();
	}

}
