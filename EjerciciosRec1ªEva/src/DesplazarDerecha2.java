public class DesplazarDerecha2 {
  public static void main(String[] args) {
    int[] vector = new int[5];
    int[] vector2 = new int[5];
    
    
    System.out.println("VECTOR ORIGINAL");
    
    for (int i=0; i<5; i++) {
      vector[i]=i+1;
      System.out.print(vector[i]+" ");
    }
    
    
    System.out.println("");
    
    System.out.println("VECTOR DESPLAZADO 3 posiciones");
    for (int i=0; i<5; i++) {
      vector2[(i+3)%5] = vector[i];
    }
    
    
    
    
    for (int i=0; i<5; i++) {
      System.out.print(vector2[i]+" ");
    }
    
  }
}