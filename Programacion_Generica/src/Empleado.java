
public class Empleado {

	private String nombre; // variables

	private int edad;

	private double salario;

	public Empleado(String nombre, int edad, double salario) { // constructor

		this.nombre = nombre;

		this.edad = edad;

		this.salario = salario;

	}

	public String dameDatos() {

		return "El empleado se llama " + nombre + " tiene " + edad + " años" + " y cobra " + salario + "€";
	}

} 
