package boletin2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Declaramos la variable nota, de tipo entero
		int nota;
		// Declaramos la variable calificacion, de tipo String
		String calificacion;
		// Activamos el scanner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que escriba su nota (en número)
		System.out.println("Escriba su nota (en número)");
		// Leemos el número
		nota = sc.nextInt();
		// Asignamos el valor de la calificación, en función del valor numérico de nota
		calificacion = switch (nota) {
		case 0, 1, 2, 3, 4 -> 
			 "Insuficiente"; /* Si la nota es 0, 1, 2, 3 ó 4; la calificación tendrá el valor de
									 "Insuficiente" */
		
		case 5 -> 
			 "Suficiente"; // Si la nota es 5; la calificación tendrá el valor de "Suficiente"
		
		case 6 -> 
			 "Bien"; // Si la nota es 6; la calificación tendrá el valor de "Bien"
		
		case 7, 8 -> 
			 "Notable"; // Si la nota es 7 u 8; la calificación tendrá el valor de "Notable"
		
		case 9, 10 -> 
			 "Sobresaliente"; // Si la nota es 9 ó 10; la calificación tendrá el valor de "Sobresaliente"
		
		default -> 
			 "Nota incorrecta"; /* Si la nota no tiene ningún valor de los anteriores; la calificación tendrá el
										 valor de "Nota incorrecta" */
		
		};
		// Mostramos el resultado
		System.out.println("Su nota es de: " + calificacion);
		// Cerramos el scanner
		sc.close();
	}

}
