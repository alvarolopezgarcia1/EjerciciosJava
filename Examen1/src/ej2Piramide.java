import java.util.*;

public class ej2Piramide {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int altura;

		do {
			System.out.print("Introduzca la altura de la pirámide (entre 3 y 30): ");
			altura = s.nextInt();
		} while ((altura < 3) || (altura > 30));

		// primera parte:
		for (int i = 1; i <= altura; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// segunda parte:
		for (int i = altura - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}