package prueba;

import java.util.Scanner;

public class ejercicio8Tema5Extra {

	public static void main(String[] args) {

		int num = -1;

		Scanner s = new Scanner(System.in);

		do {
			System.out.println(
					"Introduce un numero entero por pantalla y te daré su cuadrado si introduce un 0 saldrás del programa");
			num = s.nextInt();

			if (num == 0) {
				System.out.println("Lo siento, ha introducido un 0");
			}

			int cuadrado = num * num;
			if (num != 0) {
				System.out.println("El cuadrado es " + cuadrado);
			}

		} while (num != 0);

	}

}
