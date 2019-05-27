package ej2;

import java.util.*;

import javax.tools.ForwardingFileObject;
public class agenda {
	Scanner s=new Scanner(System.in);
	private String nombre;
	private HashMap<String,String> diccionario=new HashMap<String,String>();
	public agenda(String nombre) {
		this.nombre = nombre;
	}
	
	public void agenda(String nombre) {
		if(diccionario.containsKey(nombre)) {
			System.out.println("este nombre ya está dado de alta, desea actualizar?(si/no)");
			String opcion=s.nextLine();
			if(opcion.equals("si")) {
				System.out.println("Introduzca el numero de telefono por favor: ");
				String telefono=s.nextLine();
				diccionario.put(nombre, telefono);
				System.out.println("el contacto ya ha sido cambiado");
			}
			
		}else {
			System.out.println("introduzca el numero de telefono por favor:");
			String telefono1=s.nextLine();
			diccionario.put(nombre, telefono1);
			System.out.println("telefeno a�adido");
		}
	}
	
	public void BajaAgenda(String nombre) {
		if(diccionario.containsKey(nombre)) {
			diccionario.remove(nombre);
			System.out.println("ha sio borrado");
		}else {
			System.out.println("este nombre no se encuentra");
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
		String cadena="=============================\n";
		for (Map.Entry d : diccionario.entrySet() ) {
			cadena+="nombre: "+d.getKey()+"\n";
			cadena+="telefono: "+d.getValue()+"\n";
			cadena+="=============================\n";
		}
		return cadena;
	}
	
	
}
