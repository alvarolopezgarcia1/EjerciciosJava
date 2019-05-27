package examen_clubes;

//Jugador


public class Jugador extends Persona {
	private String posicion;
	private int valor;
	
	
	public Jugador(String dni, String nombre, int edad, String posicion) {
		super(dni, nombre, edad);
		this.posicion = posicion;
		this.valor = 0;
	}
	
	public Jugador(String dni, String nombre, String posicion) {
		super(dni, nombre);
		this.posicion = posicion;
		this.valor = 0;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getPosicion() {
		return this.posicion;
	}
	
	
	public String toString() {
		String texto = super.toString();
		texto += " valor: "+valor;
		texto += " posicion: "+posicion;
		return texto;
	}

}