import java.util.Scanner;

public class arrayDesDerecha {
  public static void main(String[] args) {
     
	 Scanner s = new Scanner(System.in);
	 System.out.println("¿Cual es el tamaño del vector?");
     
	 int tamanio=s.nextInt();
	  
	 int[] vector = new int[tamanio];
    
  
    
    System.out.println("VECTOR ORIGINAL");
    for (int i=0; i<vector.length; i++) {
      vector[i]=i+1;
      System.out.print(vector[i]+" ");
    }
    
    

    System.out.println(" ");
    

    System.out.println("VECTOR ROTADO 2 posiciones");
 
 
    int aux = vector[vector.length-1];
    
    for (int i=vector.length-2; i>=0; i--) {
      vector[i+1] = vector [i];
    }
    vector[0] = aux;
    
    aux = vector[vector.length-1];
    for (int i=vector.length-1; i>=1; i--) {
      vector[i] = vector [i-1];
    }
    vector[0] = aux;
    
    for (int i=0; i<vector.length; i++) {
      System.out.print(vector[i]+" ");
    }
    
  }
}