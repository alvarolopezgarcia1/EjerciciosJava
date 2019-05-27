/*Define un array de números enteros de 3 filas por 6 columnas con nombre num 
y asigna los valores según la siguiente tabla. Muestra el contenido de todos 
los elementos del array dispuestos en forma de tabla como se muestra en la 
figura.*/

package tema6ArrayBid;

public class ej1 {

	public static void main(String[] args) throws InterruptedException {

		int[][] n = new int[3][6];

		n[0][0] = 20;
		n[1][0] = 67;
		n[1][1] = 33;
		n[2][1] = 7;

		for (int i = 0; i < n.length; i++) {

			for (int j = 0; j < n.length; j++) {
				System.out.printf( n[i][j]+" ");
				Thread.sleep(1000); // retardo de un segundo
			}
			System.out.println();

		}
	}
}
