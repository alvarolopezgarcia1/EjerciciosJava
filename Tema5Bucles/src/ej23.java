
/*Escribe un programa que permita ir introduciendo una serie indeterminada 
de números mientras su suma no supere el valor 10000. Cuando esto último 
ocrra, se debe mostrar el total acumulado, el contador de los números 
introducidos y la media.*/

import java.util.*;

public class ej23 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int numIntroducido;

		int suma = 0;

		int contador = 0;

		do {
			System.out.println("Introduzca numeros enteros, el programa parará cuando la suma supere 10000 ");

			numIntroducido = s.nextInt();

			suma = suma + numIntroducido;

			contador++;

		} while (suma < 10000);
		
		System.out.println();

		System.out.println("la suma es " + suma);

		int media = suma / contador;

		System.out.println("La media es " + media);
	}

}
