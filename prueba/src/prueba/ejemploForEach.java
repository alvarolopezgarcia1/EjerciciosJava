
package prueba;

import java.util.*;

public class ejemploForEach {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] vector = new int[6];

		//rellena el arraya con valores que le vayamos introduciendo
		for (int i = 0; i < 6; i++) {
			System.out.println("Introduce un dato: ");
			vector[i] = s.nextInt();
		}

		//imprime el array
		System.out.println();
		for (int auxiliar : vector) {
			System.out.println("Valor: " + auxiliar);
		}
	}
}
