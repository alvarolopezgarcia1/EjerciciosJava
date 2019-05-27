package ej3;

public class Persona {
	
	  String nombre="";
	  
	  public Persona (String nombre) {
	    this.nombre = nombre;
	  }
	  
	  public String getNombre() {
	    return this.nombre;
	  }
	  
	  public String toString () {
	    String salida = "Nombre: ";
	    salida += this.nombre;
	    return salida;
	  }
	  
	}