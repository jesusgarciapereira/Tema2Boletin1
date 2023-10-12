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
		System.out.println("Escriba diez números enteros (separados por un INTRO)");
		while (i < 10) {
			numero = sc.nextInt();
			if (numero > 0) {
				sumaPositivos += numero;
			} else if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
			} else {
				contadorCeros++;
			}
			i++;
		}
		System.out.println("La suma de todos los positivos es " + sumaPositivos);
		if (contadorNegativos != 0) {
			mediaNegativos = sumaNegativos / contadorNegativos;
			System.out.println("La media de todos los negativos es " + mediaNegativos);
		} else {System.out.println("No se ha escrito ningún número negativo");}
		System.out.println("El número de ceros es de " + contadorCeros);
		sc.close();
	}

}
