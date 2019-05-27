package prueba;

import java.util.Scanner;

public class ejercicioRefuerzo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] Array = new int[5];

		System.out.println("Por favor introduzca 5 numeros enteros");

		for (int i = 0; i < 5; i++) {
			Array[i] = sc.nextInt();

		}

		System.out.println("");

		for (int i = Array.length - 1; i >= 0; i--) {
			System.out.print(Array[i] + " ");
		}
	}

}
