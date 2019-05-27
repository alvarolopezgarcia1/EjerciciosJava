package PruebaCoche;

import javax.swing.*;

public class Uso_Coche extends Coche {

	public static void main(String[] args) {

		Coche Seat = new Coche();

		Seat.establece_color(JOptionPane.showInputDialog("Introduce color"));// asi se pasa un parametro

		Seat.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));

		System.out.println(Seat.dime_color());

		System.out.println(Seat.dime_datos_generales());

		Seat.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));

		System.out.println(Seat.dime_asientos());

		System.out.println(Seat.dime_climatizador());

		Seat.configura_climatizador("si");

		System.out.println(Seat.dime_climatizador());

		System.out.println(Seat.dime_peso_coche());

		System.out.println("El precio final del coche es " + Seat.precio_coche());

	}

}
