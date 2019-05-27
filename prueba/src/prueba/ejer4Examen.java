package prueba;


import java.util.Scanner;

public class ejer4Examen {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce números entre 1 y 100, teclea -1 para salir del programa");
		int numero;
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = 0;
		}
		int cont = 0;
		do {
			numero = s.nextInt();
			if (numero != -1 && numero > 0 && numero < 101) {
				array[numero] = array[numero] + 1;
			} else if (numero != -1) {
				System.out.println("numero no valido");
			}
		} while (numero != -1);

		System.out.println("Frecuencia:");
		for (int i = 0; i < 100; i++) {
			if (array[i] != 0) {
				System.out.print(i + ": ");
				for (int j = 0; j < array[i]; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}

		}

	}

}
