
/*2. Implemente un programa que lea dos enteros por teclado; serán la cantidad de filas y de columnas que tendrá
una tabla de enteros bidimensional. A continuación, el programa leerá otros dos enteros, que serán los valores
entre los cuales el programa generará valores aleatorios (ambos incluidos) con los que rellenará la matriz
bidimensional. El programa ha de presentar por pantalla las siguientes informaciones:
a) La matriz bidimensional
b) El máximo y el mínimo por cada fila
c) El máximo y el mínimo por cada columna
d) El máximo y el mínimo de toda la matriz
e) Otra matriz, que será la que se obtenga de su trasposición y de rotar 2 columnas a la derecha y 3 filas
hacia abajo sobre dicha trasposición.
Se valorará el uso de funciones.*/

import java.util.*;

public class ej2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int filas;
		System.out.println("Introduce el numero de filas");
		filas = s.nextInt();

		int columnas;

		System.out.println("Introduce el numero de columnas");

		columnas = s.nextInt();

		int num1;
		System.out.println("Introduce el valor minimo");
		num1 = s.nextInt();

		int num2;

		System.out.println("Introduce el valor maximo");

		num2 = s.nextInt();

		int diferencia = num2 - num1;

		int[][] vector = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				vector[i][j] = (int) (Math.random() * (diferencia + 1) + (num1));

			}

		}

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				System.out.print(vector[i][j] + ", ");

			}

			System.out.println("");
		}

		int maximo = Integer.MIN_VALUE;
        for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				if (vector[f][c] > maximo) {
					maximo = vector[f][c];

				}
			}

		}
		System.out.println("El valor maximo del array bidimensional es " + maximo);

		
		
		int minimo = Integer.MAX_VALUE;
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				if (vector[f][c] < minimo) {
					minimo = vector[f][c];

				}
			}

		}

		System.out.println("El valor minimo del array bidimensional es " + minimo);

		for (int f = 0; f < filas; f++) {
			int mayorfila = Integer.MIN_VALUE;
			int menorFila = Integer.MAX_VALUE;
			for (int c = 0; c < columnas; c++) {
				if (vector[f][c] > mayorfila) {
					mayorfila = vector[f][c];
				}
				if (vector[f][c] < menorFila) {
					menorFila = vector[f][c];
				}

			}
			System.out.println("El numero más alto de la fila :" + f + " es: " + mayorfila);
			System.out.println("El numero más bajo de la fila :" + f + " es: " + menorFila);
		}

		for (int c = 0; c < columnas; c++) {
			int mayorColumna = Integer.MIN_VALUE;
			int menorColumna = Integer.MAX_VALUE;
			for (int f = 0; f < filas; f++) {
				if (vector[f][c] > mayorColumna) {
					mayorColumna = vector[f][c];
				}
				if (vector[f][c] < menorColumna) {
					menorColumna = vector[f][c];
				}
			}
			System.out.println("El numero más alto de la columna :" + c + " es: " + mayorColumna);
			System.out.println("El numero más bajo de la columna :" + c + " es: " + menorColumna);
		}

	}

}