
public class arraybidConUnBucle {

	public static void main(String[] args) {

		int[][] arrayBid = new int[5][6];

		int columna = 0;

		int fila = 0;

		for (int i = 0; i < 5 * 6; i++) {
			arrayBid[fila][columna] = i;
			System.out.print(arrayBid[fila][columna] + " ");
			columna++;

			if (columna >= 6) {
				columna = 0;
				fila++;
				System.out.println("");
			}

		}

	}
}