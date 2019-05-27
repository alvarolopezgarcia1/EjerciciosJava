package bancoPoo;

public class PruebaCuentas {

	public static void main(String[] args) {
		
		Persona yo = new Persona("68486484Z");
		
		yo.aniadirCuenta(new Cuenta(1000,0));
		yo.aniadirCuenta(new Cuenta(2000,700));
		
		yo.obtenerCuenta(1).abono(1100);
		
		yo.obtenerCuenta(2).abono(750);
		
		
		if(yo.esMorosa()) {
			
			System.out.println("soy morosa");
		} else {
			
			System.out.println("no soy morosa");
		}
		
		yo.obtenerCuenta(2).transferencia(yo.obtenerCuenta(1), 100);
		
		
	}
}