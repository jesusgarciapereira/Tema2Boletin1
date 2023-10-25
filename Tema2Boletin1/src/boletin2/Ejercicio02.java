package boletin2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Declaramos la variable numero que le pediremos al usuario
		int numero;
		// Declaramos la variable de tipo String diaSemana que mostraremos
		String diaSemana;
		// Activamos el scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que escriba un número
		System.out.println("Escriba un número");
		// Leemos el número
		numero = sc.nextInt();
		// Establecemos la relación de las variables en función del valor del número
		diaSemana = switch (numero) {
		case 1 -> 
			 "Lunes";
		
		case 2 -> 
			 "Martes";
		
		case 3 -> 
			 "Miércoles";
		
		case 4 -> 
			 "Jueves";
		
		case 5 -> 
			 "Viernes";
		
		case 6 -> 
			 "Sábado";
		
		case 7 -> 
			 "Domingo";
		
		default -> 
			 "'Número incorrecto'";
		
		};
		// Mostramos el resultado
		System.out.println("El número " + numero + " corresponde al " + diaSemana);
		// Cerramos el scanner
		sc.close();
	}
}
