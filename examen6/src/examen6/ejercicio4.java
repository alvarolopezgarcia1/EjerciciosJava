package examen6;

import java.util.*;

//Álvaro

public class ejercicio4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca 9 lineas de numeros cada una debe contener 9 dígitos");
		

		int[][] sudoku = new int[9][9]; // declaramos array

		for (int i = 0; i < 9; i++) {// captura los digitos y los almacena en el array

			for (int j = 0; i < 9; j++) {

				sudoku[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < 9; i++) { // presentamos por pantalla

			for (int j = 0; j < 9; j++) {

				System.out.print(sudoku[i][j]);
			}

			System.out.println();
		}

	}

}
