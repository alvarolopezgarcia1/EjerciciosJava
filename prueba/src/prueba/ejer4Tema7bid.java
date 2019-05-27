/*Modifica el programa anterior de tal forma que las sumas parciales y la suma 
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de 
que el ordenador se queda “pensando” antes de mostrar los números.*/

package prueba;

public class ejer4Tema7bid {

	public static void main(String[] args) 
		
		
		throws InterruptedException { // Se añade esta línea para poder usar sleep 

			

			int[][] n = new int[4][5]; // filas, columnas

			int i;

			int j;

			for (i = 0; i < 4; i++) {

				for (j = 0; j < 5; j++) {
					n[i][j] = (int) (Math.random() * 900 + 100);

				}
			}

			int sumaFila = 0;

			for (i = 0; i < 4; i++) {

				for (j = 0; j < 5; j++) {

					System.out.print("    " + n[i][j]);

					sumaFila += n[i][j];
					
					Thread.sleep(100);

				}

				System.out.print("  La suma de la columna es: " + sumaFila);

				System.out.println("");

			}

			for (j = 0; j < 5; j++) {

				for (i = 0; i < 4; i++) {

					System.out.print("    " + n[i][j]);

					sumaFila += n[i][j];
					
					Thread.sleep(400);

				}

				System.out.print("         La suma de la fila es " + sumaFila);
				System.out.println("");
			}


	}

}
