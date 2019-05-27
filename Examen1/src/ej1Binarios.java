import java.util.*;

public class ej1Binarios {
  public static void main (String[] args) {
	  
	Scanner s = new Scanner(System.in);  
	  
    int numeroDecimal;
    String numeroEnBinario = "";
    
    do {
      System.out.print("Introduzca un nº decimal (entre 0 y 9999):");
      numeroDecimal = s.nextInt();
    } while ((numeroDecimal <0) || (numeroDecimal > 9999));
    
    int cociente = numeroDecimal;
    int resto;
  
    while (cociente > 0) {
        resto = cociente % 2;
        cociente = cociente / 2;
        
        numeroEnBinario = resto + numeroEnBinario;
      
    }
  
    if (numeroEnBinario == "") {
      numeroEnBinario = "0";
      
    }
  
    System.out.println("El número " + numeroDecimal + " se escribe en binario así: " + numeroEnBinario);
  }
}