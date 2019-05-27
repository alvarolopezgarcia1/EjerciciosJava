
/*Realiza un programa que vaya pidiendo números hasta que se introduzca un 
numero negativo y nos diga cuantos números se han introducido, la media de 
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo*/
import java.util.*;

public class ej19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numIntroducido;

		int contador = 0;

		int par = 0;

		int impar = 0;

		do {
			System.out.println("Introduce numeros enteros, para salir introduzca un numero negativo");
			numIntroducido = s.nextInt();
			contador++;

			if (numIntroducido % 2 == 0) {

				par++;

			} else if (numIntroducido % 2 != 0) {

				impar++;
			}

		} while (numIntroducido >= 0);

		if (contador > 1) {

			System.out.println("Se han introducido " + contador + " numeros");
		} else {

			System.out.println("Se ha introducido " + contador + " numero");
		}

		if (par > 1) {

			System.out.println("Se han introducido " + par + " numero pares");

		} else {

			System.out.println("Se ha introducido " + par + " numero par");
		}

		if (impar > 1) {

			System.out.println("Se han introducido " + impar + " numero impares");
		}

		else {

			System.out.println("Se ha introducido " + impar + " numero impar");
		}
	}

}
