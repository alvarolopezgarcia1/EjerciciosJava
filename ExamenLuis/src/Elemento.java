
/**
 *
 * @author tux
 */
public class Elemento {
  private String producto;
  private float precio;
  private int cantidad;
  
  public Elemento (String productoIn, float precioIn, int cantidadIn) {
    this.producto = productoIn;
    this.precio = precioIn;
    this.cantidad = cantidadIn;
  }
  
  public String toString() {
    String salida;
    salida = this.producto;
    salida += " PVP: " + this.precio;
    salida += " Cantidad: " + this.cantidad;
    salida += " Subtotal: "+ String.format("%.2f",this.precio*this.cantidad);
    return salida;
  }
  
  public float getSubtotal() {
    return (this.precio*this.cantidad);
  }
}