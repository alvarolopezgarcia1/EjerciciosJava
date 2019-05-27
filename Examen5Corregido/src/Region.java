import java.util.ArrayList;

public class Region {
  private String nombre;
  private ArrayList<Municipio> municipios;
  
  public Region (String name) {
    this.nombre = name;
    this.municipios = new ArrayList<Municipio>();
  }
  
  public String getNombre (){
    return this.nombre;
  }
  
  public void addMunicipio (Municipio m) {
    this.municipios.add(m);
  }
  
  public Municipio getMunicipio (String nombre) {
    for (Municipio m : this.municipios) {
      if (m.getNombre().equals(nombre)) {
        return m;
      }    
    }
    return null;
  }
  
  public int getPoblacion(){
    int resultado = 0;
    for (Municipio m: this.municipios) {
      resultado += m.getPoblacion();
    }
    return resultado;
  }
  
  public int getExtension(){
    int resultado = 0;
    for (Municipio m: this.municipios) {
      resultado += m.getExtension();
    }
    return resultado;
  }
  
  public String toString () {
    String resultado = "Región: " + this.nombre +"\n";
    if (this.municipios.size() == 0) {
      resultado += "No tiene municipios registrados.\n";
      return resultado;
    }
    resultado += "Extensión REGION: " + this.getExtension() +"\n";
    resultado += "Población REGION: " + this.getPoblacion() + "\n";
    resultado += "--------------------\n";
    for (Municipio m: this.municipios) {
      resultado += m.toString();
      resultado += "--------------------\n";
    }
    return resultado;
  }
}