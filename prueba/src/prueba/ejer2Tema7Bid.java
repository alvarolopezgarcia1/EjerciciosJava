/*Ejercicio 2 
Escribe un programa que pida 20 números enteros. Estos números se deben 
introducir en un array de 4 filas por 5 columnas. El programa mostrará las 
sumas parciales de filas y columnas igual que si de una hoja de cálculo se 
tratara. La suma total debe aparecer en la esquina inferior derecha.*/

package prueba;

import java.util.Scanner;

public class ejer2Tema7Bid {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[][] n = new int[4][5]; // filas, columnas

		System.out.println("Introduzca 20 numeros enteros");

		int i;

		int j;

		for (i = 0; i < 4; i++) {

			for (j = 0; j < 5; j++) {
				n[i][j] = s.nextInt();

			}
		}

		int sumaFila = 0;

		for (i = 0; i < 4; i++) {

			for (j = 0; j < 5; j++) {

				System.out.print("%6d " + n[i][j]);

				sumaFila += n[i][j];

			}

			System.out.print("       " + "La suma es: " + sumaFila);

			System.out.println("");

		}

		for (j = 0; j < 5; j++) {

			for (i = 0; i < 4; i++) {

				System.out.print("   " + n[i][j]);

				sumaFila += n[i][j];

			}

			System.out.print("       " + "La suma es " + sumaFila);

			System.out.println("");

		}
	}

}