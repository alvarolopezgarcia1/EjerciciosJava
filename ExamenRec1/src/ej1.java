import java.util.*;

public class ej1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int altura = 0;
    int anchura = 0;
    int fila = 0;

    System.out.print("Introduzca la altura: ");
    altura = Integer.parseInt(entrada.nextLine());
    if (altura < 3 || altura > 14) {
      System.out.print("Error. La altura debe ser entre 3 y 14");
    } else {
      System.out.print("Introduzca la anchura: ");
      anchura = Integer.parseInt(entrada.nextLine());
      if (anchura < 3 || anchura > altura * 2) {
        System.out.print("Error la anchura debe ser entre 3 y el doble de la altura");
      } else {
        System.out.print("Introduzca la fila: ");
        fila = Integer.parseInt(entrada.nextLine());
        if (fila < 1 || fila > altura - 1) {
          System.out.print("La fila tiene que estar entre 1 y la altura-1");
        } else {
          System.out.println("Hasta aqui bien");
          for (int i = 0; i <= altura; i++) {
            if (i >= 0 && i < altura) {
              //System.out.println("C");
              for (int k = 0; k < anchura; k++) {
                if (k == 0 || k == anchura) {
                  System.out.print("*");
                } else if (k > 0 && k <= anchura-2) {
                  if (fila-1 != i) {
                    System.out.print(" ");
                    
                  } else {
                    if (fila-1 == i) {
                      System.out.print("*");
                    }
                  }
                  
                }
                
              }
              System.out.print("*");
              System.out.println("");
            }
          }
        }
      }
    }
  }
}