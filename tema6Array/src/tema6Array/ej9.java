/*Realiza un programa que pida 8 números enteros y que luego muestre esos 
números junto con la palabra “par” o “impar” según proceda.*/

package tema6Array;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] x = new int[8];

		int i;

		int par;

		int impar;

		int aux;

		System.out.println("Introduzca 10 numeros enteros");

		for (i = 0; i < x.length; i++) {

			x[i] = s.nextInt();

			aux = x[i];
			;
			if (aux % 2 == 0) {

				par = aux;

				System.out.println(aux + " es par");
			} else {

				impar = aux;

				System.out.println(aux + " es impar");
			}

		}

	}

}
