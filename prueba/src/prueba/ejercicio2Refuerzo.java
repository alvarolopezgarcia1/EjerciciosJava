package prueba;

import java.util.Scanner;

public class ejercicio2Refuerzo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n;

		System.out.println("Por favor introduce el tamaño que tendrá el arreglo");
		n = s.nextInt();

		// int array[] = new int[n];

		System.out.println("Introduzca ahora tantos numeros enteros como espacios hayas reservado");

		/*
		 * for (int i = 0; i <n; i++) {
		 * 
		 * array[i] = s.nextInt();
		 * 
		 * }
		 */
		int a[] = devolverArray(n);
		imprimirArray(a);

	}

	public static void imprimirArray(int[] c) {

		for (int i = c.length - 1; i >= 0; i--) {

			System.out.println(c[i]);
		}

	}

	public static int[] devolverArray(int n) {
		int[] array = new int[n];
		Scanner S = new Scanner(System.in);
		for (int i = 0; i < n; i++) {

			array[i] = S.nextInt();

		}

		return array;
	}

}