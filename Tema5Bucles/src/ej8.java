
//Muestra la tabla de multiplicar de un número introducido por teclado

import java.util.*;

public class ej8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce un numero y te enseñearé su tabla de multiplicar");

		int numIntroducido = s.nextInt();

		for (int i = 0; i <= 10; i++) {

			// numIntroducido*=i;

			System.out.println(numIntroducido * i);
		}

	}

}
