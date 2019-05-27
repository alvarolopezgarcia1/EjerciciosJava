/*Realiza un programa que pida 8 números enteros y que luego muestre esos 
números junto con la palabra “par” o “impar” según proceda*/

package prueba;

import java.util.Scanner;

public class ejer9Tema7Bid {

	public static void main(String[] args) {
		
		

		Scanner s = new Scanner(System.in);
		int n;

		int[] array = new int[8];

		System.out.println("Por favor introduzca 8 numeros enteros y te diré si son pares o impares");
		

		for (int i = 0; i < 9; i++) {
		n = s.nextInt();
		
		for ( int i : array) {
			
			System.out.println(i);
			
			
		}
			
		}

	}
}