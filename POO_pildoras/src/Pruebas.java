
public class Pruebas {

	public static void main(String[] args) {

		Empleados trabajador1 = new Empleados("Paco");

		Empleados trabajador2 = new Empleados("Maria");

		Empleados trabajador3 = new Empleados("Antonio");

		Empleados trabajador4 = new Empleados("María del C.");

		trabajador1.CambiaSeccion("Comercial");

		System.out.println(
				trabajador1.devueveDatos() + "\n" + trabajador2.devueveDatos() + "\n" + trabajador3.devueveDatos());

		System.out.println(Empleados.dameIdSiguiente());
		
		

	}

}

class Empleados {

	public Empleados(String nom) { // constructor

		this.nombre = nom;

		seccion = "Administración";

		Id = IdSiguiente;

		IdSiguiente++;

	}

	public void CambiaSeccion(String Seccion) { // setter

		this.seccion = Seccion;

	}

	public String devueveDatos() {

		return "El nombre es: " + nombre + " y la seccion es " + seccion + " y la id es: " + Id;
	}

	public static String dameIdSiguiente() { // setter

		return "El id siguiente es " + IdSiguiente;
	}

	private final String nombre;

	private String seccion;

	private int Id;

	private static int IdSiguiente = 1;

}
