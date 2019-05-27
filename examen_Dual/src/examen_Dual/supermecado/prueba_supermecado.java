package supermecado;

import java.util.ArrayList;

public class prueba_supermecado extends persona {

	public static void main(String[] args) {

	
		ArrayList<persona> gente = new ArrayList<persona>();

		gente.add(new persona("74866887z", "Pepe"));
		gente.add(new persona("74845787z", "Jose"));
		gente.add(new persona("12466887z", "Maria"));
		gente.add(new persona("743333887z", "Luis"));
		gente.add(new persona("241546887z", "Marta"));

		System.out.println(gente);

	}
}