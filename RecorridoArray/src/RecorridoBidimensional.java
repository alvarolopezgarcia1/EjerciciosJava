import java.util.*;

public class RecorridoBidimensional {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[][] vector = new int[5][5];

		// rellenamos el array bidimensional valores aleatorios
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				vector[i][j] = (int) (Math.random() * 100);
			}

		}

		// pedimos filas y columnas al usuario

		System.out.println("Introduce fila");

		int fila = s.nextInt();

		System.out.println("Introduce columna");

		int columna = s.nextInt();

		// mostramos el array completo

		System.out.println("Array completo");

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print(vector[i][j] + ", ");
			}
			System.out.println();
		}

		// mostramos array con filas y columnas dadas por usuario

		System.out.println("Subarray");

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {

				System.out.print(vector[i][j] + ", ");
			}
			System.out.println();
		}

		// con este array auxiliar almacenamos los numeros repetidos, como es 100
		// el maximo ponemos un tamaño de array 99

		int contador[] = new int[99];

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {

				contador[vector[i][j]]++;

			}

		}

		// mostramos cuantas veces se ha repetido un numero
		for (int i = 0; i < contador.length; i++) {

			if (contador[i] > 0) {

				System.out.println("El numero " + i + "aparece " + contador[i] + " veces");
			}
		}
	}

}
