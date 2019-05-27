/*Ejercicio 9 
Realiza un programa que pida 8 números enteros y que luego muestre esos 
números junto con la palabra “par” o “impar” según proceda.*/

package prueba;

import java.util.Scanner;

public class ejer9tema7Unidimensionales {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int array[] = new int[8];

		System.out.println("Por favor introduzca 8 numeros");

		for (int i = 0; i < 8; i++) {

			array[i] = s.nextInt();
		}

		for (int i = 0; i < 8; i++) {

			if (array[i] % 2 == 0) {

				System.out.println(array[i] + " par");

			} else {

				System.out.println(array[i] + " impar");

			}
		}

	}

}
