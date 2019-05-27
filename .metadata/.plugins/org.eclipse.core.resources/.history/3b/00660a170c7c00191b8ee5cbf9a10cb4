import java.util.Scanner;

public class frecuenciasEnteros {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int frecuenciasValores[] = new int[100];

		for (int i = 0; i < frecuenciasValores.length; i++) {
			frecuenciasValores[i] = 0;
		}

		int captura;
		do {
			System.out.print("Introduzca un valor entre 1 y 100 (-1 para finalizar): ");
			captura =s.nextInt();
			if ((captura >= 1) && (captura <= 100)) {
				frecuenciasValores[captura - 1]++;
			} else if (captura != -1) {
				System.out.println("Valor introducido fuera de rango. No se ha tenido en cuenta.");
			}

		} while (captura != -1);

		for (int i = 0; i < frecuenciasValores.length; i++) { //te pinta el numero que aparezca
			if (frecuenciasValores[i] > 0) {
				System.out.printf("%3d: ", i + 1);
			}
			for (int j = 0; j < frecuenciasValores[i]; j++) { // te pone un * por cada vez que se repita
				System.out.print("*");
			} 
			if (frecuenciasValores[i] > 0) { //salto de linea cuando aparece un nuevo numero
				System.out.println();
			}
		}

	}
}