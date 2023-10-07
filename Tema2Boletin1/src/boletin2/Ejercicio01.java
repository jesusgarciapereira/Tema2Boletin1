package boletin2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int nota;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su nota");
		nota = sc.nextInt();
		System.out.print("Su nota es de: ");
		switch (nota) {
		case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente");
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7, 8 -> System.out.println("Notable");
		case 9, 10 -> System.out.println("Sobresaliente");
		default -> System.out.println("Nota incorrecta");
		}
		sc.close();
	}

}
