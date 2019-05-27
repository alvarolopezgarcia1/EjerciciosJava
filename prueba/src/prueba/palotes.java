package prueba;

import java.util.Scanner;

public class palotes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String captura;
		System.out.println("Convierte del sistema de representación 'palotes' a decimal.");
		System.out.print("Introduzca número en sistema 'palotes': ");
		captura = sc.nextLine();
		System.out.println("Se trata del número " + convierteEnDecimalDesdePalotes(captura));
	}

	public static int convierteEnDecimalDesdePalotes(String cadena) {
		int valor = 0;
		int parcial = 0;

		for (int i = 0; i < cadena.length(); i++) {
			switch (cadena.charAt(i)) {
			case '|':
				parcial++;
				break;
			case '-':
				valor = valor * 10 + parcial;
				parcial = 0;
				break;
			default:
			}
		}
		valor = valor * 10 + parcial;
		return valor;

	}

}
