package boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número entero");
		num1 = sc.nextInt();
		System.out.println("Escribe otro");
		num2 = sc.nextInt();
		System.out.println("Escribe otro");
		num3 = sc.nextInt();
		if (num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1) {
			System.out.print("La suma de dos de los números nos da el tercero: ");
			if (num1 + num2 == num3) {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			} else if (num1 + num3 == num2) {
				System.out.println(num1 + " + " + num3 + " = " + (num1 + num3));
			} else if (num2 + num3 == num1) {
				System.out.println(num2 + " + " + num3 + " = " + (num2 + num3));
			}
		} else {
			System.out.println("No hay ninguna relación entre estos números");
		}
		sc.close();
	}

}
