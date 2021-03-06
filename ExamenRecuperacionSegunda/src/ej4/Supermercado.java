package ej4;

import java.util.*;

public class Supermercado {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		HashMap<String, Double> Producto = new HashMap<String, Double>();
	
		Producto.put("avena", 2.21);
		Producto.put("garbanzos", 2.39);
		Producto.put("Tomate", 1.59);
		Producto.put("Jengibre", 3.13);
		Producto.put("Quinoa", 4.50);
		Producto.put("Guisantes", 1.6);

		int opcion = 0;

		do {
			System.out.println("\n\nLista de la compra:");
			System.out.println("1.- Elige producto y cantidad");
			System.out.println("2.- Introduce un 0 para terminar la compra.");
			System.out.print("--> Indique opción: ");

			opcion = s.nextInt();

			switch (opcion) {
			case 1:
				ElegirProducto(Producto);

				break;

			default:
			}

		} while (opcion != 0);
	}

	public static void ElegirProducto(HashMap<String, Double> Producto) {
		Scanner s = new Scanner(System.in);

		HashMap<String, Double> Lista = new HashMap<String, Double>();
		System.out.print("Indique el producto: ");
		String producto = s.nextLine();

		if (Producto.containsKey(producto)) {
			System.out.print("Ahora indique su cantidad: ");
			int cantidad = s.nextInt();

			Lista.put(producto, (Producto.get(producto) * cantidad));
			for (Map.Entry pareja : Lista.entrySet()) {
				System.out.print(pareja.getKey() + ": " + pareja.getValue() + "€");
			}
		} else {
			System.out.println("No existe ese producto ");

		}

	}

}
