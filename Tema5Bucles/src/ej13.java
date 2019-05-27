
//Escribe un programa que lea una lista de diez números y determine cuántos 
//son positivos, y cuántos son negativos.
import java.util.*;

public class ej13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int numIntroducido;

		int numNegativo = 0;

		int negativo = 0;

		int positivo = 0;

		System.out.println("Introduce 10 numeros enteros y te diré si son positivos o negativos");

		for (int i = 0; i < 10; i++) {

			numIntroducido = s.nextInt();
			int num = numIntroducido;

			if (num < numNegativo) {
				negativo++;

			} else {

				positivo++;
			}

		}

		System.out.println("Positivos: " + positivo + " Negativos:" + negativo);

	}

}
