package Biblioteca;

public class Revistas extends bibilioteca1 {

	private int num;

	public Revistas(int num) {

		super();
		this.num = num;
	}

	public Revistas(int codigo, String titulo, int año, int num) {
		super(codigo, titulo, año);
		this.num = num;
	}

	public int getnum() {

		return this.num;
	}

	@Override
	public String toString() {
		return "Código: " + getCodigo() + ", Título= " + getTitulo() + ", año=" + getAño() + ", numero= " + num;
	}

}
