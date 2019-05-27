//Ejercicio 11 
//Realiza un programa que pida 10 n�meros por teclado y que los almacene en 
//un array. A continuaci�n se mostrar� el contenido de ese array junto al �ndice 
//(0 � 9) utilizando para ello una tabla. Seguidamente el programa pasar� los 
//primos a las primeras posiciones, desplazando el resto de n�meros (los que 
//no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
//el array resultante.

package prueba;

import java.util.Scanner;

public class ejercicio11Tema7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		
		int i;
		int[] indice = new int[10];

		int j;
		System.out.println("Introduce 10 numeros enteros");

		for (i = 0; i < 10; i++) {

			indice[i] = s.nextInt();
			
		}
		
		for (i = 0; i < 10; i++) {

			System.out.print(i);
			
		}
		
		System.out.print("");

		for (j = 0; j < 10; j++) {

			indice[j] = j;
			
	    System.out.print("");
			
		}
		 
		for (j = 0; j < 10; j++) {

			System.out.print(j + ", ");
			
		}
		 
		
		
	}
}
