/*Implemente un programa que dé a elegir al usuario entre rellenar un vector de números enteros de forma
aleatoria con valores aleatorios entre un número A aleatorio elegido entre 110 y 212 y otro número B aleatorio
elegido entre 301 y 457 (ambos incluidos), o rellenarlo desde el teclado. El tamaño del vector se le pedirá al
usuario previamente. No debe haber valores repetidos.
Una vez relleno, el programa presentará el vector por pantalla, y mostrará la cantidad de veces que aparecen
los dígitos, desde el 0 hasta el 9, a lo largo de todos los números.
Se valorará el uso de funciones.*/

//Álvaro López

import java.util.*;

public class ej1 {

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
			System.out.println("2. Aleatorio entre 301 y 457");
			System.out.println("3. Rellenarlo desde teclado");
			System.out.println("4. Para salir introduzca -1");
			System.out.print("Introduzca una opción: ");
			opcion = s.nextInt();

			switch (opcion) {

			case 1:
				for (int i = 0; i < tamanio; i++) {
					vector[i] = (int) (Math.random() * 103 + 110);
					System.out.print(vector[i] + ": ");
					int num = vector[i];

					imprimirRepetidos(num);

					System.out.println("");
				}

				break;

			case 2:
				for (int i = 0; i < tamanio; i++) {
					vector[i] = (int) (Math.random() * 157 + 301);
					System.out.print(vector[i] + ": ");
					int num = vector[i];

					imprimirRepetidos(num);

					System.out.println("");
				}

				break;

			case 3:
				for (int i = 0; i < tamanio; i++) {
					System.out.println(
							"El tamaño del array es: " + tamanio + " Introduce numeros enteros para rellenarlo");
					vector[i] = s.nextInt();

				}
				for (int i = 0; i < tamanio; i++) {

					System.out.print(vector[i] + ": ");
					int num = vector[i];

					imprimirRepetidos(num);

					System.out.println("");
				}

				break;

			}

		} while (salir == -1);

	}

	public static void imprimirRepetidos(int number) {
		int[] cont = new int[10]; // cuenta la cantidad de apariciones de cada digito
		int digito;
		while (number > 0) {
			digito = (int) (number % 10);
			cont[digito]++;
			number /= 10;
		}
		for (digito = 0; digito < 10; digito++) {
			if (cont[digito] > 0)
				System.out.println("El digito " + digito + " se repite " + cont[digito] + " veces");
		}
	}

}
