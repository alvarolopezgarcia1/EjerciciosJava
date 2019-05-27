
//Escribe un programa que calcule la media de un conjunto de números positivos 
//introducidos por teclado. A priori, el programa no sabe cuántos números se
//introducirán. El usuario indicará que ha terminado de introducir los datos
//cuando meta un número negativo

import java.util.*;

public class ej10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float numIntroducido;

		float contador = 0;

		float suma = 0;

		do {

			System.out.println("Introduzca numeros enteros y te diré la media, cuando quieras salir introduce *-1* ");

			numIntroducido = s.nextInt();

			suma += numIntroducido;

			contador++;

		} while (numIntroducido >= 0);

		System.out.println("La media de los números positivos introducidos es " + (suma-numIntroducido) / (contador - 1));

	}

}
