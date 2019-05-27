package ej3;
import java.util.*;

public class prueba {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		memoriaPalabras m=new memoriaPalabras("javi");
		System.out.println("introduce palabras, teclea salir para parar");
		String palabra;
		do {
			palabra=s.nextLine();
			if(!palabra.equals("salir")) {
				m.memorizar(palabra);
			}
		} while (!palabra.equals("salir"));
		m.invertir();
		System.out.println(m);
	}

}
