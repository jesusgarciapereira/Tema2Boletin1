package boletin3;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int edad;
		int suma = 0;
		int mediaEdad;
		int i = 0;
		int contadorMayoresDeEdad = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la edad del alumno");
		edad = sc.nextInt();

		while (edad > 0) {
			suma += edad;
			System.out.println("Introduzca la edad de otro alumno (negativo para acabar)");
			edad = sc.nextInt();
			i++;
			if (edad >= 18) {
				contadorMayoresDeEdad++;
			}
		}
		System.out.println("La suma de todas las edades es de " + suma + " años");
		if (edad < 0) {
			System.out.println("Ha introducido un número negativo");
		} else {
			mediaEdad = suma / i;
			System.out.println("La edad media es de " + mediaEdad + " años");
		}
		System.out.println("En total hay " + i + " alumnos");
		System.out.println(contadorMayoresDeEdad + " son mayores de edad");

		sc.close();

	}

}
