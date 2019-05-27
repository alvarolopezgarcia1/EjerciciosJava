/*Este programa te dice si el numero introducido está dentro de una lista */



package prueba;

import java.util.Scanner;

public class pruebasDetectar {
	  public static void main(String[] args){
		  
		Scanner s = new Scanner(System.in);  
	    int[] numeros = new int[5];
	    int valorUsuario;
	    
	    for (int i=0; i<5; i++) {
	      System.out.println("Introduce valor "+i+":" );
	      numeros[i] = s.nextInt();
	    }
	    
	    boolean salir = false;
	    
	    do {
	      
	      System.out.println("Introduce valor: ");
	      valorUsuario = s.nextInt();
	      
	      // veamos si está
	      boolean encontrado = false;
	      
	      for (int i=0; (i<5)&&(!encontrado); i++){
	        if (valorUsuario == numeros[i]) {
	          encontrado = true;
	        }
	      }
	      
	      if (encontrado) {
	        System.out.println("Lo veo");
	      } else {
	        System.out.println("No lo veo");
	      }
	      
	      if (valorUsuario==0) {
	        salir = true;
	      }
	      
	    } while (!salir);
	    
	    
	    
	  }
	}