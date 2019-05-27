import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {

		int[][] tablero = new int[9][9];

		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca 9 lineas de 9 dígitos");

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				tablero[i][j] = s.nextInt();
			}

		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				System.out.print(tablero[i][j]);

			}

			System.out.println();

		}

		boolean repetido = false;

		// iterar por filas para saber si está repetido algun numero en la fila
		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 9; j++) {
				for (int k = 0; k < j && !repetido; k++) {

					if (tablero[i][j] == tablero[i][k]) {

						repetido = true;
					}
				}

			}

		}

		// itera por columna para saber si esta repetido, fijarse como jugamos con la i
		// la j para recorrerla
		for (int j = 0; j < 9; j++) {

			for (int i = 0; i < 9; i++) {
				for (int k = 0; k < i && !repetido; k++) {

					if (tablero[i][j] == tablero[k][j]) {

						repetido = true;
					}
				}

			}

		}

		// iterar por segmentos de 3

		for (int o = 0; o < 3; o++) {
			for (int p = 0; p < 3; p++) {
				// fija el subgrupo de 3x3

				// a continuacion, linealizamos 3x3 en 1x9
				int[] lineal = new int[9];
				for (int i = 0; i < 3; i++) {

					for (int j = 0; j < 3; j++) {
						lineal[i * 3 * j] = tablero[o * 3 + i][p * 3 + j];

					}

				}

				// se comprueba si se repite

				for (int i = 0; i < 9 && !repetido; i++) {

					for (int k = 0; k < i && !repetido; k++) {

						if (lineal[i] == lineal[k]) {

							repetido = true;
						}
					}

				}
			}

		}
	}
}
