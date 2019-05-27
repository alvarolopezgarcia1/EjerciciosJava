
public class Municipio {
  private String nombre;
  private int extension;
  private int poblacion;
  
  public Municipio (String name, int surface, int population){
    this.nombre = name;
    this.extension = surface;
    this.poblacion = population;           
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public int getPoblacion() {
    return this.poblacion;
  }
  
  public int getExtension() {
    return this.extension;
  }
  
  public void setPoblacion (int population) {
    this.poblacion=population;  
  }
  
  public void setExtension (int surface) {
    this.extension = surface;
  }
  
  public String toString(){
    String resultado="Municipio: " + this.nombre + "\n";
    resultado += "Extensión: " + this.extension + "\n";
    resultado += "Población: " + this.poblacion + "\n";
    return resultado;
  }
  
}