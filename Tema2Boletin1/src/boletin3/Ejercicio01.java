package boletin3;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int numero;
		/*
		 * Decalaramos la variable de la suma que incrementaremos, por eso la
		 * inicializamos en 0
		 */
		int suma = 0;
		// Activamos el scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario un número
		System.out.println("Introduzca un número");
		// Leemos el número
		numero = sc.nextInt();
		/*
		 * Mientras el número sea mayor o igual que 0, se repetiran las siguientes
		 * instrucciones
		 */
		while (numero >= 0) {
			// Mostramos el resultado provisional y le pedimos al usuario otro número
			System.out.println("A " + suma + " le sumamos " + numero + " y nos da " + (suma += numero)
					+ "\nIntroduzca otro número. Valor negativo para salir");
			// Leemos el nuevo número
			numero = sc.nextInt();
		}
		// Mostramos el resultado final
		System.out.println("Suma total: " + suma);
		// Cerramos el scanner
		sc.close();
	}

}
