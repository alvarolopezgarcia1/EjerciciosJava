package ej3A;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3A {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		ArrayList<Persona> miCola = new ArrayList<Persona>();

		int opcion = 0;

		do {
			System.out.println("\n\nMCola del supermercado:");
			System.out.println("1.- Persona que llega a la cola.");
			System.out.println("2.- A quién le toca, y es atendida.");
			System.out.println("3.- Listar las personas que hay en cola.");
			System.out.println("0.- Salir.");
			System.out.print("--> Indique opción: ");

			opcion = s.nextInt();

			switch (opcion) {
			case 1:
				PonerseEnCola(miCola);
				break;
			case 2:
				AQuienLeToca(miCola);
				break;
			case 3:
				ListarNombresEnCola(miCola);
				break;
			default:
			}

		} while (opcion != 0);
	}

	public static void PonerseEnCola(ArrayList<Persona> miCola) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Indique el DNI de la persona que llega: ");
		String DNI = s.nextLine();
		System.out.print("Indique el nombre de esta persona: ");
		String nombre = s.nextLine();

		Persona perAux = new Persona(DNI, nombre);

		miCola.add(perAux);

	}

	public static void AQuienLeToca(ArrayList<Persona> miCola) {
		if (miCola.size() > 0) {
			Persona perAux = miCola.get(0);
			System.out.println("Le toca a:");
			System.out.println(perAux);
			miCola.remove(0);
		} else {
			System.out.println("La cola está vacía.");
		}
	}

	public static void ListarNombresEnCola(ArrayList<Persona> miCola) {
		int i = 1;
		for (Persona p : miCola) {
			System.out.println(i + " -- " + p);
			i++;
		}
	}
}