package bancoPoo;

import java.util.ArrayList;

public class Persona {

	private String DNI;

	private ArrayList<Cuenta> misCuentas;

	public Persona(String DNI) {

		this.DNI = DNI;
		this.misCuentas = new ArrayList<Cuenta>(); // se debe poner aqui el arrayList para poder usarlo

	}

	public boolean aniadirCuenta(Cuenta unaCuenta) {
		/*
		 * en caso de tener 3 cuentsa, devolveremos false, indicando que no se ha
		 * añadido
		 */

		if (this.misCuentas.size() >= 3) {

			return false;

		}
		this.misCuentas.add(unaCuenta);

		return true;
	}

	public boolean esMorosa() {

		for (Cuenta c : this.misCuentas) {

			if (c.dameSaldoDisponible() < 0) {
				return true;
			}
		}
		return false;

	}

	public Cuenta obtenerCuenta(int posicionOrdinal) {

		if ((posicionOrdinal > 0) && (posicionOrdinal <= this.misCuentas.size())) {

			return this.misCuentas.get(posicionOrdinal - 1);
		}

		return null;
	}

}
