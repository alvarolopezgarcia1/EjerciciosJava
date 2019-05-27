
public class matrizTraspuesta {

	public static void main(String[] args) {
		int[][] n = new int[3][6];

		n[0][0] = 20;
		n[1][0] = 67;
		n[1][1] = 33;
		n[2][1] = 7;

		for (int i = 0; i < n.length; i++) {

			for (int j = 0; j < n.length; j++) {
				System.out.print( n[i][j]+" ");
			
			}
			System.out.println();

		}
	    System.out.println("Muestra array");
		mostrar(n);
		System.out.println("Muestra array traspuesta");
		mostrar(traspuesta(n));
		System.out.println("Muestra array rotando a la derecha");
		mostrar(rotarDerecha(n,2));
		


	}
//traspone un array bidimensional

	public static int[][] traspuesta(int[][] matriz) {

		int[][] resultado;

		int filas, columnas;
		filas = matriz.length;
		columnas = matriz[0].length;

		resultado = new int[columnas][filas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {

				resultado[j][i] = matriz[i][j];
			}
		}

		return resultado;

	}

	public static void mostrar(int[][] x) {

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j]+", ");
			}

			System.out.println("");
		}
	}

	// rotar derecha

	public static int[][] rotarDerecha(int[][] x, int rotacion) {

		int[][] resultado = new int[x.length][x[0].length];

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[i].length; j++) {

				//así controlamos que no nos salgamos cuando desplazamos un array
				resultado[i][(j + rotacion) % x[i].length] = x[i][j];
			}

		}

		return resultado;

	}
	
	public static int[][] rotarAbajo(int[][] x, int rotacion) {

		int[][] resultado = new int[x.length][x[0].length];

		rotacion=rotacion%x.length;
		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[i].length; j++) {

				//así controlamos que no nos salgamos cuando desplazamos un array
				resultado[(i+rotacion)%x.length][j]= x[i][j];
			}

		}

		return resultado;

	}
}