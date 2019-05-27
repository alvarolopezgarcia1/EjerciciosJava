package examen6;

//ejercicio 2
//Álvaro
import java.util.*;



public class ej2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Multiplicacion especial");

		int num;

		int num2;

		System.out.println("Introduzca un numero");

		num = s.nextInt();

		System.out.println("Introduzca otro numero");

		num2 = s.nextInt();

		System.out.println(multiplicacionEsp(num, num2));

	}

	public static int multiplicacionEsp(int num, int num2) {

		int multiplicacion = num * num2;

		return multiplicacion;

	}

}
