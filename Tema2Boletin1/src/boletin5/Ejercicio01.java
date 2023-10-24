package boletin5;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a contar desde el 1 hasta el número que tú elijas");
		System.out.println("Elige un número");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) 
			System.out.println(i);
		sc.close();
	}

}
