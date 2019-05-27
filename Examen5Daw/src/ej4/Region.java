package ej4;

public class Region extends Pais{

	

	public Region(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	private String nomReg;

	public String getNomReg() {
		return nomReg;
	}

	@Override
	public String toString() {
		return "Region [nomReg=" + nomReg + "]";
	}

	public void setNomReg(String nomReg) {
		this.nomReg = nomReg;
	}
	
	

}
