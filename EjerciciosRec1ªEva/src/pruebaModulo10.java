
public class pruebaModulo10 {

	public static void main(String[] args) {

		int[] x = { 1, 4, 456, 845, 968, 748, 786, 852, 777, 666 };

		int unidad=0;

		for (int i = 0; i < x.length; i++) {
			unidad = x[i] % 10;

			System.out.println(i + ": " + unidad);
		}

	}

}
