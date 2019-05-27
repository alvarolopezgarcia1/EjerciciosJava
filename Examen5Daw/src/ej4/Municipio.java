package ej4;

public class Municipio extends Region {

	public Municipio(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	private String nomCiu;

	private String poblacion;

	@Override
	public String toString() {
		return "Municipio [nomCiu=" + nomCiu + ", poblacion=" + poblacion + ", extension=" + extension + "]";
	}

	public String getNomCiu() {
		return nomCiu;
	}

	public void setNomCiu(String nomCiu) {
		this.nomCiu = nomCiu;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public int getExtension() {
		return extension;
	}

	public void setExtension(int extension) {
		this.extension = extension;
	}

	private int extension;

}
