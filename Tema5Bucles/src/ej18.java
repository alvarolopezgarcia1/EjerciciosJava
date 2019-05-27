
/*Ejercicio 18 
Escribe un programa que obtenga los números enteros comprendidos entre 
dos números introducidos por teclado y validados como distintos, el programa 
debe empezar por el menor de los enteros introducidos e ir incrementando de
7 en 7.*/

import java.util.*;

public class ej18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce un numero entero");

		int numIntroducido = s.nextInt();

		System.out.println("Introduce otro numero entero, pero que sea diferente");

		int numIntroducido2 = s.nextInt();

		int aux;

		int aux2;

		if (numIntroducido != numIntroducido2 && numIntroducido > numIntroducido2) {

			for (int i = 0; i < numIntroducido; i++) {

				aux = numIntroducido + 7;

				System.out.println(aux);

			}

			if (numIntroducido != numIntroducido2 && numIntroducido < numIntroducido2) {

				for (int i = 0; i < numIntroducido2; i++) {

					aux2 = numIntroducido2 + 7;

					System.out.println(aux2);

				}

			}
		}
	}
}