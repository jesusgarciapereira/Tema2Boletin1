package boletin5;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int maximoElegido;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mostraré los múltiplos de 3, desde el 1 hasta el que tú elijas");
		System.out.println("Elije un número");
		maximoElegido = sc.nextInt();
		for (int i = 1; i <= maximoElegido; i++) 
			if (i % 3 == 0) 
				System.out.println(i);
		sc.close();

	}

}
