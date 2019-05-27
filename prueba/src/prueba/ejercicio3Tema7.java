//Modifica el programa anterior de tal forma que los números que se introducen 
//en el array se generen de forma aleatoria (valores entre 100 y 999).

package prueba;

public class ejercicio3Tema7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] n = new int[4][5]; // filas, columnas

		int i;

		int j;

		for (i = 0; i < 4; i++) {

			for (j = 0; j < 5; j++) {
				n[i][j] = (int) (Math.random() * 900 + 100);

			}
		}

		int sumaFila = 0;

		for (i = 0; i < 4; i++) {

			for (j = 0; j < 5; j++) {

				System.out.print("    " + n[i][j]);

				sumaFila += n[i][j];

			}

			System.out.print("  La suma de la columna es: " + sumaFila);

			System.out.println("");

		}

		for (j = 0; j < 5; j++) {

			for (i = 0; i < 4; i++) {

				System.out.print("    " + n[i][j]);

				sumaFila += n[i][j];

			}

			System.out.print("         La suma de la fila es " + sumaFila);
			System.out.println("");
		}

	}

}
