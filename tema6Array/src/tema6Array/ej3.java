/*Escribe un programa que lea 10 números por teclado y que luego los muestre 
en orden inverso, es decir, el primero que se introduce es el último en 
mostrarse y viceversa.*/

package tema6Array;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] x = new int[10];

		int i;

		System.out.println("Introduzca 10 numeros enteros");

		for (i = 0; i < x.length; i++) {

			x[i] = s.nextInt();

		}

		System.out.println();
		System.out.println("Array volteado");

		for (i = 9; i >= 0; i--) {

			System.out.print(x[i] + ", ");
		}

	}

}