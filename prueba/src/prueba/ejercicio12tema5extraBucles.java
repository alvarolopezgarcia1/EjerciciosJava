//Realice un programa que capture palabras por teclado y las presente en orden inverso en que las introdujo. El 
//programa pedir� recurrentemente palabras, y se detendr� cuando la palabra introducida sea �salir� o haya
//introducido 4 palabras. Entonces mostrar� por pantalla todas las palabras anteriores introducidas.



package prueba;

import java.util.Scanner;

public class ejercicio12tema5extraBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palabra;
		String total= "";
		int contador=0;
		
	
		do {
		Scanner s = new Scanner(System.in); 
		System.out.print("Introduzca una palabra (acaba con �salir�): "); 
		palabra = s.nextLine();
		
		
		
		if (!palabra.equals("salir")) {
			total= total +" "+ palabra+ "  ";
				}
		contador++;
		
		} while (!palabra.equals("salir") && (contador!=4));
     
		System.out.print(total); 
	}

}


