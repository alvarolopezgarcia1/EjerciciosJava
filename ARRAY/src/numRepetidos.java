//el usuario introduce un numero y se dice las veces que se repite un digito

import java.util.*;
public class numRepetidos {
	public static void main(String[] args) {
		Scanner linea = new Scanner(System.in);
		long n;
		System.out.print("Introduce un número:\t");
		n = linea.nextLong();
		String num = String.valueOf(n);
		for (int d = 0; d < 10; d++) {
			int rep = 0;
			for (int i = 0; i < num.length(); i++) {
				if (Integer.valueOf(String.valueOf(num.charAt(i))) == d) {
					rep++;
				}
			}
			if (rep > 0) {
				System.out.println(String.format("El número %d se repite %d %s", d, rep, (rep == 1 ? "vez" : "veces")));
			}
		}
	}
}