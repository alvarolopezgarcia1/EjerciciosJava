package examen6;
import java.util.*;

//ejercicio 1 Álvaro
public class ej {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		

		 
		/*
		 * 1. [2,5 puntos] Escriba un programa que, mediante un menú interactivo,
		 * permita realizar las siguientes funciones: a) Encriptación de mensajes:
		 * Solicitará un mensaje por pantalla y llevará a cabo un ciframiento de César,
		 * consistente en desplazar cada carácter del alfabeto inglés 3 posiciones hacia
		 * adelante. Así, la letra ‘a’ pasará a ser la ‘d’, la letra ‘b’ pasará a ser la
		 * ‘e’, y así sucesivamente, interpretando el alfabeto como una secuencia
		 * circular (detrás de la letra ‘z’ sigue la letra ‘a’). Desencriptación de
		 * mensajes: Solicitará un mensaje por consistente en desplazar cada carácter
		 * del alfabeto ingĺes 3 posiciones hacia atrás. Salir. Las funciones de
		 * encriptado y desencriptado han de implementarse en funciones aparte, las
		 * cuales serán invocadas desde el programa principal, y sin llevar a cabo E/S
		 * por consola.
		 */
		
		int opcion;
		
		String palabra;
		
		do { 
			
			System.out.println("1-Encriptar mensaje"); 
			System.out.println("2-Desencriptar mensaje"); 
			System.out.println("3-Salir"); 
			opcion =s.nextInt();
			
			switch (opcion) {
			case 1:
			
			System.out.println("Introduzca palabra:"); 
		    
			palabra = s.nextLine();	
			
		    for (int i=0; i>palabra.length(); i++ ) {
				
			char posicion = palabra.charAt(i);
		
		 
	
		    
			}
			
		
			}
			  break;
		
		} while(opcion!=3 );
		

	}

}
