/*Escribe un programa que pida 10 números por teclado y que luego muestre 
los números introducidos junto con las palabras “máximo” y “mínimo” al lado 
del máximo y del mínimo respectivamente.*/

package tema6Array;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] x = new int[10];

		int aux;

		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;

		int i;

		System.out.println("Introduzca 10 numeros enteros");

		for (i = 0; i < x.length; i++) {

			x[i] = s.nextInt();

			aux = x[i];

			if (aux < minimo) {

				minimo = aux;
			}

			if (aux > maximo) {

				maximo = aux;
			}

		}
		for (i = 0; i < 10; i++) {
			System.out.println("Indice " + i + " = " + x[i] + " maximo: " + maximo + " minimo: " + minimo);
		}
	}

}
