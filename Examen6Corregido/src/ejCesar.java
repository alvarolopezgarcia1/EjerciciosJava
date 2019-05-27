import java.util.*;

public class ejCesar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opcion;
		String entrada;
		String resultado;

		do {
			System.out.println("Elija una opción:");
			System.out.println("1.- Encriptar mensaje");
			System.out.println("2.- Desencriptar mensaje");
			System.out.println("0.- SALIR");

			opcion = Integer.parseInt(s.nextLine());
			switch (opcion) {
			case 1:
				System.out.print("Introduzca la frase: ");
				entrada = s.nextLine();
				resultado = encriptar(entrada);
				System.out.println("La frase encriptada es: " + resultado);
				break;
			case 2:
				System.out.print("Introduzca la frase encriptada: ");
				entrada = s.nextLine();
				resultado = desencriptar(entrada);
				System.out.println("La frase desencriptada es: " + resultado);
				break;
			default:
			}

		} while (opcion != 0);
	}

	public static String encriptar(String entrada) {
		String resultado = "";
		resultado = desplazar(entrada, 3);

		return resultado;
	}

	public static String desencriptar(String entrada) {
		String resultado = "";
		resultado = desplazar(entrada, -3);
		return resultado;
	}

	public static String desplazar(String entrada, int desplazamiento) {
		String resultado = "";
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int tamanio = alfabeto.length();
		int ascii;
		int asciibase = (int) ('A');
		int posicion;

		entrada = entrada.toUpperCase();
		for (int i = 0; i < entrada.length(); i++) {
			if ((entrada.charAt(i) >= 'A') && (entrada.charAt(i) <= 'Z')) {
				ascii = (int) (entrada.charAt(i));
				posicion = ascii - asciibase;
				int posicionDesplazada = (posicion + desplazamiento + tamanio) % tamanio;
				resultado += Character.toString(alfabeto.charAt(posicionDesplazada));
			} else {
				resultado += Character.toString(entrada.charAt(i));
			}

		}

		return resultado;
	}
}