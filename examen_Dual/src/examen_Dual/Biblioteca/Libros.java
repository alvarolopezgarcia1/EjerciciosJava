package Biblioteca;

public class Libros extends bibilioteca1 {

	public Libros(int codigo, String titulo, int año) {
		super(codigo, titulo, año);

	}

	private boolean prestado;

	public void configura_prestado(String prestado) { 

		if (prestado.equalsIgnoreCase("si")) {

			this.prestado = true;

		} else {

			this.prestado = false;

		}

	}

	public String dime_prestado() {

		if (prestado == true) {

			return "El libro está prestado"; // 
		} else {

			return "El libro está disponible";

		}
	}

	@Override
	public String toString() {
		return "Código: " + getCodigo() + ", Título= " + getTitulo() + ", año=" + getAño() + ", prestado= " + prestado;
	}

}
