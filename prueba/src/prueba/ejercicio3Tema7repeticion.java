//Escribe un programa que lea 10 n�meros por teclado y que luego los muestre en orden inverso, es decir, el primero que se introduce es el �ltimo en 
//mostrarse y viceversa.

package prueba;

import java.util.Scanner;

public class ejercicio3Tema7repeticion {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] n = new int[10];
		int i;
		
		System.out.println("Por favor, introduzca 10 n�meros enteros.");
		
		System.out.println("Pulse la tecla INTRO despu�s de introducir cada n�mero.");
		for (i = 0; i < 10; i++) {
			n[i] = s.nextInt();
		}
		System.out.println("\nLos n�meros introducidos, al rev�s, son los siguientes:");
		for (i = 9; i >= 0; i--) {
			System.out.println(n[i]);
		}
	}
}
