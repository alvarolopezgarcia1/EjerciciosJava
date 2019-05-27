import java.util.*;

public class detectarDigito {
  public static void main(String[] args) {

	Scanner s = new Scanner(System.in);  
	
	System.out.println("Por favor introduzca el tamaño del array");
	int tamanio=s.nextInt();
    int[] numeros = new int[tamanio];
    int digito;
    
    for (int i=0; i<numeros.length; i++) {
      System.out.print("Introduzca valor posición "+i+": ");
      numeros[i] = s.nextInt();
    }
    
    System.out.print("Introduzca el dígito que quiere detectar: ");
    digito =s.nextInt();
    
    for (int i=0; i<numeros.length; i++) {
      int numAux = numeros[i];
      boolean encontrado = false;
      do{
        
        int unidades = numAux % 10 ;
        numAux = numAux / 10;
        if (unidades == digito){
          encontrado = true;
        }        
      } while((numAux) >0 && (!encontrado));
      
      if (encontrado) {
        System.out.println(numeros[i]);
      }  
         
          
      
    }   
    
  }  
}