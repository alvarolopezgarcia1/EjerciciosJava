package repasoExamen;

import java.util.Scanner;

public class DetectarDigitoFuncion {
	  
	  public static void main(String[] args) {
		  
		Scanner s = new Scanner(System.in);  
	    int[] numeros = new int[10];
	    int digito;
	    
	    for (int i=0; i<10; i++) {
	      System.out.print("Introduzca valor posición "+i+": ");
	      numeros[i] = s.nextInt();
	    }
	    
	    System.out.print("Introduzca el dígito que quiere detectar: ");
	    digito = s.nextInt();
	    
	    for (int i=0; i<10; i++) {
	      if (detectarDigito(numeros[i],digito)) {
	        System.out.println(numeros[i]);
	      }  
	    }   
	    
	  }
	  
	  
	  public static boolean detectarDigito (int numero, int digito) {
	    boolean resultado = false;
	    
	    do{
	        
	        int unidades = numero % 10 ;
	        numero = numero / 10;
	        if (unidades == digito){
	          resultado = true;
	        }        
	    } while((numero) >0 && (!resultado));
	    
	    
	    return resultado;
	  }
	}