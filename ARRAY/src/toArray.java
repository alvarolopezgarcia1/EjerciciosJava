import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class toArray {

	public static void main(String[] args) {
		ArrayList<String> milista = new ArrayList<String>();
		ArrayList<Integer> milista2 = new ArrayList<Integer>();
		
		milista.add("Elemento 1");
		milista.add("Elemento 2");
		milista.add("Elemento 3");
		milista.add("Elemento 4");

		String[] miarray = new String[milista.size()];
		miarray = milista.toArray(miarray);

		for (String s : miarray) {
			System.out.println(s);
		}
			
		for (int i=0; i<10; i++) {
			milista2.add(i+1);
		}
		
		for (Integer a: milista2) {
			
			System.out.print(a+", ");
		}
		
		ArrayList<String> milista3 = new ArrayList<String>();
		
		for(int i=0; i<miarray.length; i++) {
			
			milista3.add(miarray[i]);
		}
		
		for(String b : milista3) {
			
			System.out.print(b+", ");
		}
	
		
		
	}

}
