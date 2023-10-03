package tema2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Declaramos la variable numero, para saber si es par
		int numero;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario un número
		System.out.println("Introduzca un número");
		// Leemos el número
		numero = sc.nextInt();
		// Mostramos la primera parte del resultado
		System.out.print("El número " + numero + " ");
		// La segunda parte del resultado dependerá de las siguientes condiciones
		
		// Si el módulo de 2 es 0 mostrará que es par
		if (numero % 2 == 0) {
			System.out.println("es par");
		}
		// Si no se cumple lo anterior, mostrará que es impar
		else {
			System.out.println("es impar");
		}
		// Cerramos el Scanner
		sc.close();
	}
}
