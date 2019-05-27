package prueba;

public class ejer6Tema7Bid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[][] n = new int[6][10]; // filas, columnas

		int i;
		int j;
		int filaMenor = 0;
		int columnaMenor = 0;
		int numeroMayor = 0;
		int columnaMayor = 0;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;

		for (i = 0; i < 6; i++) {

			for (j = 0; j < 10; j++) {
				n[i][j] = (int) (Math.random() * 1001);

			}
		}
		for (i = 0; i < 6; i++) {

			for (j = 0; j < 10; j++) {
				
				

				// Calcula el mínimo y guarda sus coordenadas
				if (n[i][j] < minimo) {
					minimo = n[i][j];
					filaMenor = i;
					columnaMenor = j;
				}
				// Calcula el máximo y guarda sus coordenadas
				if (n[i][j] > maximo) {
					maximo = n[i][j];
					numeroMayor = i;
					columnaMayor = j;
				}

				System.out.print(n[i][j] + " ");

			}
			System.out.println("");

		}

		System.out.println("");

		System.out
				.println("El máximo es " + maximo + " y está en la fila " + numeroMayor + ", columna " + columnaMayor);
		System.out.println("El minimo es " + minimo + " y está en la fila " + filaMenor + ", columna " + columnaMenor);


	}

}
