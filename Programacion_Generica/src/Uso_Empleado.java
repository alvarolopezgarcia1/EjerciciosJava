import java.util.*;

public class Uso_Empleado extends Empleado {

	public Uso_Empleado(String nombre, int edad, double salario) {
		super(nombre, edad, salario);

	}

	public static void main(String[] args) {

		// ARRAY NORMAL
		/*
		 * Empleado listaEmpleados[] = new Empleado[3];
		 * 
		 * listaEmpleados[0] = new Empleado("Ana", 45, 2500);
		 * 
		 * listaEmpleados[1] = new Empleado("Antonio", 45, 2500);
		 * 
		 * listaEmpleados[2] = new Empleado("Maria", 45, 2500);
		 */

		// ARRAYLIST

		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

		// listaEmpleados.ensureCapacity(11); tamaño estimado pero puedes crear mas

		listaEmpleados.add(new Empleado("Ana", 45, 2500));

		listaEmpleados.add(new Empleado("Antonio", 55, 2500));

		listaEmpleados.add(new Empleado("Maria", 85, 2500));

		listaEmpleados.add(new Empleado("Jose", 85, 2500));

		listaEmpleados.add(new Empleado("Ana", 45, 2500));

		// metemos un objeto en una posicion concreta del Arrraylist con set

		listaEmpleados.set(1, new Empleado("Olga", 41, 1800));// mete en la posicion 1 al objeto

		System.out.println(listaEmpleados.get(4).dameDatos());

		// Saber tamaño arraylist con size

		System.out.println("El tamaño del arraylist es: " + listaEmpleados.size());

		// bucle foreach para imprimirlo todo

		for (Empleado e : listaEmpleados) {

			System.out.println(e.dameDatos());
		}

		/*
		 * // bucle convecional con Arraylist es lo mismo, pero se recomienda el de
		 * arriba
		 * 
		 * for (int i = 0; i < listaEmpleados.size(); i++) {
		 * 
		 * Empleado e = listaEmpleados.get(i);
		 * 
		 * System.out.println(e.dameDatos()); }
		 */

		// Pasar a un array normal un arraylist, hay que indicar tamaño y se hace con
		// size
		/*
		 * Empleado arrayEmpleado[]=new Empleado[listaEmpleados.size()];
		 * 
		 * //Y ahora metemos los datos con toArray
		 * listaEmpleados.toArray(arrayEmpleado);
		 * 
		 * // y ahora lo sacamos por pantalla con un for normal, por tanto es lo mismo
		 * lo de arriba for (int i=0; i<arrayEmpleado.length; i++) {
		 * 
		 * System.out.println(arrayEmpleado[i].dameDatos());
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
		
		
		//iterator ejemplo
		
		Iterator<Empleado> mi_iterador=listaEmpleados.iterator();
		
		while(mi_iterador.hasNext()) {
			
			System.out.println(mi_iterador.next().dameDatos());
		}

	}

}
