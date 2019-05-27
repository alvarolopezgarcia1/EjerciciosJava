import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Realiza un programa equivalente al anterior pero en esta ocasión, el programa 
debe ordenar palabras en lugar de números.*/
public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		ArrayList<String> n = new ArrayList<String>();

		System.out.println("Por favor introduzca 10 palabras y aparecerán ordenados de menor a mayor");

		for (int i = 0; i < 10; i++) {

			n.add(s.next());
		}

		Collections.sort(n);
		System.out.println(n);

	}

}
