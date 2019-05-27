
import java.util.*;

public class PruebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, empleado> personal=new HashMap<String, empleado>();
		
		personal.put("144", new empleado("Alvaro"));
		
		personal.put("145", new empleado("Pepe"));
		
		personal.put("146", new empleado("Jose"));
		
		personal.put("147", new empleado("Manuel"));
		
		personal.put("148", new empleado("Romero"));
		
		System.out.println(personal);
		
		//para borrar metemos el codigo así, imprimimos y vemos como queda
		
		personal.remove("147"); 
		
		System.out.println(personal);
		

	}
}

	class empleado {

		public empleado(String n) {

			nombre = n;

			sueldo = 2000;

		}

		public String toString(){
			
			return "Nombre= " + nombre + " sueldo=" + sueldo;
		}

		private String nombre;

		private double sueldo;

	}
