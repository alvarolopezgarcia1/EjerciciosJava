//Alvaro
package ejer5Ext;

import java.util.*;

public class Persona extends Cuenta {
	private ArrayList<Cuenta> m = new ArrayList<Cuenta>();
	private String DNI;

	public Persona(int NumCuenta, double Saldo, String DNI ) {
		super(NumCuenta, Saldo);
		
		this.DNI=DNI;
   }

	public void aniadirCuenta(int NumCuenta, double Saldo, String DNI) {
		Cuenta a= new Cuenta (NumCuenta,Saldo);
		m.add(a);
	}
	

	public String moroso() { // getter

		if (getSaldo() <=-1) {

			return "No tiene saldo";
		} else {

			return "Tiene saldo";
		}
	}
		
	

}