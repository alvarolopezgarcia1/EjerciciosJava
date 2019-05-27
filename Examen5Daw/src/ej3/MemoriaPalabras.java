//Álvaro
package ej3;

public class MemoriaPalabras {
	
	private String nombre;
	
	public MemoriaPalabras(String nombre) {
		
		this.nombre=nombre;
	}
	

	@Override
	public String toString() {
		return "MemoriaPalabras [nombre=" + nombre + "]";
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}


