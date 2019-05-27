
//Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
//los 5 primeros números enteros a partir de uno que se introduce por teclado.

import java.util.*;

public class ej11 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);

		int numIntroducido;

		System.out.println("Introduce un numero, te daré el resultado de los 5 primeros cubos y cuadrados");

		numIntroducido = s.nextInt();

		for (int i = 0; i < 5; i++) {

			int cuadrado = numIntroducido * numIntroducido;

			int cubo = numIntroducido * numIntroducido * numIntroducido;

			System.out.println(cuadrado + "  " + cubo);

			numIntroducido++;

		}
	}
}
