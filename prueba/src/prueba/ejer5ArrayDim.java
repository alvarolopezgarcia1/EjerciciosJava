/*Ejercicio 5 
Escribe un programa que pida 10 números por teclado y que luego muestre 
los números introducidos junto con las palabras “máximo” y “mínimo” al lado 
del máximo y del mínimo respectivamente.*/

package prueba;

import java.util.Scanner;

public class ejer5ArrayDim {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int array[] = new int[10];

		int minimo = Integer.MAX_VALUE;

		int maximo = Integer.MIN_VALUE;

		System.out.println("Por favor introduzca 10 numeros enteros y te diré cual es el máximo y el mínimo");

		for (int i = 0; i < 10; i++) {

			array[i] = sc.nextInt();

			if (array[i] < minimo) {

				minimo = array[i];
			}

			if (array[i] > maximo) {

				maximo = array[i];
			}

		}

		for (int i = 0; i < 10; i++) {
			System.out.println(array[i]);

			if (array[i] == minimo) {

				System.out.print(" minimo");
			}

			if (array[i] == maximo) {

				System.out.print(" maximo");
			}

		}
	}
}
