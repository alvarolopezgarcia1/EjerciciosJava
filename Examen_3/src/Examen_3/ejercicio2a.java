//este programa compara dos numeros y te dice si alguna cifra se repite

package Examen_3;

import java.util.*;

public class ejercicio2a {
  public static void main(String[] args) {
	  
	Scanner s = new Scanner(System.in);
	 
    long numero1, numero2;
    
    System.out.print("Por favor, introduzca el primer número entero positivo: ");
    numero1 = s.nextLong();
    System.out.print("Por favor, introduzca el segundo número entero positivo: ");
    numero2 = s.nextLong();
    
    long auxiliar1 = numero1;
    long auxiliar2 = numero2;
    
    int contadorDigitos = 0;
    
    boolean[] digitosEnSegundoNumero = new boolean[10];
    for (int i=0; i<10; i++) {
      digitosEnSegundoNumero[i] = false;
    }
    
    while (auxiliar2 >0) {
      digitosEnSegundoNumero[unidades(auxiliar2)] = true;
      auxiliar2 = quitaUnidades(auxiliar2);
    }
    
    while (auxiliar1 > 0) {
      if (digitosEnSegundoNumero[unidades(auxiliar1)]==true) {
        contadorDigitos++;
      }
      auxiliar1 = quitaUnidades(auxiliar1);
    }
    System.out.println("En el número "+numero1+" hay "+contadorDigitos+" dígitos que están en el número "+numero2);
  }
  
  public static int unidades (long x) {
    return ((int)(x % 10));
  }
  
  public static long quitaUnidades (long x) {
    return (x / 10);
  }
}