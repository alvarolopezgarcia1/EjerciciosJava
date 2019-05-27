//Escribe un programa que pida 10 n�meros por teclado y que luego muestre 
//los n�meros introducidos junto con las palabras �m�ximo� y �m�nimo� al lado 
//del m�ximo y del m�nimo respectivamente.

package prueba;

import java.util.Scanner;

public class ejercicio5Tema7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int num[] = new int[10];
		int minimo = 0;
		int maximo = 0;
		int i;
		System.out.println("Introduce 10 numeros por teclados y te dir� cual es su m�ximo y m�nimo");

		for (i = 0; i < 10; i++) {

			num[i] = s.nextInt();

		}

		for (i = 0; i < 10; i++) {
			if (num[0] < num[i]) {

				minimo = num[0];
				
				i++;

			}

		}
		System.out.println("el m�nimo es " + minimo);
	}
}
