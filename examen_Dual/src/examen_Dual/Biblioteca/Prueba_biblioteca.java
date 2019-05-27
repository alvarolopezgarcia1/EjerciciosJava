package Biblioteca;

public class Prueba_biblioteca {

	public static void main(String[] args) {

		Libros lazarillo = new Libros(1, "Lazarillo de Tormes", 1517);
		
		lazarillo.configura_prestado("si");

		System.out.println(lazarillo.dime_prestado());

		System.out.println(lazarillo);

		Revistas PlayMania = new Revistas(2, "PlayMania", 1999, 48);

		System.out.println(PlayMania);

	}

}
