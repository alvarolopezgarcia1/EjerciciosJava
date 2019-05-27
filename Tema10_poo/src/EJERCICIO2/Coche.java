package EJERCICIO2;

public class Coche extends Vehiculos {
	
	public int cilindrada;
	
	public Coche (int cilindrada) {
		
		super();
		
		this.cilindrada=cilindrada;
	}
	
	public void hazDerrape() {
		
		System.out.println("Estoy haciendo un derrape");
		
	}

}
