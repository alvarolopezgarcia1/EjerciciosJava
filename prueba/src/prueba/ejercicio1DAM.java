/*1.
Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200 ambos incluidos y que 
los almacene en un array. A continuación se debe mostrar el contenido de ese array junto al índice (0
– 9). Seguidamente el programa debe colocar de forma alterna y en orden los menores o iguales de 
100  y  los  mayores  de  100:  primero  menor,  luego  mayor,  luego  menor,  luego  mayor…  Cuando  se
acaben los menores o los mayores, se completará con los números que queden.*/

package prueba;

public class ejercicio1DAM {

	public static void main(String[] args) {

		int num[] = new int[10];

		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 201);

			System.out.println(i + " " + num[i]);
		}

	}
}