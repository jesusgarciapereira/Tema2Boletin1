package boletin5;

public class Ejercicio03 {

	public static void main(String[] args) {
		System.out.println("Múltiplos de 7, menores que 100");
		for (int i = 1; i < 100; i++) 
			if (i % 7 == 0) 
				System.out.println(i);
	}
}
