import java.util.ArrayList;

/*Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un 
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos 
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.*/

public class ej2 {

	public static void main(String[] args) {

		ArrayList<Integer> n = new ArrayList<Integer>();

		int tamanoLista = (int) (Math.random() * 11 + 10);

		int minimo = 100;

		int maximo = 0;

		int suma = 0;

		int media = 0;

		for (int i = 0; i < tamanoLista; i++) {
			n.add((int) (Math.random() * 101));
		}

		System.out.println("Este es el arraylist original creado aleatoriamente");

		System.out.println(n);

		for (int elemento : n) {

			suma += elemento;

			media += elemento / tamanoLista;

			if (elemento < minimo) {

				minimo = elemento;

			}

			if (elemento > maximo) {

				maximo = elemento;

			}

		}

		System.out.println("");

		System.out.println("El minimo es " + minimo + ", el maximo es maximo es " + maximo + ", la suma es " + suma
				+ " y la media es " + media);
	}
}