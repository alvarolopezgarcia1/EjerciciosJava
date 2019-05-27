package ej4;

public class Pais {
	

	private String nombre;
	
	public Pais(String nombre) {
		
		this.nombre=nombre;
	}



	@Override
	public String toString() {
		return "Pais [nomPais=" + nombre + "]";
	}

	public String getNomPais() {
		return nombre;
	}

	public void setNomPais(String nomPais) {
		this.nombre = nomPais;
	}

}
