/*Ejercicio 1 
Define un array de n�meros enteros de 3 filas por 6 columnas con nombre num 
y asigna los valores seg�n la siguiente tabla. Muestra el contenido de todos 
los elementos del array dispuestos en forma de tabla como se muestra en la 
figura.*/

package prueba;

public class Ejer1Tema7Bid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] n = new int[3][6]; // array de 3 filas por 6 columnas
		n[0][0] = 0;
		n[1][0] = 75;
		n[0][1] = 30;
		n[0][2] = 2;
		n[2][2] = -2;
		n[1][4] = 0;
		n[0][5] = 5;
		n[2][5] = 11;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 6; j++) {

				System.out.print(n[i][j] + "  ");
			}

			System.out.println();
		}

	}

}
