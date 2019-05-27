//Ejercicio 13 
//Escribe un programa que rellene un array de 100 elementos con n�meros ente- 
//ros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuaci�n 
//el programa mostrar� el array y preguntar� si el usuario quiere destacar el 
//m�ximo o el m�nimo. Seguidamente se volver� a mostrar el array escribiendo 
//el n�mero destacado entre dobles asteriscos.

package prueba;

import java.util.Scanner;

public class ejercicio13Tema7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[] = new int[100];
		int i;
		int maximo = 500;
		int minimo = 0;

		for (i = 0; i < 100; i++) {
			n[i] = (int) (Math.random() * 501);

			if (n[i] < minimo) {
				minimo = n[i];
			}

			if (n[i] < maximo) {
				maximo = n[i];
			}
		}
		for (int elemento : n) {
			System.out.print(elemento + " ");

		}
		

		Scanner s = new Scanner(System.in);

		System.out.print("\n\n�Qu� quiere destacar? (1 � m�nimo, 2 � m�ximo): ");
		int opcion = s.nextInt();

		int destacado;
		if (opcion == 1) {
			destacado = minimo;

		} else {
			destacado = maximo;
		}

		System.out.println();

		for (int elemento : n) {
			if (elemento == destacado) {
				System.out.print(" **" + elemento + "** ");
			} else {
				System.out.print(elemento + " ");
			}
		}
	}

}