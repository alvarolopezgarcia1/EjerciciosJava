/*Ejercicio3.
[2,5 puntos] Genera el precio (bien desglosado) de un pedido a un almacén en función de las siguientes 
condiciones:
- Se pregunta el precio del artículo, el número de unidades y el código de descuento. 
- El precio inicial del pedido se calcula multiplicando el precio unitario por la cantidad.
- El código 685 hace que se resten 15 euros.
- El código 778 aplica un 5% de descuento a las 20 primeras unidades.
- El código 219 hace que las primeras 5 unidades salgan gratis (válido solo si se piden más de 5 unidades). 
- Al final se suma el 21% de IVA.
Cualquier código diferente a los anteriormente mencionados no tiene ningún efecto sobre el precio.
Ejemplo 1:*/

package examen3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int precioArticulo;

		int numeroUnidades;

		int codigoDescuento;

		System.out.println("Introduzca el precio del artículo");

		precioArticulo = s.nextInt();

		System.out.println("Introduzca el numero de unidades");

		numeroUnidades = s.nextInt();

		int precioTotalUnidades = precioArticulo * numeroUnidades;

		System.out.println("Introduzca un codigo de descuento");
		codigoDescuento = s.nextInt();

		int precioConDescuento = 0;

		switch (codigoDescuento) {
		case 685:
			precioConDescuento = precioArticulo - 15;
			break;

		case 778:

			precioConDescuento = (precioArticulo - (precioArticulo * 5) / 100) * numeroUnidades;
			break;

		case 219:

			precioConDescuento = precioArticulo *(numeroUnidades-5);
			break;

		default:
			precioConDescuento = precioArticulo*numeroUnidades;

		}

		int iva = (precioConDescuento * 21) / 100;

		int precioFinal = precioConDescuento + iva;

		System.out.println("");

		System.out.println("-----------------------------------------");

		System.out.println("Precio de articulo: " + precioArticulo + " €");
		System.out.println("Número de unidades: " + numeroUnidades + " €");
		System.out.println("Precio total unidades " + precioTotalUnidades + " €");
		System.out.println("Descuento aplicado: Código " + codigoDescuento);
		System.out.println("Precio con descuento: " + precioConDescuento + " €");
		System.out.println("IVA 21%: " + iva + " €");

		System.out.println("-----------------------------------------");

		System.out.println("PRECIO FINAL: " + precioFinal + " €");

	}

}
