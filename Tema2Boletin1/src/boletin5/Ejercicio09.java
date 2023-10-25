package boletin5;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		int num;
		boolean primo = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca un número para saber si es primo");
			num = sc.nextInt();
		} while (num < 1);
		if (num == 1)
			System.out.println("El número " + num + " no es primo porque él en sí es la unidad");
		else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					primo = false;
					break;
				}
			}
			if (primo == true)
				System.out.println("El número " + num + " es primo");
			else
				System.out.println("El número " + num + " no es primo");
		}
		sc.close();
	}

}
