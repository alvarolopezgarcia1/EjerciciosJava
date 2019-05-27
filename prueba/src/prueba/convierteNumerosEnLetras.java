package prueba;

import java.util.Scanner;

public class convierteNumerosEnLetras {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		String numeroComoCadena;
		System.out.print("Introduce un valor entero: ");
		numero = s.nextInt();
		numeroComoCadena = convierteEnPalabras(numero);

		System.out.println("El número " + numero + " tiene las siguientes cifras:");
		System.out.println(numeroComoCadena);

	}

	public static String convierteEnPalabras(int n) {
		String resultado = "";
		String[] cifras = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
		boolean primeraPasada = true;

		if (n == 0) {
			resultado += cifras[0];
		} else {
			do {
				if (primeraPasada) {
					resultado = cifras[n % 10];
					primeraPasada = false;
				} else {
					resultado = cifras[n % 10] + ", " + resultado;
				}
				n = n / 10;
			} while (n > 0);
		}

		return resultado;
	}
}
