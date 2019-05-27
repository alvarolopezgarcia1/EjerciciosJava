package examen_rec;

public class ej2prueba {

	public static void main(String[] args) {

		int[] arreglo1 = { 1, 4, 5, 3, 4, 4, 3, 5 };
		int[] contador = new int[6];

		for (int i = 0; i < arreglo1.length; i++) {

			contador[arreglo1[i]] += 1;
		}
		for (int j = 0; j < contador.length; j++) {

			System.out.println("Calificacion: " + j + " se repite " + contador[j] + " veces");
		}
	}
}