package prueba;

import java.util.Scanner;

public class ejercicio1repaso2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[][] n = new int[3][3];

		int contador = 0;

		System.out.println("Por favor introduzca 9 numeros enteros");

		int numero[] = new int[9];
		for (int i = 0; i < 9; i++) {
			numero[i] = s.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				n[i][j] = numero[contador];

				contador++;

			}

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(n[i][j] + " ");
				System.out.println("");

			}
		}

	}

}
