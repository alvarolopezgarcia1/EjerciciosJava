package ej3;

import java.util.*;
public class memoriaPalabras {
	private String nombre;
	private ArrayList<String>memoria=new ArrayList<String>();
	private ArrayList<String>palInvertida=new ArrayList<String>();

	public memoriaPalabras(String nombre) {
		this.nombre = nombre;
	}
	
	public void memorizar(String c) {
		memoria.add(c);
	}
	public void invertir() {
		for(int i=memoria.size()-1; i>=0; i--) {
			palInvertida.add(memoria.get(i));
		}
	}

	@Override
	public String toString() {
		String cadena="";
		int cont=1;
		for(String c:palInvertida) {
			if (cont==palInvertida.size()) {
			 cadena+=c+".";
			}else {
				cadena+=c+",";
				cont++;
			}
		}
		return cadena;
	}
	
	
	
}
