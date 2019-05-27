//multiplicacion rarita

//Alvaro

import java.util.*;

public class ejer2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce dos valores enteros");

		int a = s.nextInt();

		int b = s.nextInt();

		System.out.println(multiplicandoRaro(a,b));

	}

	public static int multiplicandoRaro(int a, int b) {
		int resultado = 0;

		if (a < b) {
			int aux = b;
			b = a;
			a = aux;
		}

		int pasada = 1;

		while (b > 0) {

			int cifra1 = a % 10;
			int cifra2 = b % 10;
			resultado = ((cifra1 * cifra2) % 10) * pasada + resultado;
			pasada *= 10;
			a = a / 10;
			b = b / 10;
		}

		resultado = a * pasada + resultado;
		return resultado;

	}
}
