
/*Escribe un programa que diga si un número introducido por teclado es o no 
primo. Un número primo es aquel que sólo es divisible entre él mismo y la 
unidad.*/
import java.util.*;

public class ej16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca un numero entero y te dire si es primo");

		double numIntroducido = s.nextInt();
		boolean esPrimo = true;
		for (int i = 2; i < numIntroducido; i++) {
			if ((numIntroducido % i) == 0) {
				esPrimo = false;
			}
		}
		if (esPrimo) {
			System.out.println("El número introducido es primo.");
		} else {
			System.out.println("El número introducido no es primo.");
		}
	}
}
