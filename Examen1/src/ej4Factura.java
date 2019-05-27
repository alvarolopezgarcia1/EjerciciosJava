import java.util.*;


public class ej4Factura {
  public static void main (String[] args) {
	  
    Scanner s = new Scanner(System.in);  
    
    float dineroInicial;
    float rentabilidadMensual; // entendida como %
    float dineroFinal;
    
    int cantidadMinMeses = 0;
    
    System.out.print ("Introduzca la cantidad inicial de dinero: ");
    dineroInicial = s.nextFloat();
    
    System.out.print ("Introduzca la rentabilidad mensual (entendida como %, sin símbolo %): ");
    rentabilidadMensual = s.nextFloat();
    
    System.out.print ("Introduzca la cantidad final de dinero: ");
    dineroFinal = s.nextFloat();
    		
    
    
    // rentabilidad ingresada "al final del periodo"
    
    float dineroActual = dineroInicial;
  
    while (dineroActual < dineroFinal) {
      dineroActual += dineroInicial*rentabilidadMensual/100;
      cantidadMinMeses++;      
    }
  
    System.out.println("Necesitará " + cantidadMinMeses + " meses para llegar al dinero final indicado");
  
  }

}