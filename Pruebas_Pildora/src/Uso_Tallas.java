import java.util.*;

public class Uso_Tallas {

	// tipos enumerados ejemplo asi se puede pero abajo se hace con constructor
	// enum Talla { Mini, Mediano, Grande, Muy_Grande};

	enum Talla {

		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private Talla(String abreviatura) {

			this.abreviatura = abreviatura;

		}

		public String dameAbreviatura() {

			return abreviatura;
		}

		private String abreviatura;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una talla");

		String entrada_datos = entrada.nextLine();// EJEM: MEDIANO

		// se detecta el valor introducido por el usuario

		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos); // clase a la que pertenece, dato introducido por
																	// usuario

		System.out.println("Talla= " + la_talla);

		System.out.println("abreviatura=  " + la_talla.dameAbreviatura());
		
		
	}

}
