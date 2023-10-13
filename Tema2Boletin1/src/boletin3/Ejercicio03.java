package boletin3;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int numero;
		int suma = 0;
		int media;
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		while(numero >=0) {
			suma += numero;
			System.out.println("Introduzca otro número. Negativo para acabar");
			numero = sc.nextInt();
			i++;
		}
		media = suma/i;
		System.out.println("La media de todos los números es " + media);
		sc.close();
	}

}
