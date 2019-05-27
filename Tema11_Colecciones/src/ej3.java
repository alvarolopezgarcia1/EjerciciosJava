import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList*/

public class ej3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		ArrayList<Integer> n = new ArrayList<Integer>();

		System.out.println("Por favor introduzca 10 valores enteros y aparecerán ordenados de menor a mayor");

		for (int i = 0; i < 10; i++) {

			n.add(s.nextInt());
		}

		Collections.sort(n);
		System.out.println(n);

	}

}
