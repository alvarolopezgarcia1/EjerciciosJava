//Alvaro

package ejer5Ext;

public class Cuenta {

	private int NumCuenta;

	private double Saldo;

	public Cuenta(int NumCuenta, double Saldo) {

		this.NumCuenta = NumCuenta;

		this.setSaldo(Saldo);
	}

	public void establece_sueldo(double Saldo) {

		// color = "azul"; // metodo setter, no devuelve nada pero si otorga un valor

		this.setSaldo(Saldo);

	}

	public String dime_saldo() {

		return "El saldo es: " + getSaldo() + " €";
	}

	public void recibe_Abono(double abono) { // setter

		setSaldo(getSaldo() + abono);

	}

	public void paga_recibo(double recibo) {

		setSaldo(getSaldo() - recibo);
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

}
