package examen3;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce valores al array,y te devolveré aquellos numeros que no incluyan el 7");

		int tama = pedirTamanioArray();

		int[] array = new int[tama];

		int[] num = new int[tama];

		introduceValores(array);

		presentaPorPantalla(array);

	}

	public static int pedirTamanioArray() {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce el tamaño del array: ");

		int tamanio = s.nextInt();
		return tamanio;
	}

	public static void introduceValores(int[] array) {

		Scanner s = new Scanner(System.in);

		System.out.print("Introduce valores: ");

		for (int i = 0; i < array.length; i++) {

			array[i] = s.nextInt();
		}

	}

	public static void presentaPorPantalla(int[] array) {
		System.out.println();
		

		for (int elemento : array) {
			if (elemento == 7) {
				System.out.print(" ");
			} else {
				System.out.print(elemento + " ");
			}
		}

	}

}
