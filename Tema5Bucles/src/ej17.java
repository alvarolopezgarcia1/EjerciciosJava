
/*Realiza un programa que sume los 100 números siguientes a un número entero 
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).*/

import java.util.*;

public class ej17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numIntroducido;
		
		System.out.println("Introduce un numero entero positivo");
		
		numIntroducido=s.nextInt();
				
		if(numIntroducido<0) {
			
			System.out.println("Lo siento, es negativo");
		} else {
			
			for(int i=0; i<100; i++) {
				
				System.out.println(numIntroducido+i);
			}
		}

		
	}

}