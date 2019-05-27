package examen6;

//Alvaro

import java.util.*;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce el número de reyes que quieres introducir");
		int num = s.nextInt();

		System.out.println("Introduce nombres de reyes");
		String palabra;

		ArrayList<String> nombresDeReyes = new ArrayList<String>();
		ArrayList<String> reyesListar = new ArrayList<String>();

		String reyes;
		int contador;

		for (int i = 0; i <= num; i++) {
			contador = 0;
			palabra = s.nextLine();
			if (i >= 0) {
				nombresDeReyes.add(palabra);
				for (String m : nombresDeReyes) {
					if (m.equals(palabra)) {
						contador++;
					}
				}
				reyes = palabra + contador + "º ";
				reyesListar.add(reyes);
			}
		}

		System.out.println(reyesListar);
	}
}