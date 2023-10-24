package boletin5;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int num;
		int total = 0;
		double media;
		int contador;
		Scanner sc = new Scanner(System.in);
		for (contador = 0; contador < 10; contador++) {
			System.out.println("Escribe diez números (llevamos " + contador + ")");
			num = sc.nextInt();
			total += num;
		}
		media = (double)total / contador;
		System.out.println("La media de todos los números es " + media);
		sc.close();
	}
}
