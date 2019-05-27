
/*Implementa el control de acceso al área restringida de un programa. Se debe 
pedir un nombre de usuario y una contraseña. Si el usuario introduce los
datos correctamente, el programa dirá “Ha accedido al área restringida”. El 
usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades 
el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres 
de usuario con sus correspondientes contraseñas deben estar almacenados 
en una estructura de la clase HashMap.*/

import java.util.*;

import java.util.HashMap;

public class ej6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		HashMap<Integer, String> contraseña = new HashMap<Integer, String>();

		contraseña.put(883, "Alice");

		int codigoIntroducido;

		String nombre;
		
		boolean codigoCorrecto = false;
		
		int numeroIntentos = 0;
            
		   do{
			System.out.print("Por favor, introduzca un código: ");
			codigoIntroducido =(s.nextInt());
			
			//System.out.print("Por favor, introduzca un nombre: ");
			
			nombre=s.nextLine();

			if ((contraseña.containsKey(codigoIntroducido))){
				
				codigoCorrecto = true;
				System.out.print("Acceso permitido");
		
			} else {
				System.out.print("El código introducido no existe.");
			
			} 
			
			numeroIntentos++;
			
			} while(codigoCorrecto==false && numeroIntentos<=4);
		   
	}
	
}