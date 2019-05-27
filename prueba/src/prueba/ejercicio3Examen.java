
package prueba;

import java.util.Scanner;

public class ejercicio3Examen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("introduce un numero: ");
		int x = s.nextInt();
		int[] array = new int[x];
		for (int i = 2; i < x; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					array[i] = array[i] + j;
				}
			}
			if (array[i] == i) {
				System.out.println(i);
			}
		}

	}

}
