
public class Recorrido1 {
	public static void main(String[] args) {
		int[][] arrayBid = new int[5][6];

		int contFila = 0;

		for (int i = 0; i < 6; i++) {
			arrayBid[contFila][i] = contFila * 10;
			System.out.print(arrayBid[contFila][i]);
			if ((contFila < 4) && (i == 5)) {
				i = -1;
				contFila++;
				System.out.println();
			}

		}

	}
}
