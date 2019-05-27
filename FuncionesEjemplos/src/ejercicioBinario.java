import misFunciones.*;

import java.util.Scanner;

public class ejercicioBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		long decimal = 0;
		System.out.print("Introduzca un número binario: ");
		long binario = s.nextInt();
		int bits = funciones2.digitos(binario);
		for (int i = 0; i < bits; i++) {
			decimal += funciones2.digitoN(binario, bits - i - 1) * funciones2.potencia(2, i);
		}
		System.out.println(binario + " en binario es " + decimal + " en decimal.");

	}

}
