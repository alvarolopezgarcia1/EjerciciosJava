import java.util.Scanner;

public class CuentaNumeros {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[][] vector = new int[5][5];

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				vector[i][j] = (int) (Math.random() * 100);
			}

		}

		System.out.println("Introduce fila");

		int fila = s.nextInt();

		System.out.println("Introduce columna");

		int columna = s.nextInt();

		System.out.println("Array completo");

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print(vector[i][j] + ", ");
			}
			System.out.println();
		}
		
		
	}

}
