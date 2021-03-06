
/* Implemente un programa que dé a elegir al usuario entre rellenar un vector de números enteros de forma
aleatoria con valores entre 201 y 301, o rellenarlo desde el teclado. El tamaño del vector se le pedirá al
usuario previamente.
A continuación, el programa desordenará aleatoriamente dicho vector, de manera que en cada ejecución se
obtenga un resultado que, en la gran mayoría de los casos, ha de ser distinto a los anteriores.
Para hacer todo esto, implementar las funciones que considere oportunas, apoyándose en las estructuras de
datos que considere oportunas.
Una vez desordenado el vector inicial, el programa deberá mostrarnos el vector original y el vector resultante
del desdordenamiento para poder “ver” si los datos están en un orden distinto, y para que en base distintas
ejecuciones, partiendo de un mismo vector inicial, se obtengan vectores desordenados de distintas maneras.*/

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ej4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int tamanio;

		System.out.println("Introduce el tamaño del array");
		tamanio = s.nextInt();

		int salir = 0;
		int[] vector = new int[tamanio];
		int opcion;

		do {
			System.out.println("\n\nRELLENA ARRAY");
			System.out.println("===================");
			System.out.println("1. Aleatorio entre 110 y 212");
			System.out.println("2. Rellenarlo desde teclado");
			System.out.println("3. Para salir introduzca -1");
			System.out.print("Introduzca una opción: ");
			opcion = s.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("ARRAY ORIGINAL:");
				for (int i = 0; i < tamanio; i++) {
					vector[i] = (int) (Math.random() * 100 + 201);
					System.out.print(vector[i] + "| ");

				}

				System.out.println("");
				System.out.println("ARRAY DESORDENADO:");

				mezclandoArray(vector);

				for (int i = 0; i < vector.length; i++) {
					System.out.print(vector[i] + "| ");
				}

				break;

			case 2:

				System.out.println("El tamaño del array es: " + tamanio + " Introduce numeros enteros para rellenarlo");

				for (int i = 0; i < tamanio; i++) {

					vector[i] = s.nextInt();

				}

				System.out.println("ARRAY ORIGINAL:");
				for (int i = 0; i < tamanio; i++) {
					System.out.print(vector[i] + "| ");
				}

				System.out.println("");
				System.out.println("ARRAY DESORDENADO:");

				mezclandoArray(vector);

				for (int i = 0; i < vector.length; i++) {
					System.out.print(vector[i] + "| ");
				}

				break;

			}

		} while (salir == -1);

	}

	public static void mezclandoArray(int[] vector) {

		Random rnd = ThreadLocalRandom.current();
		for (int i = vector.length - 1; i > 0; i--) {
			int temp = rnd.nextInt(i + 1);
			int a = vector[temp];
			vector[temp] = vector[i];
			vector[i] = a;
		}
	}

}
