package bancoPoo;

public class Cuenta {

	private int numeroCuenta;

	private float saldoDisponible;

	public Cuenta(int numCuenta, float saldoInicial) {

		this.numeroCuenta = numCuenta;

		this.saldoDisponible = saldoInicial;

	}

	public float dameSaldoDisponible() {

		return this.dameSaldoDisponible();

	}

	public void abono(float dineroAbonado) {

		this.saldoDisponible += dineroAbonado;
	}

	public void recibo(float dineroCobrado) {

		this.saldoDisponible += dineroCobrado;
	}

	/*
	 * public void transferencia(Cuenta cuentaOrigen, float cantidadATransferir) {
	 * if (cuentaOrigen.dameSaldoDisponible() >= cantidadATransferir) {
	 * 
	 * cuentaOrigen.recibo(cantidadATransferir); this.saldoDisponible +=
	 * cantidadATransferir;
	 * 
	 * } }
	 */
//este metodo es el mismo que el de arriba pero devuelve ademas verdadero o falso
	public boolean transferencia(Cuenta cuentaOrigen, float cantidadATransferir) {
		boolean esPosible = false;
		if (cuentaOrigen.dameSaldoDisponible() >= cantidadATransferir) {
			esPosible = true;

			cuentaOrigen.recibo(cantidadATransferir);
			this.saldoDisponible += cantidadATransferir;

		}
		return esPosible;
	}

}
