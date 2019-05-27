package ej3b;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3B {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		ArrayList<Prenda> miVestimenta = new ArrayList<Prenda>();

		int opcion = 0;

		do {
			System.out.println("\n\nPonte y Quita:");
			System.out.println("1.- Ponerse una prenda de vestir.");
			System.out.println("2.- Quitarse una prenda de vestir.");
			System.out.println(
					"3.- Mostrar qué prenda es la que tengo puesta encima de todas, y cantidad de las que llevo.");
			System.out.println("0.- Salir.");
			System.out.print("--> Indique opción: ");

			opcion = s.nextInt();

			switch (opcion) {
			case 1:
				PonersePrenda(miVestimenta);
				break;
			case 2:
				QuitarsePrenda(miVestimenta);
				break;
			case 3:
				MostrarPrendaYCantidad(miVestimenta);
				break;
			default:
			}

		} while (opcion != 0);
	}

	public static void PonersePrenda(ArrayList<Prenda> miVestimenta) {

		Scanner s = new Scanner(System.in);
		System.out.print("Indique el código de la prenda: ");
		String codigo = s.nextLine();
		System.out.print("Indique la descripción: ");
		String descripcion = s.nextLine();

		Prenda prendaAux = new Prenda(codigo, descripcion);

		miVestimenta.add(prendaAux);

	}

	public static void QuitarsePrenda(ArrayList<Prenda> miVestimenta) {

		Scanner s = new Scanner(System.in);
		
		if (miVestimenta.size() > 0) {
			Prenda prendaAux = miVestimenta.get(miVestimenta.size() - 1);
			System.out.println("Me quito: " + prendaAux);
			miVestimenta.remove(miVestimenta.size() - 1);
		} else {
			System.out.println("Estoy sin prenda.");
		}
	}

	public static void MostrarPrendaYCantidad(ArrayList<Prenda> miVestimenta) {
		if (miVestimenta.size() > 0) {
			Prenda prendaAux = miVestimenta.get(miVestimenta.size() - 1);
			System.out.println("Lo que llevo puesto encima es: " + prendaAux.getDescripcion());
			System.out.println("En total, llevo encima " + miVestimenta.size() + " prendas.");
		} else {
			System.out.println("Estoy sin prenda.");
		}
	}
}
