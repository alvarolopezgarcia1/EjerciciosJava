
import java.util.*;

public class uso_empleado {

	public static void main(String[] args) {

		jefatura jefe_RRHH = new jefatura("Pepe", 55000, 2006, 9, 25);

		jefatura jefa = new jefatura("Lucia", 55000, 2006, 9, 25);

		jefe_RRHH.estableceIncentivo(2570);

		empleado[] misEmpleados = new empleado[6];

		empleado director_comercial = new jefatura("Sandra", 85000, 2012, 05, 05);

		Comparable ejemplo = new empleado("elisabeth", 95555, 2011, 06, 07);

		if (director_comercial instanceof empleado) {

			System.out.println("Es de tipo Jefatura");
		}

		misEmpleados[0] = new empleado("Paco", 12500, 1990, 12, 17);
		misEmpleados[1] = new empleado("Maria", 18500, 1997, 10, 13);
		misEmpleados[2] = new empleado("Lourdes", 13500, 1991, 8, 16);
		misEmpleados[3] = new empleado("lolo");

		// ejemplo de poliformismo. principio de sustitucion
		misEmpleados[4] = jefe_RRHH;
		//

		misEmpleados[5] = new jefatura("Maria", 98000, 1999, 5, 26);

		// a esto se le llama casting es lo mismo que pasar de int a string, ya que los
		// objetos son clases
		// no se podria hacer casting de empleado a jefe
		jefatura Jefa_Finanzas = (jefatura) misEmpleados[5];
		//
		Jefa_Finanzas.estableceIncentivo(5000);

		System.out.println(Jefa_Finanzas.tomar_decisiones("Dar mas vacaciones"));

		/*
		 * for (int i = 0; i < misEmpleados.length; i++) {
		 * 
		 * misEmpleados[i].subeSueldo(5); }
		 */

		// lo mismo que el de arriba pero con for mejorado donde queda todo mas resumido

		for (empleado e : misEmpleados) {

			e.subeSueldo(5);

		}

		// ORDENAMOS CON SORT antes de imprimir se necesita compareto antes

		Arrays.sort(misEmpleados);

		for (int i = 0; i < misEmpleados.length; i++) {

			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo()
					+ " Fecha: " + misEmpleados[i].dameFechaContrato());
		}

	}

}

class empleado implements Comparable {

	public empleado(String nom, double sue, int anio, int mes, int dia) {

		this.nombre = nom;
		this.sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
		altaContrato = calendario.getTime();

		id = idSiguiente;

		idSiguiente++;
	}

	public empleado(String nom) {

		this(nom, 30000, 2000, 01, 0); // así le damos valores por defecto sin tener que introducirlos a los empleadosb

	}

	public static String dameIdSiguiente() { // metodo statico

		return "El id es es: " + idSiguiente;
	}

	public String dameNombre() { // getter

		return nombre;
	}

	public double dameSueldo() { // getter
		return sueldo;

	}

	public Date dameFechaContrato() { // getter

		return altaContrato;
	}

	public void subeSueldo(double porcentaje) { // setter

		double aumento = sueldo * porcentaje / 100;

		sueldo += aumento;

	}

	// implementamos interfaz compareto por sueldo si cambiamos sueldo ordena por
	// otrakj
	public int compareTo(Object miObjeto) {

		empleado otroEmpleado = (empleado) miObjeto;

		if (this.sueldo < otroEmpleado.sueldo) {

			return -1;
		}
		if (this.sueldo > otroEmpleado.sueldo) {

			return 1;
		}

		return 0;
	}

	//

	private String nombre;

	private double sueldo;

	private Date altaContrato;

	private int id;

	private static int idSiguiente;

}

/* final "si lo ponemos delante de jefatura no podemos heredar de ella */

class jefatura extends empleado implements Jefes { // implementamos interfaz

	// llamamos al constructor de la clase padre

	public jefatura(String nom, double sue, int anio, int mes, int dia) {

		// al haber dos constructores en el supero debems meter parametros en el super
		// manera de heredar de la clase empleado

		super(nom, sue, anio, mes, dia);
	}

	public void estableceIncentivo(double b) { // setter

		incentivo = b;
	}

	public double dameSueldo() { // dandole el mismo nombre machacamos el metodo con el mismo nombre de la clase
									// padre

		double sueldoJefe = super.dameSueldo(); // hereda el sueldo de la clase padre, si no cojería este.

		return sueldoJefe + incentivo;
	}

	private double incentivo;

	public String tomar_decisiones(String decision) {

		return "Un miembro de la direccion ha tomado la decision de: " + decision;
	}

}

class director extends jefatura {

	public director(String nom, double sue, int anio, int mes, int dia) {

		super(nom, sue, anio, mes, dia);

	}

}