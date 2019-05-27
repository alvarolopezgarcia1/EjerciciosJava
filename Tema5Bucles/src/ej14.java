
//Escribe un programa que pida una base y un exponente (entero positivo) y 
//que calcule la potencia.
import java.util.*;

public class ej14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int base;

		int exponente;

		int aux=1;

		System.out.println("Por favor introduzca un numero que acutará como base");

		base = s.nextInt();

		System.out.println("Ahora un numero entero que actúe como potencia");

		exponente = s.nextInt();

		for (int i = 0; i < exponente; i++) {

			aux*=base;
		}

		System.out.println(aux);
	}

}
