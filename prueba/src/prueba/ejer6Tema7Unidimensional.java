/*Ejercicio 6 
Escribe un programa que lea 15 números por teclado y que los almacene en un 
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en 
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.*/

//desplaza una posicion a la derecha una posicion del array

package prueba;

import java.util.Scanner;

public class ejer6Tema7Unidimensional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int array[] = new int[15];

		System.out.println("Introduzca 15 numeros enteros");

		for (int i = 0; i < 15; i++) {

			array[i] = sc.nextInt();}

			int aux = array[14];
			for (int i = 14; i > 0; i--) {
				array[i] = array[i - 1];
			}
			array[0] = aux;
		
		for (int j = 0; j < 15; j++) {

			System.out.print(array[j] + " ");
		}
	}

}
