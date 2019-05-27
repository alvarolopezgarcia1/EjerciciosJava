
public class  Coche {

	private int ruedas;

	private int largo;

	private int ancho;

	private int motor;

	private int peso_plataforma;

	private String color;

	private int peso_total;

	private boolean asientos_cuero, climatizador;

	public Coche() { //constructor

		ruedas = 4;

		largo = 2000;

		ancho = 300;

		motor = 1600;

		peso_plataforma = 500;

	}
	

	public String largoCoche() { // getter siempre con return y otorga dato

		return "El largo del coche es " + largo;

	}

	// setter un void nunca lleva return y modifica el dato

	public void establece_color(String color_coche) {

		color = color_coche;

	}

	// getter

	public String dime_color() {

		return "El color del coche es " + color;

	}

	public String dime_todo() { // getter

		return "La plataforma del vehiculo tiene " + ruedas + ". Mide " + largo / 1000 + " metros con un ancho de "
				+ ancho;
	}

	public void configura_asientos(String asientos_cuero) { // setter

		if (asientos_cuero.equalsIgnoreCase("si")) {

			this.asientos_cuero = true;

		} else {

			asientos_cuero = "false";
		}
	}

	public String dime_asientos() { // getter

		if (asientos_cuero == true) {

			return "El coche tiene asientos de cuero";

		} else {

			return "el coche tiene asientos de serie";
		}
	}

	public void configura_climatizador(String climatizador) { // setter

		if (climatizador.equalsIgnoreCase("si")) {

			this.climatizador = true;

		} else {

			this.climatizador = false;
		}
	}

	public String dime_climatizador() { // getter

		if (climatizador == true) {

			return "El coche tiene climatizador";

		} else {

			return "el coche lleva aire acondicionado";
		}
	}

	public String dime_peso_coche() { // setter+getter no recomendado

		int peso_carroceria = 500;

		peso_total = peso_total + peso_carroceria;

		if (asientos_cuero == true) {

			peso_total += 50;
		}
		if (climatizador == true) {

			peso_total += 20;
		}

		return "El peso del coche es " + peso_total;

	}

	public int precio_coche() {

		int precio_final = 10000;

		if (asientos_cuero == true) {

			precio_final += 1000;
		}

		if (climatizador = true) {

			precio_final += 500;

		}

		return precio_final;

	}

}