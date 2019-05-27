package ej2;

import java.util.*;

public class Ejercicio2A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		HashMap<String, String> miDiccionario = new HashMap<String, String>();
		int opcion = 0;

		do {
			System.out.println("\n\nMenú Diccionario Sinónimos:");
			System.out.println("1.- Dar de alta una pareja.");
			System.out.println("2.- Dar de baja una pareja.");
			System.out.println("3.- Listar sinónimos de una palabra.");
			System.out.println("0.- Salir.");
			System.out.print("--> Indique opción: ");

			opcion =s.nextInt();

			switch (opcion) {
			case 1:
				DarDeAlta(miDiccionario);
				break;
			case 2:
				DarDeBaja(miDiccionario);
				break;
			case 3:
				ListarSinonimos(miDiccionario);
				break;
			default:
			}

		} while (opcion != 0);

	}

	public static void DarDeAlta(HashMap<String, String> miDiccionario) {
		System.out.print("Indique la primera palabra: ");
		Scanner s = new Scanner(System.in);
		String primeraPalabra = s.nextLine();
		System.out.print("Indique la segunda paralbra (sinónimo): ");
		String sinonimo =s.nextLine();
		if (miDiccionario.containsKey(primeraPalabra)) {
			System.out.println("ATENCIÓN: La palabra '" + primeraPalabra + "' ya tiene un sinónimo.");
			System.out.print("¿Desea actualizar (S/N)? ");
			char opcion =  s.next().charAt(0);
			switch (opcion) {
			case 's':
			case 'S':
				miDiccionario.put(primeraPalabra, sinonimo);
				System.out.println("Entrada actualizada");
				break;
			default:
			}
		} else {
			miDiccionario.put(primeraPalabra, sinonimo);
			System.out.println("Entrada añadida");
		}
	}

	public static void DarDeBaja(HashMap<String, String> miDiccionario) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Indique la primera palabra: ");
		String primeraPalabra = s.nextLine();
		miDiccionario.remove(primeraPalabra);
	}

	public static void ListarSinonimos(HashMap<String, String> miDiccionario) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Indique la primera palabra: ");
		String primeraPalabra = s.nextLine();

		ArrayList<String> sinonimos = new ArrayList<String>();
		sinonimos.add(primeraPalabra);
		boolean salir = false;
		System.out.println("Listado de sinónimos de: " + primeraPalabra);

		String sinonimo;
		while (!salir) {
			sinonimo = miDiccionario.get(primeraPalabra);
			if ((sinonimo != null) && !sinonimos.contains(sinonimo)) {
				System.out.print(sinonimo + ", ");
				sinonimos.add(sinonimo);
			} else {
				salir = true;
			}
			primeraPalabra = sinonimo;
		}

	}
}
