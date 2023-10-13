package boletin3;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int suma = 0;
		// Valor que vamos a leer del teclado
		int numero;
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		// Pedimos un numero al usuario
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		while (numero >= 0) {

			System.out.println("A " +suma + " le sumamos " + numero + " y nos da "+ (suma += numero) + "\nIntroduzca otro número. Valor negativo para salir");
			numero = sc.nextInt();
		}
		// Imprimimos el resultado de la suma
		System.out.println("Suma total: " + suma);
		sc.close();
	}

}
