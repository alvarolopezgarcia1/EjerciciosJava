import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca el precio del producto: ");
		int precioArticulo = s.nextInt();
		
		System.out.println("Introduzca el numero total de unidades: ");
		int cantidad = s.nextInt();
		
		System.out.println("introduzca el cupón de descuento en caso de contar con uno: ");
		int cupon = s.nextInt();
		
		System.out.println("Pedido actual desglosado: ");
		System.out.println("-------------------------------------");

		double precioTotal = precioDeUnidades(precioArticulo, cantidad);
		double descuentoAplicado = conDescuento(precioArticulo, cupon, cantidad);
		double iva = 0.21 * (precioTotal - descuentoAplicado);
		double precioDescuento = (precioTotal - descuentoAplicado);
		double precioFinal = precioDescuento + iva;

		System.out.println("Precio del producto:      " + precioArticulo + "€");
		System.out.println("Número de unidades:       " + cantidad);
		System.out.println("Precio total:             " + precioTotal + "€");
		System.out.println("Descuento:                " + descuentoAplicado + "€");
		System.out.println("Precio con el cupón:      " + (precioTotal - descuentoAplicado + "€"));
		System.out.println("IVA:                      " + iva + "€");
		System.out.println("--------------------------------------");
		System.out.println("PRECIO FINAL:             " + precioFinal + "€");

	}

	

	public static double conDescuento(double precio, double numero, double unidades) {
		double descuento = 0;
		if (numero == 685) {
			return 15;
		}
		if (numero == 778) {
			if (unidades < 20) {
				descuento = unidades * precio * 0.05;
				return descuento;
			} else {
				return 20 * precio * 0.05;
			}
		}
		if (numero == 219) {
			if (unidades > 5) {
				return precio * 5;
			}
		}
		return 0;
	}
	
	public static double precioDeUnidades(double x, double y) {
		double precio = x * y;
		return precio;
	}

}
