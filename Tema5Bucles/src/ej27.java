
/*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay 
entre 1 y un número leído por teclado.*/

import java.util.*;

public class ej27 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce un numero");

		int numIntroducido = s.nextInt();

		int multiploDeTres = 0;

		int contador = 0;

		int suma=0;

		for (int i = 1; i <= numIntroducido; i++) {

			if (i % 3 == 0) {

				multiploDeTres = i;
				System.out.println(multiploDeTres);

				contador++;

				suma = +i;

			}

		}
		System.out.println("Hay " + contador + " muliplos de 3");

		System.out.println("La suma de los multiplos de 3 es " + suma);

	}

}
