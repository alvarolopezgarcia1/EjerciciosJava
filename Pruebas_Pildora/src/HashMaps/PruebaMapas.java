package HashMaps;

import java.util.*;

public class PruebaMapas {

	public static void main(String[] args) {

		// ejemplo con objetos
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();

		personal.put("145", new Empleado("Juan"));
		personal.put("146", new Empleado("Juanito"));
		personal.put("147", new Empleado("Juan David"));
		personal.put("148", new Empleado("Juan Miguel"));

		// borrado con remove
		personal.remove("147");

		// al meter uno nuevo en el mismo valor machacamos

		personal.put("148", new Empleado("Jessi"));
		
		
		//mostramos diccionario
		
		System.out.println(personal);
		
		//entryset gracias a el podremos hacer bucle for each
		
		System.out.println(personal.entrySet());
		
		for (Map.Entry<String, Empleado> entrada: personal.entrySet()) {
			
			String clave=entrada.getKey();
			
			Empleado valor=entrada.getValue();
			
			System.out.println("Clave= " + clave + "Valor= " + valor);
		}
	}

}

class Empleado {

	public Empleado(String n) {

		nombre = n;

		sueldo = 2000;

	}

	public String toString() {

		return "Nombre= " + nombre + " sueldo= " + sueldo;
	}

	private String nombre;

	private double sueldo;

}
