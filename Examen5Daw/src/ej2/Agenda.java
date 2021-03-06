package ej2;

import java.util.*;


public class Agenda {
	Scanner s=new Scanner(System.in);
	private String nombre;
	private HashMap<String,String> diccionario=new HashMap<String,String>();
	public Agenda(String nombre) {
		this.nombre = nombre;
	}
	
	public void alta(String nombre) {
		if(diccionario.containsKey(nombre)) {
			System.out.println("este nombre existe, desea actualizar?(si/no)");
			String opcion=s.nextLine();
			if(opcion.equals("si")) {
				System.out.println("Introduzca telefono: ");
				String telefono=s.nextLine();
				diccionario.put(nombre, telefono);
				System.out.println("contacto actualizado");
			}
			
		}else {
			System.out.println("introduzca telefono:");
			String telefono1=s.nextLine();
			diccionario.put(nombre, telefono1);
			System.out.println("telefeno a�adido");
		}
	}
	
	public void baja(String nombre) {
		if(diccionario.containsKey(nombre)) {
			diccionario.remove(nombre);
			System.out.println("borrado");
		}else {
			System.out.println("este nombre no existe");
		}
	}
	
	public void consultar(String nombre) {
		if(diccionario.containsKey(nombre)) {
			System.out.println(diccionario.get(nombre));
		}else {
			System.out.println("-1");
		}
	}

	@Override
	public String toString() {
		String cadena="===================\n";
		for (Map.Entry d : diccionario.entrySet() ) {
			cadena+="nombre: "+d.getKey()+"\n";
			cadena+="telefono: "+d.getValue()+"\n";
			cadena+="=====================\n";
		}
		return cadena;
	}
	
	
}

