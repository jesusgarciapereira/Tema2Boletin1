package boletin3;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		int tamannioArbol;
		int tamannioMasAlto = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del árbol (en centímetros)");
		tamannioArbol = sc.nextInt();
		while (tamannioArbol != -1) {
			if (tamannioArbol > tamannioMasAlto) {
				tamannioMasAlto = tamannioArbol;
			}
			System.out.println("Introduzca el tamaño de otro árbol (en centímetros), -1 para terminar");
			tamannioArbol = sc.nextInt();
		}
		if (tamannioMasAlto <= 0) {
			System.out.println("Las alturas anteriores no son correctas");
		} else {
			System.out.println("El árbol más alto mide " + tamannioMasAlto + " cm");
		}
		sc.close();
	}

}
