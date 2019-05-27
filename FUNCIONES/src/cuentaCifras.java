import java.util.Scanner;

public class cuentaCifras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		do {

			System.out.println("Escribe un numero positivo");

			num = sc.nextInt();
		} while (num < 0);
		
		int cifras=cuentaCifras(num);
		
		
		System.out.println("Hay " + cifras + " cifras");

	}

	public static int cuentaCifras(int num) {
		
		
		int cifras=1;
		
		for (int i=num; i>=10; i/=10) {
			
			cifras++;
		}

		return cifras;

	}

}
