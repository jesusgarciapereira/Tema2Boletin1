package boletin5;

public class Ejercicio06 {

	public static void main(String[] args) {
		int numImpar = 1;
		int sumaImpares = 0;
		for (int i = 0; i < 10; i++) {
			sumaImpares += numImpar;
			numImpar += 2;
		}
		System.out.println("La suma de los 10 primeros números impares es de: " + sumaImpares);
	}

}
