/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe 
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/

package prueba;

import java.util.Scanner;

public class piramide2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		
		int altura;
		String caracter;
		
		System.out.println("Por favor introduzca la altura de la piramide por pantalla");
		int numFilas=s.nextInt();
		
		System.out.println("Por favor introduzca un caracter");
		caracter=s.next();
		
	
		System.out.println();
		for ( altura = 1; altura <= numFilas; altura++) {
			// Espacios en blanco
			for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
				System.out.print(" ");
			}

			// Asteriscos
			for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
		

		

	}

}
