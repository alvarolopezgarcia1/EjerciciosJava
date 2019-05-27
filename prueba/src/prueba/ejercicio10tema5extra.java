
package prueba;


import java.util.Scanner;

public class ejercicio10tema5extra {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String palabra;
		String total= "";
		
		do {
		Scanner s = new Scanner(System.in); 
		System.out.print("Introduzca una palabra (acaba con “salir”): "); 
		palabra = s.nextLine();
		
		
		
		if (!palabra.equals("salir")) {
			total= total+" "+palabra+" ";
				}
		
		
		} while (!palabra.equals("salir"));
     
		System.out.print(total); 
	}

}
