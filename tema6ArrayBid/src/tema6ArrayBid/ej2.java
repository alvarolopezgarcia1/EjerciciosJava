
/*Escribe un programa que pida 20 números enteros. Estos números se deben 
introducir en un array de 4 filas por 5 columnas. El programa mostrará las 
sumas parciales de filas y columnas igual que si de una hoja de cálculo se 
tratara. La suma total debe aparecer en la esquina inferior derecha.*/

package tema6ArrayBid;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int i;

		int[][] n = new int[4][5];
		System.out.println("Introduzca 20 numeros enteros");

		for (i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {

				n[i][j] = s.nextInt();
			}
		}
		
		for (i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {

			System.out.print(n[i][j] + " ");
			}
			
			System.out.println();
		}
		

	}

}
