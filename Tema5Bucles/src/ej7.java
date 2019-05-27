
//Realiza el control de acceso a una caja fuerte. La combinación será un 
//número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no 
//acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
//y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
//Tendremos cuatro oportunidades para abrir la caja fuerte.

import java.util.*;

public class ej7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int clave = 8883;
		int claveIntroducida;

		do {

			System.out.println("Introduce la clave para acceder a la caja fuerte");
			claveIntroducida = s.nextInt();

			if (claveIntroducida != clave) {

				System.out.println("Lo siento, la clave no es correcta");
			}

			System.out.println(" ");

		} while (claveIntroducida != clave);

		System.out.println("Clave correcta");

	}

}
