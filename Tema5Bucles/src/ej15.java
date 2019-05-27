
/*Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el 
numero dado y exponentes entre uno y el exponente introducido. No se deben 
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5, 
se deberán mostrar 2 , 2 , 2 , 2 y 2 .*/

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int base;

		int exponente;

		System.out.println("Por favor introduzca un numero que acutará como base");

		base = s.nextInt();

		System.out.println("Ahora un numero entero que actúe como potencia");

		exponente = s.nextInt();

		for (int i = 1; i < exponente+1; i++) {

			System.out.print(base + "*" + i + ", ");
		}

	}

}
