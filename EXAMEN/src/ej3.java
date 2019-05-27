import java.util.Scanner;

public class ej3 {

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
			precioConDescuento = (precioArticulo - 15 *numeroUnidades);
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

