
/*Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación, 
muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra 
todo el ArrayList sin usar ningún índice.*/

import java.util.*;

public class ej1 {

	public static void main(String[] args) {

		ArrayList<String> nombresCompañeros = new ArrayList<String>();
	    String[] array = new String[nombresCompañeros.size()];
		array = nombresCompañeros.toArray(array);
		
	for (String nombre : array) {
		
		System.out.println(nombre);
			
		}

		nombresCompañeros.add("Pepe");
		nombresCompañeros.add("Manolo");
		nombresCompañeros.add("Antonio");
		nombresCompañeros.add("Jose");
		nombresCompañeros.add("Fernando");
		nombresCompañeros.add("Carlos");

		System.out.print("Los nombres son: ");
		for (String nombre : nombresCompañeros) {
			
		}
	}

}
