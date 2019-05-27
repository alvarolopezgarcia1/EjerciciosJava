/*1. Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200 ambos incluidos y que
los almacene en un array. A continuación se debe mostrar el contenido de ese array junto al índice (0
– 9). Seguidamente el programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego mayor… Cuando se
acaben los menores o los mayores, se completará con los números que queden.*/




package prueba;

public class pruebaExamen {
	  public static void main(String[] args) {
	    int[] original = generaArrayInt(10, 200, 0);
	    int numeroDeMayores = 0;
	    for (int i = 0; i < 10; i++) {
	      if(esMayor(original[i])) {
	        numeroDeMayores++;
	      }
	    }
	    int numeroDeMenores = 10 - numeroDeMayores;
	    boolean esMaximo;
	    if(numeroDeMayores > numeroDeMenores) {
	      esMaximo = true;
	    }else {
	      esMaximo = false;
	    }
	    
	    int[] mayores = new int[numeroDeMayores];
	    for (int i = 0; i < 1; i++) {
	      for (int j : original) {
	        if(esMayor(j)) {
	          mayores[i] = j;
	          i++;
	        }
	      }
	    }
	    int[] menores = new int[numeroDeMenores];
	    for (int i = 0; i < 1; i++) {
	      for (int j : original) {
	        if(!esMayor(j)) {
	          menores[i] = j;
	          i++;
	        }
	      }
	    }
	    
	    int[] resultado = new int[10];
	    int auxMay = 0;
	    int auxMen = 0;
	    
	    for (int i = 0; i < 10; i++) {
	      if(esMaximo){
	        if(auxMen < numeroDeMenores){
	          if(esPar(i)){
	            resultado[i] = mayores [auxMay];
	            auxMay++;
	          }else {
	            resultado[i] = menores [auxMen];
	            auxMen++;
	          }
	        }else {
	          resultado[i] = mayores [auxMay];
	          auxMay++;
	        }
	      }else {
	        if(auxMay < numeroDeMayores){
	          if(esPar(i)){
	            resultado[i] = mayores [auxMay];
	            auxMay++;
	          }else {
	            resultado[i] = menores [auxMen];
	            auxMen++;
	          }
	        }else {
	          resultado[i] = menores [auxMen];
	          auxMen++;
	        }
	      }
	    }
	    
	    
	    
	    System.out.println("Array original:");
	    System.out.printf("%9s", "Índice ->");
	    for (int i = 0; i < 10; i++) {
	      System.out.printf("%4d ", i);
	    }
	    System.out.println("");
	    System.out.printf("%9s", "Valor ->");
	    for (int i : original) {
	      System.out.printf("%4d ", i);
	    }
	    System.out.println("");
	    System.out.println("Array resultado:");
	    System.out.printf("%9s", "Índice ->");
	    for (int i = 0; i < 10; i++) {
	      System.out.printf("%4d ", i);
	    }
	    System.out.println("");
	    System.out.printf("%9s", "Valor ->");
	    for (int i : resultado) {
	      System.out.printf("%4d ", i);
	    }
	  }
	  
	  public static int[] generaArrayInt(int n, int max, int min) {
	    int[] array = new int[n];
	    
	    for(int i = 0; i < n; i++) {
	      array[i] = (int)(Math.random() * (max - min + 1) + min);
	    }
	    return array;
	  }
	  public static boolean esMayor(int n) {
	    if(n >= 100){
	      return true;
	    }else {
	    return false;
	    }
	  }
	  public static boolean esPar(int n) {
	    if(n % 2 == 0){
	      return true;
	    }else {
	    return false;
	    }
	  }
	}