package prueba;

import java.util.Scanner;

public class ejer3refuerzo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;

		System.out.println("Por favor introduzca el numero de palabras que quiere introducir");
		n = sc.nextInt();



		String[] arrayString = new String[n];

		String[] ordenado = new String[n];

		for (int i = 0; i < arrayString.length; i++) {

			System.out.println("Introduzca las palabra");

			arrayString[i] = sc.next();

			System.out.println(
					"Dele ahora un valor numerico entre 0 y un maximo del tamaño menos uno, no puede repetirse");
			
			int posicion=n-1;
			ordenado[posicion]=arrayString[i];

		}
		

		for (String aux : ordenado) {

			System.out.println(aux+" ");
		}

	}
}
