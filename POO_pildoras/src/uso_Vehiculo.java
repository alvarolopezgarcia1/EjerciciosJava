import javax.swing.*;

public class uso_Vehiculo {

	public static void main(String[] args) {

		/*Coche Seat = new Coche();

		Seat.establece_color(JOptionPane.showInputDialog("Introduce color"));

		System.out.println(Seat.dime_color());

		System.out.println(Seat.dime_todo());

		Seat.configura_asientos(JOptionPane.showInputDialog("¿tiene asientos de cuero?"));

		System.out.println(Seat.dime_asientos());

		Seat.configura_climatizador(JOptionPane.showInputDialog("¿tiene climatizador?"));

		System.out.println(Seat.dime_climatizador());

		System.out.println(Seat.dime_peso_coche());

		System.out.println("El precio final del coche es " + Seat.precio_coche());*/
		
		//Lo de arriba es antes de crear la herencia, si se desccomenta funciona
		
		//probamos herencia
		Coche miCoche1 = new Coche();
		
		miCoche1.establece_color("amarillo");
		
		Furgoneta miFurgoneta1 = new Furgoneta(7,580);
		
		miFurgoneta1.establece_color("amarillo");
		
		miFurgoneta1.configura_asientos("si");
		
		miFurgoneta1.configura_climatizador("si");
		
		//probamos coche
		
		System.out.println(miCoche1.dime_todo() + miCoche1.dime_color());
		
		
		//probamos furgoneta con herencia + valores de furgoneta concantenando
		
		
		System.out.println(miFurgoneta1.dime_todo()+ miFurgoneta1.dameDatosFurgoneta());
		
	}

}
