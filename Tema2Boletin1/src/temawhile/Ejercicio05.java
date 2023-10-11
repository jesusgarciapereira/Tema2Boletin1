package temawhile;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int numero;
		int sumaPositivos = 0;
		int sumaNegativos = 0;
		int mediaNegativos = 0;
		int contadorCeros = 0;
		int contadorNegativos = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba diez números enteros");
		while (i < 10) {
			numero = sc.nextInt();
			i++;
			if (numero > 0) {
				sumaPositivos += numero;
			} else if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
			} else {
				contadorCeros++;
			}
		}
		mediaNegativos = sumaNegativos / contadorNegativos;
		System.out.println("La suma de todos los positivos es " + sumaPositivos);
		System.out.println("La media de todos los negativos es " + mediaNegativos);
		System.out.println("El número de ceros es de " + contadorCeros);
		sc.close();
	}

}
