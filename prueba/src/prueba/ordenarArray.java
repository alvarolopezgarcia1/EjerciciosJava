package prueba;

import java.util.Arrays;

public class ordenarArray {

	public static void main(String[] args) {

// Array a ordenar:
		int[] intArray = { 3, 2, 8, 5, 7, 9 };
// Método "sort" para ordenar el array
		Arrays.sort(intArray);

		for (int i = 0; i < intArray.length; i++) {

			System.out.print(i);
		}

		System.out.println();
		for (int i : intArray) {

			System.out.print(i);
		}

	}
}