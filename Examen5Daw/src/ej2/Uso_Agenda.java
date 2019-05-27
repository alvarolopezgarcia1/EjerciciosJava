package ej2;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class Uso_Agenda {

	private static String nombre;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		HashMap<String, String> miAgenda = new HashMap<String, String>();

		int opcion = 0;

		do {
			System.out.println("\n\nPonte y Quita:");
			System.out.println("1.- Añade una persona y tlf a la agenda.");
			System.out.println("2.- Borrar de la agenda a una persona.");
			System.out.println("3.- Mostrar todas las personas agendadas.");
			System.out.println("0.- Salir.");
			System.out.print("--> Indique opción: ");

			opcion = s.nextInt();

			switch (opcion) {
			case 1:
				AñadeAgenda(miAgenda);
				break;
			case 2:
				borrarAgenda(miAgenda);
				break;
			case 3:
				MostrarAgenda(miAgenda);
				break;
			default:
			}

		} while (opcion != 0);
	}

	public static void AñadeAgenda(HashMap<String, String> miAgenda) {

		System.out.print("Indique el nombre: ");
		Scanner s = new Scanner(System.in);
		String nombre = s.nextLine();
		System.out.print("Indique el tlf: ");
		String tlf = s.nextLine();
		if (miAgenda.containsKey(nombre)) {
			System.out.println("Esta persona está agendada");
			System.out.print("¿Desea modificar el telefono (S/N)? ");
			char opcion = s.next().charAt(0);
			switch (opcion) {
			case 's':
			case 'S':
				miAgenda.put(nombre, tlf);
				System.out.println("Agenda actualizada");
				break;
			default:
			}
		} else {
			miAgenda.put(nombre, tlf);
			System.out.println("Entrada añadida");
		}
	}

	public static void borrarAgenda(HashMap<String, String> miAgenda) {
		Scanner s = new Scanner(System.in);

		System.out.print("Indique el nombre: ");
		String nombre = s.nextLine();
		miAgenda.remove(nombre);
	}

	public static void MostrarAgenda(HashMap<String, String> miAgenda) {
		Scanner s = new Scanner(System.in);
		System.out.println();
		for (Map.Entry pareja : miAgenda.entrySet()) {
			System.out.print(pareja.getKey() + " Teléfono: " + pareja.getValue() + "\n");
		}
	}

}
