import java.util.Scanner;
public class ej3 {
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
    
  System.out.println("introduzca el precio del articulo: ");
  int precio=s.nextInt();
  System.out.println("indique el numero de unidades: ");
  int unidades=s.nextInt();
  System.out.println("introduzca el numero de descuento: ");
  int descuento=s.nextInt();
  System.out.println("pedido desglosado: ");
  System.out.println("-------------------------------------------");
  double precioTotal=precioUnidades(precio,unidades);
  double descuentoAplicado=descuento(precio,descuento,unidades);
  double iva=0.21*(precioTotal-descuentoAplicado);
  double precioDescuento=(precioTotal-descuentoApl219icado);
  double precioFinal=precioDescuento+iva;
  System.out.println("precio del articulo: "+precio);
  System.out.println("numero de unidades: "+unidades);
  System.out.println("precio total de unidades: "+precioTotal);
  System.out.println("descuento aplicado: "+descuentoAplicado);
  System.out.println("precio con descuento: "+(precioTotal-descuentoAplicado));
  System.out.println("IVA: "+iva);
  System.out.println("-------------------------------------------");
  System.out.println("PRECIO FINAL: "+precioFinal);
  
  
  }
  public static double precioUnidades(double x,double y){
    double precio=x*y;
    return precio;
  }
  public static double descuento(double precio,double numero,double unidades){
    double descuento=0;
    if (numero==685){
      return 15;
    }
    if (numero==778){
      if (unidades<20){
        descuento=unidades*precio*0.05;
        return descuento;
      }else {
        return 20*precio*0.05;
      }
    }
    if (numero==219){
      if(unidades>5){
        return precio*5;
      }
    }
    return 0;
  }

}

