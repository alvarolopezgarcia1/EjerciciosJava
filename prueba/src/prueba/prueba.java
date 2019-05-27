import paquete.libreria;

public class prueba {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    if(libreria.esCapicua(numeroIntroducido)){
      System.out.println("es capicua");
    }else{ 
      System.out.println("no es capicua");
    }
  }
}
