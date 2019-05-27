/*Ejercicio 10 
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 
y que los almacene en un array. El programa debe ser capaz de pasar todos 
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario.*/

package tema6Array;

public class ej10b {

	public static void main(String[] args) {

		int[] arrayOriginal = new int[20];

		int[] arrayPares = new int[20];

		int[] arrayImPares = new int[20];

		int par = 0;

		int impar = 0;

		for (int i = 0; i < 20; i++) {

			arrayOriginal[i] = (int) (Math.random() * 101);

			if (arrayOriginal[i] % 2 == 0) {

				arrayPares[par++] = arrayOriginal[i];
			} else {

				arrayImPares[impar++] = arrayOriginal[i];
			}

		}

		
		//array original
		System.out.print("Array original: ");
		
		for (int i = 0; i < 20; i++) {
			
			System.out.print(arrayOriginal[i] + ", ");
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.print("Array con pares al principio: ");
		
		//muestra los pares al principio
		for (int i = 0; i < 20; i++) {
			arrayOriginal[i] = arrayPares[i];
		}
		

		//en este bucle par vale la cantidad de veces que hay un par en el arrayPares
		for (int i = par; i < 20; i++) {
			arrayOriginal[i] = arrayImPares[i - par];
		}
		
		System.out.print("Array pares al principio: ");
		for (int i = 0; i < 20; i++) {
			System.out.print(arrayOriginal[i] + ", ");
		}
		
		
		
		


	}

}
