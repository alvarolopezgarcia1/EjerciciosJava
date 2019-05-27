package PalotesDecimal;

import java.util.*;

public class Palotes {
	
	static Scanner s = new Scanner(System.in);

	static String Palote;

	int num;

	public Palotes(String palote, int num) {
		Palote = palote;
		this.num = num;
	}

	public Palotes() {

	}

	public static void parsePalotes(int num) {

		do {
			System.out.print("Introduce un número entero positivo: ");
			num = s.nextInt();
		} while (num < 1);
		System.out.print(num + " = ");
		// Cuenta los números y calcula el reves
		int aux = num;
		int numDig = 0;
		int numReves = 0;
		while (aux > 0) {
			numReves = ((numReves * 10) + (aux % 10));
			aux /= 10;
			numDig++;
		}
		int cifra = 0;
		// Separa las cifras y escribe los palitos
		for (int i = 0; i < numDig; i++) {
			cifra = numReves % 10;
			numReves /= 10;
			for (int j = 0; j < cifra; j++) {
				System.out.print("|");
			}
			if (i < numDig - 1) {
				System.out.print("-");
			}
		}

	}

	public String getPalote() {
		return Palote;
	}

	public void setPalote(String palote) {
		Palote = palote;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
