
import java.util.ArrayList;

/**
 *
 * @author Alvaro
 */
public class Carrito {
  private ArrayList<Elemento> articulos;
  
  public Carrito () {
    articulos = new ArrayList<Elemento>();
  }
  
  public String toString() {
    String salida = "Contenido del carrito\n";
    salida += "=====================\n";
    for (Elemento e:this.articulos) {
      salida += e.toString()+"\n";
    }
    
    
    return salida;
  }
  
  public void agrega (Elemento a) {
    this.articulos.add(a);
  }
  
  public int numeroDeElementos() {
    return this.articulos.size();
  }
  
  public float importeTotal () {
    float resultado = (float)0.0;
    for (Elemento e: this.articulos) {
      resultado += e.getSubtotal();
    }
    
    return resultado;
  }
  
}